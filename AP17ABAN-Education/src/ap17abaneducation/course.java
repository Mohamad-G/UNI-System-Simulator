/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ap17abaneducation;

import java.util.Scanner;

/**
 *
 * @author Mohsen
 */
public class course {

    String id;
    String name;
    group g;
    int unit;
    teacher t;
    student[] stu = new student[100];
    int num_of_students;
    //course [] prerequest=new course[3];
    String[] prerequest = new String[3];
    int num_of_prerequest;

    public course(String name, String id, group g, int unit) {
        this.name = name;
        this.id = id;
        this.g = g;
        this.unit = unit;
        num_of_prerequest = 0;
        num_of_students = 0;
    }
    Scanner sc = new Scanner(System.in);

    public void setprerequest() {
        int num = 0;
        for (int i = 0; i < 3; i++) {
            if (prerequest[i].equals(null)) {
                num++;
            }
        }
        if (num < 3) {
            System.out.println("Enter the list id of the course you demand");
            String tempid = sc.next();
            for (int i = 0; i < 3; i++) {
                if (prerequest[i].equals(null)) {
                    prerequest[i] = tempid;
                    break;
                //num_of_prerequest++;

                }
            }

        } else {
            System.out.println("Error in defining pre-request");
        }
    }

    public void remove_prerequest() {
        for (int i = 0; i < 3; i++) {
            if (!prerequest[i].equals(null)) {
                System.out.println("Prerequisite course is: " + prerequest[i]);
            }
        }
        System.out.println("Please enter the id of the course you want to remove from the prerequisite list:");
        String tempid = sc.next();
        for (int i = 0; i < 3; i++) {
            if (prerequest[i].equals(tempid)) {
                prerequest[i] = null;
                System.out.println("The prerequesite with id " + tempid + " is removed");
            }
        }
    }

    public boolean controlpre(student s) {
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < 3; i++) {
            if (!prerequest[i].equals(null)) {
                counter2++;
            }
        }
        if (counter2 == 0) {
            return true;
        } else {
            for (int i = 0; i < 3; i++) {
                if (!prerequest[i].equals(null)) {
                    for (int j = 0; j < s.passed.length; j++) {
                        if (s.passed[j].id.equals(prerequest[i])) {
                            counter++;
                        }
                    }
                }
            }
            if (counter == counter2) {
                return true;
            } else {
                return false;
            }
        }

    }

    public void registerstudent(student s) {
        if (num_of_students < 100) {

            //Controlling the prerequisites
            if (controlpre(s)) {
                stu[num_of_students] = s;
                num_of_students++;
                System.out.print("Registering student " + s.name + " with id= " + s.ID + " in the course " + name + " was successfully done!");
            }else{
                System.out.println("Error!!! Prerequisite condition is ignored!!");
            }

        } else {
            System.out.println("The limitation of the number of students is exeeded");
        }

    }

    public void removestudent(student s) {
        //
    }
}
