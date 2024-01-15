package logic.components;

import java.util.Objects;

public class Food {
    private  String name;
    private  int price;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.max(price,1);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(energy,1);
    }

    public Food(String name, int price, int energy) {
        this.setName(name);
        this.setEnergy(energy);
        this.setPrice(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        return getPrice() == food.getPrice() && getEnergy() == food.getEnergy() && Objects.equals(getName(), food.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getEnergy());
    }
}
