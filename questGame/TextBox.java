import java.util.*;

public class TextBox {
ArrayList<String[]> textBox = new ArrayList<String[]>();
  
  public TextBox(){


  

 String[] text0 = {
"------------------------------------------------",  
"A hero stands in front of a dungeon.",
   "The hero must clear out the entire dungeon in order to claim victory.",
   "Inside the dungeon are three caves.",
""
 };
  

 String[] text1 = {
  // "",
"The first cave is the smallest," ,
"it looks dim and primitive," ,
"you can hear a scurrying sound coming from within.",
""
};

String[] text2 = {
  // "",
"the second cave is strangely bright",
"you can't hear anything coming from it," , 
"but the silence feels strange and unnatural.",
""
};

 String[] text3 = {
//"",
"The last cave is the largest,",
"you can hear occasional roars and growls coming from within.",
"You can feel a sense of danger.",
   "------------------------------------------------",  
""
};

 String[] text4 = {
//"",  
"Which cave will the hero choose?" ,
"1) first cave.",
"2) second cave.",
"3) third cave.",

""
};

String[] text5 = {
 "", 
"The hero enters the first cave..." ,
"Suddenly a large rat attacks!",
""
};  

 String[] text6 = {
    "",
  "The hero enters the second cave...",
  "You see a smoothe stone room, empty except for a plaque on the back wall.",
  "You can barely make out some worn down writing it says: ",
  " ------------------------------------------ ",
  "|Answer a riddle to receive a boon.        |",
  "|                                          |",
  "|Riddle:                                   |",
  "|What single thing can fill an entire room?|",
  " ------------------------------------------ ",
  "You should speak out loud your answer: ",
   ""
};

 String[] text7 = {
  "",
  "The hero enters the third cave...",
  "Suddenly a fearsome beast attacks!"
};

 String[] text8 = {
    "---------------------------",
  "Sorry but the hero died,",
  "it's Game Over...",
   "---------------------------"
};
    
String[] text9 = {
  "------------------------------------------------",
  "Congratulations!",
  "You have cleared the dungeon and won the game!",
  "------------------------------------------------"
};

String[] text10 = {
  "**---------------Credits-------------------------**",
  "Created by Katie Greenwald",
  "With special thanks to Revature",
  "**----------------------------------------------**"
};

String[] text11 = {
"",
"There is a great flash of light, ",
"and a chime like sound rings out.",
"The words on the plaque disapear,",
"and in front of the hero floats a",
"glowing bottle of potion.The hero quickly ",
"picks it up and puts it away somewhere.",
""
};    

String[] text12 = {
"",
"There is a loud noise and the room shakes.",
"I don't think you should make another mistake.",
"But you have to try again.",
""
};    
  textBox.add(text0);
  textBox.add(text1);
  textBox.add(text2);
  textBox.add(text3);
  textBox.add(text4);
  textBox.add(text5);
  textBox.add(text6);
  textBox.add(text7);
  textBox.add(text8);
  textBox.add(text9);
  textBox.add(text10);
  textBox.add(text11);
  textBox.add(text12);  
/*
String[] text = {
  "",
  ""
};
*/
}
  
public ArrayList<String[]> getTextBox() {
  return textBox; 
}

  //transversing through collection to print strings
public void print(int textNum){
  
 //ArrayList<String[]> textBox = getTextBox();  
  
  String[] strArr =textBox.get(textNum);
  //I made a mistake where I got an out of bounds exception several times so I did a try/catch on this for loop
  //However it is annoying to see it everywhere so I commented it out
  try {
      for (int i = 0; i < /* = */ strArr.length; i++) {
       System.out.println(strArr[i]); 
       }
  /**/ }       
  catch (Exception e) {
        System.out.println("\nException caught");

    
   }
  
}
    
   
}
//have a arrayList called textbox put arrays of text/strings in
//including:
//game over message
//game completed message
//descriptions
//function takes in a number and then prints out a message using the 
//array bassed on that number


