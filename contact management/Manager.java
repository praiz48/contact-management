import java.util.*;
public class Manager {
    List<Contact> contacts= new ArrayList<>(Arrays.asList(new Contact("praise", "praisekola@gamil.com","081229037"),
                                                         new Contact("kenny", "kenny123@gamil.com", "0902562889")));

    Scanner scanner= new Scanner(System.in);
    int count=1;
    public void add_contact(String name,String number,String email ){
        contacts.add(new Contact(name, email, number));
        // add searching for duplicate numbers
        System.out.println("Successfully added " + name +" to contact list");

    }
    public void remove_contact(int index){
        index--;
       if (index<contacts.size()&&index>-1) {
            contacts.remove(index);
            System.out.println("successfully removed contact");
       }
       else{
            System.out.println("out of range");
       }
    }
    public void view_contacts(){
        for (Contact contact : contacts) {
            System.out.print("\n" + count++);
            contact.veiw_contact();
            System.out.print("\n");
           
        }
    }
    public void updated_contact(int index){
        index--;
       if (index<contacts.size()&&index>-1) {
            int choice;
            String updated;
            System.out.println("would you like to update \n1. contact name \n2. contact number \n3. contact email ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    
                    System.out.println("enter new name ");
                    updated= scanner.nextLine();
                    contacts.get(index).change_name(updated);
                    break;
                case 2:
                    System.out.println("enter new number ");
                    updated= scanner.nextLine();
                    contacts.get(index).change_number(updated);
                    break;
                case 3:
                    System.out.println("enter new email ");
                    updated= scanner.nextLine();
                    contacts.get(index).change_email(updated);
                    break;
            
                default:
                    System.out.println("not in the options");
                    break;
            }
       }
    }
    public void search_contact(String name){
        for (Contact contact : contacts) {
            if (contact.get_name().equals(name)) {
               System.out.println(name+" is at index "+ contacts.indexOf(contact));
               break;
            }
            else{
                System.out.println("not found");
            }
        }
    }
}
