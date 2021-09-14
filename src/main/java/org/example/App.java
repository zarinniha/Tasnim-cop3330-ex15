import java.util.Scanner;

class password{

    public static void main(String args[])
    {
        System.out.print("What is the username? ");
        Scanner sc= new Scanner(System.in);
        String username=sc.nextLine();

        System.out.print("What is the password? ");
        String pass= sc.nextLine();

        String savedpass="abc$123";

        if(pass.equals(savedpass))
        {
            System.out.println("Welcome!");
        }else
        {
            System.out.println("I don't know you.");
        }
    }
}