import java.util.*;

// This is going to be a short text adventure
class Main {
  public static void main(String[] args) {
    Hero hero = new Hero("Hero", 100);
    Monster mon1 = new Monster("Rat", 50);
    Monster mon2 = new Monster("Beast", 100);
    TextBox textBox = new TextBox();
    // Main mn = new Main();
    Caves cave = new Caves();

    for (int i = 0; i < 5; i++) {
      textBox.print(i);
    }

    // scanner requirement
    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();

    // switch to pick cave
    switch (option) {
      case 1:
        cave.caveA(hero, mon1, mon2);
        break;
      case 2:
        cave.caveB(hero, mon1, mon2);
        break;
      case 3:
        cave.caveC(hero, mon1, mon2);
        break;
      default:
        System.out.println();
        System.out.println("I'm sorry? I don't understand what you are saying...Oh no.");
        System.out.println();
        textBox.print(8);
        break;
    }

    sc.close();
  }

}
