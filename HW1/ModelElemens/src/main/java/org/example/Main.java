package org.example;

import FactoryMethodPattern.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<GeneratorProduct> fabricList = new ArrayList<>();
        fabricList.add(new GenHouseholdChemicalsProd());
        fabricList.add(new GenMilkProd());
        createAndGetCost(fabricList);
    }
    static void createAndGetCost(List<GeneratorProduct> fabricList){
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 5; i++) {
            Product fabric = fabricList.get(Math.abs(rnd.nextInt() % fabricList.size())).createProduct();
            System.out.println(fabric);
        }
    }
}