import java.util.Scanner;
import java.util.ArrayList;

class Items{
  String name;
  String serialNumber;
  int value;
  

  public Items(String name, String serialNumber, int value){
    this.name = name;
    this.serialNumber = serialNumber;
    this.value = value;
    }
  
}

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Items> item= new ArrayList<>();
    boolean quit = false;

    while(!quit){
      System.out.println("Press 1 to add an item.\n"   + 
                         "Press 2 to delete an item.\n" +
                         "Press 3 to update an item.\n" +
                         "Press 4 to show all the items.\n" +
                         "Press 5 to quit the program.");
    int inPut = scanner.nextInt();
        if(inPut==1){
          System.out.println("Enter the name:");
          String name = scanner.next();
          scanner.nextLine();
          System.out.println("Enter the serial number:");
          String serialNumber = scanner.next();
          System.out.println("Enter the value in dollars (whole number):");
          int value = scanner.nextInt();

          Items addItems = new Items(name, serialNumber, value);
          item.add(addItems);
           }
        else if(inPut==2){
          System.out.println("Enter the serial number of the item to delete");
          String serialNumberDelete = scanner.next();
          scanner.nextLine();
          for(Items items : item){
            if(items.serialNumber.equals(serialNumberDelete)){
              item.remove(items);
              break;
            }
          }
        }
        else if(inPut==3){
          System.out.println("Enter the serial number of the item to change:");
          String serialNumberUpdate = scanner.next();
          scanner.nextLine();
          System.out.println("Enter the new name:");
          String updatedName = scanner.next();
          System.out.println("Enter the new value in dollars (whole number):");
          int updatedValue = scanner.nextInt();
            for (Items items : item){
              if(items.serialNumber.equals(serialNumberUpdate)){
                items.name = updatedName;
                items.value = updatedValue;
              }
            }
          }
        else if(inPut==4){
          for(Items allItems : item){
            System.out.println(allItems.name + "," + allItems.serialNumber + "," + allItems.value);
            }          
          }
        else if(inPut==5){
          quit = true;
          scanner.close();
          }
        else {
          System.out.println("Please enter a number from 1 to 5");
           }
      

      
    }
  }
}