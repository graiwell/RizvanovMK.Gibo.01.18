package rizvanov.mk.lab7;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> box = new ArrayList<String>();
        box.add("Мандарин");
        box.add("Апельсин");

        for(String t : box) System.out.println(t);

        LinkedList<String> country = new LinkedList<String>();
        country.add("США");
        country.add("Россия");
        country.add("Germany");
        country.addFirst("Ireland");
        country.addLast("China");
        country.add(1, "Ukraine");
        for (int i = 0; i < country.size(); i++)
            System.out.println(country.get(i));
        country.remove(1);
        System.out.println("///////////////\n");


        if (country.contains("China")) System.out.println("Есть такое государство");
        country.remove(0);
        country.remove("Germany");

        for (String p : country) {
            System.out.println(p);

        }
        LinkedList<Person> friends = new LinkedList<Person>();
        friends.add(new Person("Musa Rizvanov"));
        friends.add(1, new Person("Ilya"));
        friends.addFirst(new Person("Sasha"));
        friends.addLast(new Person("Khabib"));


    for(Person p : friends) System.out.println(p);
    friends.remove(1);
    for(Person p : friends) System.out.println(p);
    Person tmp = friends.getFirst();
    System.out.println(tmp);
    }
}