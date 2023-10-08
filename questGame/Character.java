 class Character {
//variables 
private String name;
private int health;

public Character(String name, int health){
  this.name = name; 
  this.health = health; 
}

  public void setName(String name){
    this.name = name;
  }

  
  public String getName(){
    return this.name;
  }
   
  public void setHealth(int health){
    this.health = health; 
  }

  public int getHealth(){
    return this.health; 
  }

  public void loseHealth(){
    int h = this.health;
    setHealth(h - 10);
    System.out.println(this.name + " loses some health!");
   } 

   public void gainHealth(){
   int h =  this.health;
    setHealth(h + 10); 
    System.out.println(this.name + " gains some health!");
   }


   
}
