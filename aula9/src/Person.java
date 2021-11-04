import java.util.Calendar;
import java.util.Date;

public class Person implements Comparable<Person>{
    private String name, telephone;
    private Calendar birth_date;

    Person(String name, Integer year, Integer month, Integer day, String telephone) {
        this.name = name;
        this.birth_date = Calendar.getInstance();
        this.telephone = telephone;

        this.birth_date.set(Calendar.YEAR, year);
        this.birth_date.set(Calendar.MONTH, month);
        this.birth_date.set(Calendar.DAY_OF_MONTH, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirth_date() {
        return birth_date.getTime();
    }

    public void setBirth_date(Integer year, Integer month, Integer day) {
        this.birth_date.set(Calendar.YEAR, year);
        this.birth_date.set(Calendar.MONTH, month);
        this.birth_date.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}
