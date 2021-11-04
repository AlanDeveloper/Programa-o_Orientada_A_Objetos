import java.util.ArrayList;

public class Group implements Comparable<Group>{
    private String name;
    private ArrayList<Person> contacts;

    Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getContacts() {
        return contacts;
    }

    public void addPerson(Person person) {
        this.contacts.add(person);
    }

    @Override
    public int compareTo(Group group) {
        return name.compareTo(group.name);
    }
}
