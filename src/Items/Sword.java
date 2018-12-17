package Items;

public class Sword implements Uses{
    private String name;
    private int usages;


    public Sword(String name, int usages) {
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