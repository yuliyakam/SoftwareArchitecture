package FactoryMethodPattern;

public class GenMilkProd implements GeneratorProduct{
    @Override
    public Product createProduct() {
        return new MilkProduct();
    }
}
