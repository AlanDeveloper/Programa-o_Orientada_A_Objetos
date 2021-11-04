import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Agenda {
    private final ArrayList<Person> persons;
    private final ArrayList<Group> groups;

    Agenda() {
        this.persons = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.persons.add(person);
        Collections.sort(this.persons);
    }

    public void addGroup(Group group) {
        this.groups.add(group);
        Collections.sort(this.groups);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public void removeGroup(Group group) {
        this.groups.remove(group);
    }

    public Person getPerson(Integer index) {
        return this.persons.get(index);
    }

    public Group getGroup(Integer index) {
        return this.groups.get(index);
    }

    public void listPersons() {
        for (Person person : this.persons) {
            System.out.println(person.getName() + " " + person.getBirth_date() + " " + person.getTelephone());
        }
    }

    public void listGroups() {
        for (Group group : this.groups) {
            System.out.println(group.getName());
            for (int j = 0; j < group.getContacts().size(); j++) {
                System.out.println(group.getContacts().get(j).getName() + " " + group.getContacts().get(j).getBirth_date() + " " + group.getContacts().get(j).getTelephone());
            }
        }
    }

    public Person getForNamePerson(String name) {
        for (Person person : this.persons) {
            if (Objects.equals(person.getName(), name)) return person;
        }
        return null;
    }

    public Group getForNameGroup(String name) {
        for (Group group : this.groups) {
            if (Objects.equals(group.getName(), name)) return group;
        }
        return null;
    }
}
