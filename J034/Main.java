import java.util.Scanner;

class Main{
    public static void main (String[] args){
        Main pStudio = new Main();
        pStudio.J034();
    }void J034(){
        Scanner s = new Scanner(System.in);

        String name;
        String pass;
        int check = 0;

        String[] usernames = {"kim","lee","park","hong","choi"};
        String[] passwords = {"1111","1234","3456","3535","7777"};

        name = s.nextLine();
        pass = s.nextLine();

        for(int i=0; i<4; i++){
            if(name.equals(usernames[i]))
                check = 1;
        }
        if(check == 0)
            System.out.printf("No user!");
        else
            for(int i=0; i<4; i++)
                if(pass.equals(passwords[i]))
                    check = 2;
        
        if(check == 2)
            System.out.printf("Login OK!");
        else if(check == 1)
            System.out.printf("Incorrect password!");

        s.close();
    }
}