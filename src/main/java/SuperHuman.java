package Superpowers;
 import java.lang.Enum;

public class SuperHuman extends Human {//bc SuperHuman is a subclass of Human 

    private String alias; 
    private Affiliation affiliation; 
    private String ability;
    private String power;
    private String phrase; 


    public SuperHuman(String alias,Affiliation affiliation,String ability,String power,String name, int id, LocalDate dateOfBirth, String gender, String occupation){
        super(id,name,dateOfBirth,gender,occupation); //importing from human
        this.alias=alias;
        this.affiliation=affiliation; 
        this.ability=ability; 
        this.power=power;
        this.phrase=phrase;
    }
    

	//getters 
    public String getAlias(){
        return alias; 
    }

    public Affiliation getAffiliation(){
        return affiliation;
    }

    public String getAbility(){
        return ability; 
    }
     
    //setters 
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setAffiliation(String aff) {
        this.affiliation = aff;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setPhrase(String phrase){
        this.phrase=phrase; 
        
    }

    private String getPhrase(){
      return phrase;
    } 

    
    public String setPower(String power){
        this.power=power;
        return power; 
    }


    public String getPower(){

        return power; 
    }
    
    public String catchPhrase(){
        return getPhrase();
    }

    public String usePower(){
        return getPhrase() + " ,"+ getPower(); 
    }


    @Override
    public String toString(){
        return catchphrase +" "+ alias + " " +power+ " "+ affiliation+ " "+ ability; 
    }
}    