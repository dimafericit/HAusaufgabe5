package controller;

import model.Student;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @org.junit.jupiter.api.Test
    void register(){
        Controller registration = new Controller();
        //student dosen't exist
        try {
            registration.register(10, 10001);
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        //course dosen't exist
        try {
            registration.register(1, 13);
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        //student already registered
        try {
            registration.register(1,1);
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        //course doesn't have any places left
        try {
            registration.register(5,6);
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        try {
            registration.register(2,6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    void retrieveStudentsEnrolledForACourse() {
        Controller registration = new Controller();
        List<Student> list= new ArrayList<Student>();
        list.add(new Student ("Dima", "Burlac", 1L));
        try {
            assertEquals(list,registration.retrieveStudentsEnrolledForACourse(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    void retrieveCoursesWithFreePlaces() {
    }

    @org.junit.jupiter.api.Test
    void sortStudents() {

}

    @org.junit.jupiter.api.Test
    void sortCourses() {
    }
}