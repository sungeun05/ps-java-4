import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Main pStudio = new Main();
        pStudio.J031();
    }
    void J031(){
        Scanner s = new Scanner(System.in);
        
        String userid;
        String password;
        String name;

        userid = s.nextLine();
        password = s.nextLine();
        name = s.nextLine();

        if(password.length() < 3)
            System.out.printf("Error! password is too short");
        else{
            System.out.printf("User Id: %s\n",userid);
            System.out.printf("Password: ");
            for(int i=0; i<2; i++)
                System.out.printf("%c",password.charAt(i));
            for(int i=2; i<password.length();i++)
                System.out.printf("*");
            System.out.printf("\nUser Name: %s",name);
        }

        s.close();
    }
}