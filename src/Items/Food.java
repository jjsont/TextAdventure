package Items;

import People.Person;

public class Food implements Uses{
    private String name;
    private int usages;


    public Food(String name, int usages) {
        this.name=name;
        this.usages=usages;

    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int numberOfUses() {
        return this.usages;
    }

    public void use(Person x) {
        this.name=name;
        x.foodHeal(20);
        x.removeFood(name);
    }




}