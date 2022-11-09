import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String ciuitatem;
    protected int luck;
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

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("surname: " + getSurname());
        System.out.println("patronymic " + getPatronymic());
        System.out.println("age: " + getAge());
        System.out.println("place of ciuitatem: " + getCiuitatem());//propiska
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
            person.setLuck(person.luck + 1); // <<<
        }
        return p;
    }
}


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Masha", "Sokolova","Gregorievna", 16, "Rushia", 1);
        Person person2 = new Person("Egor", "Sokolov","Gregoriev", 25, "Canada", 1);
        Person person3 = new Person("Dima", "Sokolov","Gregoriev", 20, "Belorus", 1);

        List<Person> p = new ArrayList<>();
        p.add(person1);
        p.add(person2);
        Plane plane = new Plane(p, "Canada", "Scotland");

        plane.flight(p);
        for(int i = 0; i < p.size(); i++){
            System.out.print(p.get(i).getName() + " have luck: " +  p.get(i).getLuck());
            System.out.println();
        }

    }
}