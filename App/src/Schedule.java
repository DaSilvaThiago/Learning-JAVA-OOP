
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago.dsilva10
 */
public class Schedule {
    private List<Person> contacts = new ArrayList<>();
    private Person foundPerson = null;
    
    public Schedule(Person person){
        this.contacts.add(person);
    }
    
    public List getContacts(){
        return this.contacts;
    }
    
    public String getContactByName(String name){
        for(Person person : contacts){
            if(person.getName().equals(name)){
                this.foundPerson = person;
            }
        }
        if(foundPerson != null){
            return foundPerson.toString();
        }else{
            return "Person not found!";
        }
    }

    public String getWork(String work){
        List<Person> sameWork = new ArrayList<>();
        for(Person person : contacts){
            if(person.getWork().equals(work)){
                sameWork.add(person);
            }
        }
        if(!sameWork.isEmpty()){
            return sameWork.toString();
        }else{
            return "Work not found!";
        }
    }
    
    public void setContacts(Person p1){
        this.contacts.add(p1);
    }
    
        @Override
    public String toString() {
        return "Person: \r\n" + this.getContacts() + "\r\n";
    }
}
