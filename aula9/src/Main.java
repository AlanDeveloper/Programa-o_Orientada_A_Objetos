public class Main {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        Person alan = new Person("Alan", 2001, 1, 17, "99123-6244");

        Person carol = new Person("Carol", 2005, 12, 30, "99108-8808");
        Group escola = new Group("Escola");
        escola.addPerson(carol);

        a.addPerson(alan);
        a.listPersons();

        a.addGroup(escola);
        a.listGroups();

        a.removePerson(alan);
        a.listPersons();

        a.removeGroup(escola);
        a.listGroups();

        System.out.println("----------Lista de contatos----------");
        a.addPerson(carol);
        a.addPerson(alan);
        System.out.println(a.getForNamePerson("Carol").getName());
        a.listPersons();

        System.out.println("----------Lista de grupos----------");
        Group facul = new Group("Faculdade");
        a.addGroup(facul);
        a.addGroup(escola);
        a.listGroups();
    }
}
