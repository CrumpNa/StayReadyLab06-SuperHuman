package Superpower;


public class SpiderMan extends SuperHuman {

  public Spiderman(){
      //constructor 
      super("Spiderman",GOOD,"Webs");
  }


    @Override
    public SuperHuman getCatchPhrase() {
        String catchPhrase="Just your Friendly Neighborhood"; //"Spiderman" will be alias part in toString 
        return catchPhrase; 
    }

    @Override
    public SuperHuman usePower() {
        String power="Pew,pew!"; 
        return power;
    }

}