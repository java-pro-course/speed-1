import java.util.*;
class Person implements IPrintable{
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String citizenship;
    private int luck;

    public Person(String name, String surname, String patronymic, int age, String citizenship) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.citizenship = citizenship;
        this.luck = 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public int getLuck() {
        return luck;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    @Override
    public void getInfo() {
        System.out.println("Person!");
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("patronymic: " + patronymic);
        System.out.println("age: " + age);
        System.out.println("citizenship: " + citizenship);
        System.out.println("luck: " + luck);
        System.out.println("------------------------------------------");

    }
}
class Plane implements IPrintable {
    private List<Person> passengers;
    private String Place_of_departure;
    private String Place_of_stay;

    public Plane(List<Person> passengers, String place_of_departure, String place_of_stay) {
        this.passengers = passengers;
        Place_of_departure = place_of_departure;
        Place_of_stay = place_of_stay;
    }

    public List<Person> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Person> passengers) {
        this.passengers = passengers;
    }

    public String getPlace_of_departure() {
        return Place_of_departure;
    }

    public void setPlace_of_departure(String place_of_departure) {
        Place_of_departure = place_of_departure;
    }

    public String getPlace_of_stay() {
        return Place_of_stay;
    }

    public void setPlace_of_stay(String place_of_stay) {
        Place_of_stay = place_of_stay;
    }
    @Override
    public void getInfo() {
        System.out.println("Plane!");
        System.out.println("passengers: " + passengers);
        System.out.println("Place_of_departure: " + Place_of_departure);
        System.out.println("Place_of_stay: " + Place_of_stay);
        System.out.println("------------------------------------------");

    }

    public void flight(List<Person> passengers){
// искренне не понимаю, почему не работает(
// беды у меня с такими листами в джава, как в примере на занятии понятно всё, а вот с объектами не получается
//        passengers.set(passengers.size() - 1, passengers.get(passengers.size() - 1) + 1);
    }
}

interface IPrintable {
    void getInfo();
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Roma", "Ivanov", "Petrovich", 21, "Rus");
        Person person2 = new Person("Egor", "Romanov", "Pavlovich", 30, "Rus");
        Person person3 = new Person("Olya", "Smirnova", "Nikolaevna", 25, "Rus");
        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
        List<Person> person = new ArrayList<>();
        person.add(person1);
        person.add(person2);
        Plane plane1 = new Plane(person, "Moscow", "Kazan");
        plane1.getInfo();
    }
}

