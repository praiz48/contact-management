import java.util.*;

public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chioce;
        String name;
        String email;
        String number;
        int index;
        Manager manager= new Manager();

        do {
            System.out.println("choose an option \n1. search contacts \n2. add contacts \n3. delete contacts \n4. update contact \n5.view contact \n6.quit ");
            chioce= scanner.nextInt();
            switch (chioce) {
                case 1:
                    scanner.nextLine();
                    System.out.println("enter name to search for");
                    name= scanner.nextLine();
                    manager.search_contact(name);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("input name ");
                    name= scanner.nextLine();
                    System.out.println("input number ");
                    number= scanner.nextLine();
                    System.out.println("input email ");
                    email= scanner.nextLine();
                    manager.add_contact(name, number, email);
                    break;
                case 3:
                    System.out.println("input index to remove");
                    index= scanner.nextInt();
                    manager.remove_contact(index);
                    break;
                case 4:
                    System.out.println("input index to update");
                    index= scanner.nextInt();
                    manager.updated_contact(index);
                    break;
                case 5:
                    
                    manager.view_contacts();
                    break;
                case 6:
                    System.out.println("good bye");
                    scanner.close();
                    break;

            
                default:
                    break;
            }
        } while (chioce!=6);
    }
}