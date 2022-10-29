import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Doe", "John", "Patrick", 35, "Canada", 1);
        Person person2 = new Person("Gallagher", "Jane", "Donald", 27, "USA", 1);
        Person person3 = new Person("Ivanov", "Ivan", "Ivanovich", 40, "Russia", 1);

        person1.getInfo();
        person2.getInfo();
        person3.getInfo();

        System.out.println();

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        Plane plane1 = new Plane(personList, "USA", "Canada");
        plane1.flight(personList);
        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
    }
    public static Scanner in = new Scanner(System.in);

}

class Person{
    String surname;
    String name;
    String middleName;
    int age;
    String country;
    int luck = 1;

    Person(String surname, String name, String middleName, int age, String country, int luck){
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
        this.country = country;
        this.luck = luck;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getLuck() {
        return luck;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void getInfo(){
        System.out.println("Name: " + name + "; "  + "Surname: " + surname + "; " + "Middle name: " + middleName + "; "
                + "Age: " + age + "; "  + "Country: " + country + "; " + "Luck: " + luck);
    }
}

class Plane {
    List<Person> personList;
   String placeOfDeparture;
    String placeOfArrival;

    Plane(List<Person> personList, String placeOfDeparture, String placeOfArrival){
        this.personList = personList;
        this.placeOfDeparture = placeOfDeparture;
        this.placeOfArrival = placeOfArrival;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public void setPlaceOfArrival(String placeOfArrival) {
        this.placeOfArrival = placeOfArrival;
    }

    public List<Person> flight(List<Person> personList){
        for (Person person: personList ) {
            person.setLuck(person.luck += 1);
        }
        
        return personList;
    }
}
