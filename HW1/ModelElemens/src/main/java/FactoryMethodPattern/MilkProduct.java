package FactoryMethodPattern;

public class MilkProduct implements Product{
    private int cost;
    private String name;


    @Override
    public String toString() {
        return "MilkProduct create";
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
