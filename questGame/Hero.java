class Hero extends Character implements Skills {
  //variables 
 // private int exp;
 // private int max; 
  //private int level;
  private boolean hasPotion; 
  private PotionBottle potion = new PotionBottle(); 
  private boolean isAlive; 
  
  //constructor
  public Hero(String name, int health) {
    super(name,health);
   // exp = 0;
  //max = 10;
    hasPotion =false; 
    isAlive = true; 
    
  }

 @Override
  public void attack(){
    System.out.println("The hero attacks the monster with a sword!");
  }
  
  public void attack(Monster m){
    if (m.getHealth() > 0){
    System.out.println("The hero attacks the "+ m.getName()+" with a sword!");
    m.loseHealth();
    } else {
      System.out.println("The "+ m.getName()+" whimpers and dies.");
      m.setIsAlive(false);
    }
  }
 
  public void attack(String name, Monster m){
     if (m.getHealth() > 0){
    System.out.println(name + " attacks the "+ m.getName()+" with a sword!");
    m.loseHealth();
     }else {
      System.out.println("The "+ m.getName()+" whimpers and dies.");
      m.setIsAlive(false);
    }
  }


  public void attack(String name, String monsterName, Monster m){
     if (m.getHealth() > 0){
  System.out.println(name + " attacks the" + monsterName +" with a sword!");
    m.loseHealth();
     }else {
      System.out.println("The "+ m.getName()+" whimpers and dies.");
      m.setIsAlive(false);
    }
  }

 public void setHasPotion(boolean hasPotion){
   this.hasPotion = hasPotion; 
 }

public boolean getHasPotion() {
  return this.hasPotion; 
}


public void drinkPotion(){
  if (getHasPotion()) {
  potion.drinkPotion();
    if (potion.getPotionLevel() >= 10 ){
     gainHealth(); }
  } else {
    System.out.println("You don't have a potion?!");
  }
}

     public void setIsAlive(boolean isAlive){
   this.isAlive = isAlive; 
 }

public boolean getIsAlive() {
  return this.isAlive; 
}   public String toString(){
    return "This is " + getName() +
  ", a hero."  + "Has Potion: "+ getHasPotion() + "Is alive: " + getIsAlive();
  }



}