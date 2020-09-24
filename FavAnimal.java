
import java.util.*;

public class FavoriteAnimal{
  String name;
  String habitat;
  int width;
  String similarAnimals;
  String specialty;

  public FavoriteAnimal(){
    name = "Wobbegong shark";
    habitat = "Shallow temperate and tropical waters";
    width = 2;
    similarAnimals = "hammerhead shark, great white shark, saw shark";
    specialty = "distinctive body type";
  }

  public String returnName(){
    return name;
  }

  public String returnHabitat(){
    return habitat;
  }

  public int returnWidth(){
    return width;
  }

  public String returnSimlarAnimals(){
    return similarAnimals;
  }

  public String returnSpecialty(){
    return specialty;
  }

  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    FavoriteAnimal sharks = new FavoriteAnimal();

    System.out.println("This project is about sharks. Specifically Wobbegong sharks. What do you want to know?");
    System.out.println("1. Scientific Name");
    System.out.println("2. Habitat");
    System.out.println("3. Height");
    System.out.println("4. Similar Animals");
    System.out.println("5. What makes them special");

    int userChoice = input.nextInt();

    if(userChoice == 1){
      System.out.println(sharks.returnName());
    }
    if(userChoice == 2){
      System.out.println(sharks.returnHabitat());
    }
    if(userChoice == 3){
      System.out.println(sharks.returnWidth());
    }
    if(userChoice == 4){
      System.out.println(sharks.returnSimlarAnimals());
    }
    if(userChoice == 5){
      System.out.println(sharks.returnSpecialty());
    }

    input.close();


  }

}
