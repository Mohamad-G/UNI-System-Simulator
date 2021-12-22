/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ap17abaneducation;

/**
 *
 * @author Mohsen
 */
public class Human {
    String name;
    String lastname;
    String NationalID;
    String ID;
    String phnum;
    String Address;
    boolean active;
    public Human(String name,String lastname,String NationalID, String ID, String phnum,String Address){
        this.name=name;
        this.lastname=lastname;
        this.NationalID=NationalID;
        this.ID=ID;
        this.phnum=phnum;
        this.Address=Address;
    }
    public void activate(){
        active=true;
    }
    public void deactivate(){
        active=false;
    }
    public boolean isactive(){ //?
       return active; 
    }
}
