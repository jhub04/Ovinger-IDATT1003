import java.util.Scanner;

public class PropertyRegisterClient {

  public static void main(String[] args) {
    PropertyRegister register = new PropertyRegister();
    Scanner scanner = new Scanner(System.in);

    register.registerProperty(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen");
    register.registerProperty(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
    register.registerProperty(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
    register.registerProperty(1445, "Gloppen", 74, 188, 1457.2, "Karl Ove Bråten");
    register.registerProperty(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1. Add a Property");
      System.out.println("2. List all Properties");
      System.out.println("3. Find property");
      System.out.println("4. Calculate average area");
      System.out.println("5. Quit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter municipality number: ");
          int municipalityNumber = scanner.nextInt();
          System.out.println("Enter municipality name: ");
          String municipalityName = scanner.next();
          System.out.println("Enter lot number: ");
          int lotNumber = scanner.nextInt();
          System.out.println("Enter section number: ");
          int sectionNumber = scanner.nextInt();
          System.out.println("Enter area: ");
          double area = scanner.nextDouble();
          System.out.println("Enter name of owner: ");
          String nameOfOwner = scanner.next();
          System.out.println("Enter name of property: ");
          String name = scanner.next();
          try {
            register.registerProperty(municipalityNumber, municipalityName, lotNumber,
                sectionNumber, name, area, nameOfOwner);
          } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }
          break;
        case 2:
          for (Property property : register.getProperties()) {
            System.out.println("Property: " + property.toString());
            System.out.println("Municipality number: " + property.getMunicipalityNumber());
            System.out.println("Municipality name: " + property.getMunicipalityName());
            System.out.println("Lot number: " + property.getLotNumber());
            System.out.println("Section number: " + property.getSectionNumber());
            System.out.println("Name: " + property.getName());
            System.out.println("Area: " + property.getArea());
            System.out.println("Name of owner: " + property.getNameOfOwner());
            System.out.println();
          }
          break;
        case 3:
          System.out.println("Enter municipality number: ");
          municipalityNumber = scanner.nextInt();
          System.out.println("Enter lot number: ");
          lotNumber = scanner.nextInt();
          System.out.println("Enter section number: ");
          sectionNumber = scanner.nextInt();

          Property property = register.findProperty(municipalityNumber, lotNumber, sectionNumber);
          if (property != null) {
            System.out.println("\nProperty: " + property);
            System.out.println("Municipality number: " + property.getMunicipalityNumber());
            System.out.println("Municipality name: " + property.getMunicipalityName());
            System.out.println("Lot number: " + property.getLotNumber());
            System.out.println("Section number: " + property.getSectionNumber());
            System.out.println("Name: " + property.getName());
            System.out.println("Area: " + property.getArea());
            System.out.println("Name of owner: " + property.getNameOfOwner());
            System.out.println();
          } else {
            System.out.println("Property not found");
          }
          break;
        case 4:
          System.out.println("Average area: " + register.getAverageArea());
          break;
        case 5:
          System.exit(0);


      }

    }


  }
}
