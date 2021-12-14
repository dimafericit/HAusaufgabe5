import UI.UserInterface;
import model.Course;
import model.Student;
import repository.JDBCCourseRepository;
import repository.JDBCStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] arg) throws SQLException {
        /*
        //JDBCStudentRepository obj = new JDBCStudentRepository("jdbc:mysql://localhost:3306/university",
            //    "12345678", "root");

        List<Long> list= new ArrayList<Long>();
        Student student1 = new Student("Nicu", "Burlac", 6, list);
        //obj.create(student1);
        //obj.delete(student1);

        JDBCCourseRepository obj = new JDBCCourseRepository("jdbc:mysql://localhost:3306/university",
            "12345678", "root");
        //System.out.println(obj.getAll());

        Course course1 = new Course("Geometrie", 1L, 200, 6);
        //obj.create(course1);
        System.out.println(obj.getAll());

        Course course2 = new Course("Geometrie2", 2L, 180, 8, 10001);
        obj.update(course2);
        System.out.println(obj.getAll());

         */
        UserInterface menu = new UserInterface();
        menu.menu();
    }
}
