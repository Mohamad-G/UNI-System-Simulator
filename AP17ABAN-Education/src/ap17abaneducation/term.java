/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ap17abaneducation;

/**
 *
 * @author Mohsen
 */
public class term {

    String id;
    int max_taken_units;
    int normal_taken_units;
    int fallen_taken_units;
    course[] co = new course[2000];
    int num_of_courses;

    public term(String id, int max_taken_units, int normal_taken_units, int fallen_taken_units) {
        this.id = id;
        this.max_taken_units = max_taken_units;
        this.normal_taken_units = normal_taken_units;
        this.fallen_taken_units = fallen_taken_units;
        num_of_courses = 0;
    }

    public void define_course(group g) {
        co[num_of_courses] = new course("Project", "1430", g, 3);
        num_of_courses++;
        System.out.println("The course was defined!");

    }

    public void show_courses(group p) {
        for (int i = 0; i < num_of_courses; i++) {
            if (co[i].g==p) {
                System.out.println("The course number " + i + " is --> " + co[i].name + " is related to group --> " + co[i].g.name);
            }
        }
    }
}
