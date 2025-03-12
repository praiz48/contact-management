public class Contact {
    private String name;
    private String email;
    private String number;

    Contact(String Name, String Email,String Number){
        name= Name;
        email= Email;
        number= Number;
    }
    public String get_name(){
        return name;
    }
    public void change_name(String New_name){
        name= New_name;
        System.out.println("Name has been updated");
    }
    public void change_number(String New_num){
        number= New_num;
        System.out.println("Number has been updated");
    }
    public void change_email(String New_email){
        email= New_email;
        System.out.println("email has been updated");
    }
    public void veiw_contact(){
        System.out.printf(" Name : %s, Number : %s, Email : %s",name,number,email);
    }
}
