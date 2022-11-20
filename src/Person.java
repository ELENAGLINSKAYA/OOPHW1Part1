
public class Person {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    Person(String name, String town, int yearOfBirth,String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }
    void getAcquainted(){
        System.out.println("Привет меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году " + " Я работаю на должности " + jobTitle + " Будем знакомы!");
    }}