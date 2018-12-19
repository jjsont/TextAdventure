package Items;
import People.Person;

//Interface that items will use
public interface Uses {
    String getName();
    int numberOfUses();
    void use(Person x);
}
