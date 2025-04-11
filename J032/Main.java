import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Main pStudio = new Main();
        pStudio.J032();
    }
    void J032(){
        Scanner s = new Scanner(System.in);
        
        String str;
        String reverse = "";

        str = s.nextLine();

        for(int i=str.length()-1; i>=0; i--)
            reverse += str.charAt(i);

        System.out.printf("%s",reverse);
        

        s.close();
    }
}