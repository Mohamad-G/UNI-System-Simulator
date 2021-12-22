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
public class student extends Human{
    group g;
    course [] passed=new course[80];
    course [] fallen=new course[40];
    public student(String name, String lastname,String NationalID,String ID,String phnum,String Address){
        super(name, lastname, NationalID, ID, phnum, Address);
    }
    public void setgroup(group g){
        this.g=g;
    }
    public void activate(){
        super.activate();
    }
    public void deactivate(){
        super.deactivate();
    }
    
    public boolean isactive(){
        return this.active;
    }
    Scanner sc=new Scanner(System.in);
    public void unitselection(term t){
        if(g!=null){
            t.show_courses(g);
            int temp=0;
            System.out.println("Please enter the number relating to the course you want to take!?");
            temp=sc.nextInt();
            t.co[temp].registerstudent(this);
        }else{
            System.out.println("The student is not registered completely!!");
        }
        
    }
}
