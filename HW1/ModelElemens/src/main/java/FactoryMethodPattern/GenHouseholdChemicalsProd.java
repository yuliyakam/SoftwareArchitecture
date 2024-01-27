package FactoryMethodPattern;

public class GenHouseholdChemicalsProd implements GeneratorProduct{
    @Override
    public Product createProduct() {
        return new HouseholdChemicalsProduct();
    }
}
