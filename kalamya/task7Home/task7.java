import java.util.ArrayList;
import java.util.List;

class Person implements IPrintable  {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String ciuitatem;
    protected int luck;  // чем отличается protected от привата?
    // /\
    // || ??
    public Person(String name, String surname, String patronymic, int age, String ciuitatem, int luck){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.ciuitatem = ciuitatem;
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public String getCiuitatem() {
        return ciuitatem;
    }
    public int getLuck(){
        return luck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCiuitatem(String ciuitatem) {
        this.ciuitatem = ciuitatem;
    }
    public void setLuck(int luck){
        this.luck = luck;
    }
@Override
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("surname: " + getSurname());
        System.out.println("patronymic " + getPatronymic());
        System.out.println("age: " + getAge());
        System.out.println("place of ciuitatem: " + getCiuitatem());//propiska
        System.out.println("luck: " + getLuck());
    }
}
class Plane {
    private List<Person> passajir;
    private  String placeDeparture;
    private String placeArrival;


    public  Plane(List<Person> passajir, String placeDeparture, String placeArrival){
        this.passajir = passajir;
        this.placeDeparture = placeDeparture;
        this.placeArrival = placeArrival;
    }

    public List<Person> getPassajir() {
        return passajir;
    }

    public void setPassajir(List<Person> passajir) {
        this.passajir = passajir;
    }

    public String getPlaceDeparture() {
        return placeDeparture;
    }

    public void setPlaceDeparture(String placeDeparture) {
        this.placeDeparture = placeDeparture;
    }
    public  String getPlaceArrival(){
        return placeArrival;
    }
    public void setPlaceArrival(String placeArrival){
        this.placeArrival = placeArrival;
    }
    public List<Person> flight(List<Person> p){
        for (Person person : p){
            person.setLuck(person.luck += 1); // <<< тут должна быть ошибка в luck если приватное
        }
        return p;
    }
}

interface IPrintable{
    void getInfo();
}


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Masha", "Sokolova","Gregorievna", 16, "Rushia", 1);
        Person person2 = new Person("Gena", "Sokolova","Gregorievna", 16, "Rushia", 1);
        Person person3 = new Person("Misha", "Sokolova","Gregorievna", 16, "Rushia", 1);

        List<Person> passajir = new ArrayList<>();

        passajir.add(person1);
        passajir.add(person2);
        Plane plane = new Plane(passajir, "USA", "Nigeria");

        plane.flight(passajir);

        getInfoPas(passajir);

    }
    public static void getInfoPas(List<Person> p){
        for(Person person : p){
            person.getInfo();
            System.out.println("------------------");
        }
    }
}
