/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ap17abaneducation;

/**
 *
 * @author Mohsen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s=new student("Ali", "Rahmani", "380", "14009877", "09182233", "Sanandaj");
        group g=new group("Computer", "761");
        s.setgroup(g);
        System.out.println(s.g.name);
        System.out.println(s.NationalID);
    }

}
