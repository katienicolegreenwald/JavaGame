import java.util.*;

public class Caves {

   public Caves(){
     
   }

  TextBox textBox = new TextBox();
   Scanner sc = new Scanner(System.in);
  
    
// Cave A
// has monster A
// kills then check if, monster B dead if yes you win the game
//if B not dead check if have potion, if yes go to C
// if no ask where to go B or C
public void caveA(Hero hero, Monster monster, Monster monster2){
  boolean isMon2Alive = monster2.getIsAlive();
  boolean hasPotion = hero.getHasPotion(); 
  textBox.print(5); 
  
  hero.attack(monster);
  System.out.println();
  hero.attack(monster);
  System.out.println();
  monster.attack(hero);
  System.out.println();
  hero.attack(monster);
  System.out.println();
  hero.attack(monster);
  System.out.println();
  hero.attack(monster);
  System.out.println();
  hero.attack(monster);
  System.out.println();
  
  if(!isMon2Alive){
    textBox.print(9);
    System.out.println();
     textBox.print(10); 
  } else if (hasPotion){
    //go to C
    caveC(hero, monster, monster2);
  } else {
    // if no ask where to go B or C
    System.out.println("Where to next, the second or third cave?:");
    System.out.println();
    
   int option = sc.nextInt(); 
   
    if(option == 2) {
      caveB(hero, monster, monster2);
    }else if (option == 3){
      caveC(hero, monster, monster2);
    } else {
      System.out.println();
        System.out.println("I'm sorry? I don't understand what you are saying...Oh no.");
        System.out.println();
        textBox.print(8);
    }
      sc.close();  
  }
  
}
  
  // Cave B
//repeats until you solve riddle
//if solved check if monster A dead if true go to cave C if not
// ask if go to cave A or Cave C
  public void caveB(Hero hero, Monster monster, 
                               Monster monster2){
    boolean fact = true; 
    int     tries = 0;
  
    
    textBox.print(6);
    
    while (fact) {
     String option = sc.nextLine().toLowerCase(); 
     
  if (option.equals("fire")    ||
      option.equals("light")   ||
      option.equals("candle") ||
      option.equals("lamp")  
     ){
     textBox.print(11); 
     hero.setHasPotion(true);
     fact = false;  
     } else {
    textBox.print(12);
        if (tries > 2){
        System.out.println("However just as you are going to try a fourth time suddenly!");
        System.out.println("Things go black and there is a crushing sound...");
          System.out.println();
        textBox.print(8);
       fact = false;   
      }
      
      tries++; 

     }
      
    
    } //end while loop

    
// ask if go to cave A or Cave C
    //check if solved
    boolean hasPot = hero.getHasPotion();
    boolean monLive = monster.getIsAlive();
    if (hasPot){
 //check if monster A dead 
      if(!monLive){
      //if true go to cave C 
        System.out.println("Only one place left.");
        caveC(hero, monster, monster2);
      } else { //if not dead ask where to go next
        System.out.println("Where to next, the first or third cave?:");
    System.out.println();
    
   int option = sc.nextInt(); 
   
    if(option == 1) {
      caveA(hero, monster, monster2);
    }else if (option == 3){
      caveC(hero, monster, monster2);
    } else {
      System.out.println();
        System.out.println("I'm sorry? I don't understand what you are saying...Oh no.");
        System.out.println();
        textBox.print(8);
    }
      sc.close();  
      }
    
    }
  }

// Cave C
//check if have potion, if no game over, if yes kill monster B
// check if monster A dead if no go to Cave A, if yes you win the game
  public void caveC(Hero hero, Monster monster,
                               Monster monster2){
    textBox.print(7);
    System.out.println();

    for(int i = 0; i < 7; i++) {
    hero.attack(monster2);
   // System.out.println(monster2.getHealth()); //
    System.out.println();
    monster2.attack(hero);
   // System.out.println(hero.getHealth()); //
    System.out.println();
    }
//check if have potion, if no game over, if yes kill monster B
    if(hero.getHasPotion()){
           System.out.println("The hero remembers that the potion exists. It is quickly taken out and drunk.");
      for(int i = 0; i < 11; i++) {
      hero.drinkPotion();
      //System.out.println(hero.getHealth()); //
      }
       System.out.println();
        for(int i = 0; i < 3; i++) {
    hero.attack(monster2);
    System.out.println();
    monster2.attack(hero);
    System.out.println();
    }
    monster2.setHealth(-1);
    monster2.attack(hero);
    System.out.println();  
    hero.attack(monster2);
    System.out.println(); 

    // check if monster A dead if no go to Cave A, if yes you win the game
          if(monster.getIsAlive()){
      //if true go to cave C 
        System.out.println("Only one place left.");
        caveA(hero, monster, monster2);
      } 
      else {
    textBox.print(9);
    System.out.println();
     textBox.print(10); 
      }
    }
    else{
      hero.setHealth(0);
      System.out.println("The hero  unfortunately  slips and falls");
      System.out.println("and the Beast is quick to take advantage.");
      System.out.println();
      monster2.attack(hero);
     // System.out.println(hero.getHealth()); //
    }

     sc.close();  
  } 

}