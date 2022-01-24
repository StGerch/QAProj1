package com.company;

import com.company.Products.Products;
import com.company.enums.ProductsCategories;

import java.util.Locale;


public class Main {

    public static int CountWithSameCategory(Products []mas1,ProductsCategories PC){
        int counter=0;
        for(int i=0;i<mas1.length;i++){
            if(mas1[i].getCategory()==PC){
                counter++;
            }
        }
        return counter;
    }

    public static void Show2DimensionMasProducts(Products[] []mas){
        for(int i=0;i<mas.length;i++){
            System.out.println("\nПродукты категории "+i);
            for(int j=0;j<mas[i].length;j++){
                System.out.println(mas[i][j].toString());
            }
        }
    }

    public static int CounterProductsPriceLower(Products []mas1, float maxPrice){
        int counter=0;
        for(int i=0;i<mas1.length;i++){
            if(mas1[i].getPrice()<maxPrice){
                counter++;
            }
        }
        return counter;
    }

    public static int CounterProductsPriceLower(Products[]mas1){
        return CounterProductsPriceLower(mas1,100f);
    }

    public static void SetMasWith3Categories(Products[][]mas2,Products[]mas1,
                                      ProductsCategories PC1,
                                      ProductsCategories PC2,
                                      ProductsCategories PC3){
        int jForProducts2;
        ProductsCategories []masForNeededCategories={PC1,PC2,PC3};
        for(int i=0;i<3;i++){
            jForProducts2=0;
            mas2[i]=new Products[CountWithSameCategory(mas1,masForNeededCategories[i])];
            for(int j=0;j<mas1.length;j++){
                if(mas1[j].getCategory()==masForNeededCategories[i]){
                    mas2[i][jForProducts2]=new Products(mas1[j]);
                    jForProducts2++;
                }
            }
        }
        //Show2DimensionMasProducts(mas2);
    }

    public static int CounterProductsWithWord(Products []mas1,String word){
        int counter=0;
        for(int i=0;i< mas1.length;i++){
            if(mas1[i].getName().toLowerCase().contains(word.toLowerCase())){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int counterForProducts1=10;
        Products[] products1=new Products[counterForProducts1];
        products1[0]=new Products("Great Kharkiv milk",30f, ProductsCategories.Молочные);
        products1[1]=new Products("Chicken breast",150.5f, ProductsCategories.Мясо);
        products1[2]=new Products("Salmon",250.15f, ProductsCategories.Рыба);
        products1[3]=new Products("Yogurt",15.4f, ProductsCategories.Молочные);
        products1[4]=new Products("Great apple juice",28.4f, ProductsCategories.Напитки);
        products1[5]=new Products("Chicken hearts",150.45f, ProductsCategories.Мясо);
        products1[6]=new Products("Cow tongue",124.70f, ProductsCategories.Мясо);
        products1[7]=new Products("Cheese",19.45f, ProductsCategories.Молочные);
        products1[8]=new Products("Green",10.26f, ProductsCategories.Зелень);
        products1[9]=new Products("Wine",90.50f, ProductsCategories.Алкоголь);
        for(int i=0;i<counterForProducts1;i++){
            System.out.println(products1[i]);
        }


        Products [][]products2=new Products[3][];
        SetMasWith3Categories(products2,products1,ProductsCategories.Молочные,ProductsCategories.Мясо,ProductsCategories.Алкоголь);
        Show2DimensionMasProducts(products2);
        System.out.println("\nCount of Products with price lower 100 is "+ CounterProductsPriceLower(products1));
        System.out.println("\nCount of Products with word 'great' in name is "+CounterProductsWithWord(products1,"great"));
    }
}
