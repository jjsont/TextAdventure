package Items;

import People.Person;

public class Torch implements Uses{
    private String name;
    private int usages;


    public Torch(String name, int usages) {
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

    @Override
    public void use(Person x) {
        x.removeTorch(name);
    }
}
