package UI;

import controller.Controller;
import model.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {


    /**
     * function that prints the options
     */
    public void  printMenu(){
        System.out.println("""
                1.Sort Courses\s
                2.Sort Students\s
                3.Filter Courses\s
                4.Filter Students\s
                5.Courses with free places\s
                6.Students enrolled for a course\s
                7.show Courses\s
                8.show Students\s
                9.register\s
                10.add Student\s
                0.Exit\s
                """);
    }

    /**
     * menu for the registration system
     */
    public void menu() throws SQLException {
        //we create a Controller Instance and read the data
        Controller registru = new Controller();
        printMenu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wahlen Sie bitte eine Option:");
        int input = keyboard.nextInt();
        //loop until input = 0, 0 is the exit option
        while (input != 0){
            if (input == 1){
                registru.sortCourses();
            }
            else if (input == 2){
                registru.sortStudents();
            }
            else if (input == 3){
                this.filterCourses(registru);
            }
            else if(input == 4){
                this.filterStudents(registru);
            }
            else if (input == 5){
                System.out.println(registru.retrieveCoursesWithFreePlaces());
            }
            else if (input == 6){
                this.studentenrolledforcourse(registru);
            }
            else if (input == 7){
                registru.printCourses();
            }
            else if (input == 8){
                registru.printStudents();
            }
            else if (input == 9){
                this.register(registru);
            }
            else if (input == 10){
                this.add_Student(registru);
            }
            //choose another option
            System.out.print("Wahlen Sie bitte eine Option: ");
            input = keyboard.nextInt();

        }
    }

    public void filterCourses(Controller registru) throws SQLException {
        System.out.println(registru.filterCourses());
    }

    public void filterStudents(Controller registru) throws SQLException {
        System.out.println(registru.filterStudents());
    }

    public void studentenrolledforcourse(Controller registru) throws SQLException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter course id");
        long input = keyboard.nextLong();

        System.out.println(registru.retrieveStudentsEnrolledForACourse(input));
    }

    /**
     * we read the ids for the student and course
     * and call the register method
     * @param registru Controller object
     */
    public void register(Controller registru){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter course id");
        long cursId = keyboard.nextLong();

        System.out.println("Enter student id");
        long studentId = keyboard.nextLong();

        try {
            registru.register(cursId, studentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add_Student(Controller registru) throws SQLException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter id");
        long studentId = keyboard.nextLong();

        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Enter firstname");
        String firstname = keyboard1.nextLine();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Enter lastname");
        String lastname = keyboard2.nextLine();

        registru.addStudent(new Student(firstname, lastname, studentId));


    }

}
