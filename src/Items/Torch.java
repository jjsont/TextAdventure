package Items;

public class Torch implements Uses{
    private String name;
    private int usages;


    public Torch(String name) {
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
