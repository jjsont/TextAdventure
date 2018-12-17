package Items;

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
}