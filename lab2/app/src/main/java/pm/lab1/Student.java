package pm.lab1;

/**
 * Created by Paweł Głogowski on 2017-03-14.
 */

public class Student {
    private String name;
    private String surname;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String toString(){

        return this.name+" "+this.surname;
    }
}
