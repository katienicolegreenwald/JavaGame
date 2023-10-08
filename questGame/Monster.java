
class Monster extends Character implements Skills {
  //isAlive ?
  private boolean isAlive; 

  TextBox textBox = new TextBox(); 
  
  //constructor
  public Monster (String name, int health){
    super(name,health);
    isAlive = true; 
  }

  @Override
  public void attack(){
    System.out.println("The monster bites and claws at the hero!");
  }

   public void attack(Hero h){
     if (h.getHealth() > 0){
    System.out.println("The monster bites and claws at "+ h.getName() +"!");
    h.loseHealth();
         } else {
    textBox.print(8); 
  }
  }
 
  public void attack(String name, Hero h){
    if (h.getHealth() > 0){
    System.out.println(name + " attacks "+ h.getName()+ " with teeth and claws!");
    h.loseHealth();
        } else {
    textBox.print(8); 
  }
  }


  public void attack(String name, String heroName, Hero h){
  if (h.getHealth() > 0){
  System.out.println(name + " attacks the" + heroName +" with teeth and claws!");
    h.loseHealth();
  } else {
    h.setIsAlive(false);
    textBox.print(8); 
  }
    
  }
  
  public void setIsAlive(boolean isAlive){
   this.isAlive = isAlive; 
 }

public boolean getIsAlive() {
  return isAlive; 
}
      public String toString(){
    return "This is a " + getName() +
            " monster." + "Is alive: " + getIsAlive();
  }
  
}