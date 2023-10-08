public class PotionBottle{
  private int potionLevel;
  
  public PotionBottle(){
    potionLevel = 100;
  }

public void drinkPotion(){
  if (potionLevel == 0){
    System.out.println("There is no more potion!");
  }
  else if (potionLevel < 10){
    System.out.println("There is barely enough for a sip");
    potionLevel = 0;
  }
  else{
    System.out.println("Drank a mouthful, so bitter!");
    potionLevel -= 10;
  }
  
}
  public void check(){
  System.out.println("The potion has " + potionLevel + "% left ");
}

  public int getPotionLevel(){
    return potionLevel; 
  }
  public void setPotionLevel(int level){
    this.potionLevel = level; 
  }
  
}