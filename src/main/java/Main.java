import java.time.LocalDate;

//import org.junit.Assert;
// import org.junit.Test;

import Superpowers.Human;
import Superpowers.SuperHuman;

public class Main {

 public void main(String args[]){
    
    int id = 001;
    String name = "Peter Parker";
    LocalDate dateOfBirth = LocalDate.now(); // today's date
    String gender = "Male";
    String occupation = "Photographer";
     Human h=new Human(name,id,dateOfBirth,gender,occupation); 
    String alias = "Spiderman";
    String ability = "Pew, pew!";
    String phrase = "Just your Friendly Neighborhood Spiderman";
    Affiliation affiliation = GOOD;
    String power="Web Powers"; 
    SuperHuman sh= new SuperHuman(name,id,dateOfBirth,gender,occupation, alias,ability,phrase,affilation,power); 
    System.out.print(sh.getAlias()); 
    System.out.print(sh.getAbility()); 
    System.out.print(h.getName());
    }
}