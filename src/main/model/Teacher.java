package model;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Course> course;
    private long idteacher;

    public Teacher(String name, String vorname, int id){
        super(name, vorname);
        this.course = new ArrayList<>();
        this.idteacher = id;
    }

    public long getIdteacher() {
        return idteacher;
    }
}
