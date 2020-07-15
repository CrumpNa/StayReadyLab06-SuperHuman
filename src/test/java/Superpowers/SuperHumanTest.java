package main.java; 

import org.junit.Assert;
import org.junit.Test;
public class SuperHumanTest {

    @Test
    public void constructorTest(){
        String expectedAlias = "Spiderman";
        String expectedPower = "Web Powers";
        Integer expectedAge = 15;


        String expectedString = expectedName + " " + expectedAlias + " " + expectedAge;

        Assert.assertTrue(expectedString.equals(sh.toString()));
    }

    @Test 
    public void aliasTest(){
    SuperHuman sh= new SuperHuman();//arguments ); 

    String expectedAlias="Spiderman"; 

    String actualAlias=sh.getAlias();

    Assert.assertTrue(expectedAlias.equals(actualAlias));
}

    
    @Test 
    public void affiliationTest(){
    SuperHuman sh= new SuperHuman(); 

    Affiliation expectedAff= GOOD; 

    Affiliation actualAff= sh. getAffiliaton(); 
    Assert.assertTrue(expectedAff.equals(actualAff));
    }

    @Test 
    public void abilityTest(){
    SuperHuman sh=new SuperHuman();
    String expectedAbility= "Web Powers"; 
    String actualAbility= sh.getAbility(); 
    Assert.assertTrue(expectedAbility.equals(actualAbility)); 
    }

    @Test
    public void catchPhraseTest(){
    SuperHuman sh=new SuperHuman();
    String expectedPhrase= "Just your Friendly Neighborhood Spiderman"; 
    String actualPhrase=sh.getCatchPhrase(); 

    Assert.assertTrue(expectedPhrase.equals(actualPhrase));




    }
    


}