import java.util.ArrayList;
import java.util.List;


class Person {
    private String surname;
    private String name;
    private String sName;
    private int age;
    private String country;
    private int luck = 1;

    public Person(String surname, String name, String sName, int age, String country) {
        this.surname = surname;
        this.name = name;
        this.sName = sName;
        this.age = age;
        this.country = country;
    }

    public void getInfo(){
        System.out.println("vvv~Person~vvv");
        System.out.println("Surname: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("Second name: " + getsName());
        System.out.println("Age: " + getAge());
        System.out.println("Country: " + getCountry());
        System.out.println("Luckiness value: " + getLuck());
        System.out.println();
    }
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getsName() {
        return sName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getLuck() {
        return luck ;
    }

    public void setLuck(int a) {
        this.luck += a;
    }
}

class Plane {
    private List<Person> list;
    private String from;
    private String to;


    public Plane(List<Person> list, String from, String to) {
        this.list = list;
        this.from = from;
        this.to = to;
    }


    public List<Person> getList() {
        return list;
    }

    public static void flight(List<Person> list){
        System.out.println("On the plane~v");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setLuck(1);
            list.get(i).getInfo();
        }
        System.out.println();
        System.out.println("Others~v");
    }

}
public class task6 {
    public static void main(String[] args) {
        Person person1 = new Person("Иванько", "Иван", "Иванов", 18, "Россия");
        Person person2 = new Person("Сергиенко", "Пётр", "Владиславович", 23, "Россия");
        Person person3 = new Person("Яковлева", "Ярослава", "Ярославовна", 34, "Россия");

        List<Person> list = new ArrayList<Person>();
        list.add(person2);
        list.add(person3);

        Plane plane = new Plane(list, "Москва", "Санкт-Петербург");

        Plane.flight(plane.getList());
        person1.getInfo();
    }
}