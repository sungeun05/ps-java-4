import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Main pStudio = new Main();
        pStudio.J035();
    }void J035(){
        Scanner s = new Scanner(System.in);

        String ymd;
        int y = 0;
        int m = 0;
        int d = 0;
        int total= 0;

        ymd = s.nextLine();

        for(int i = 0; i<4; i++){
            y += Character.getNumericValue(ymd.charAt(i));
        }

        if(ymd.charAt(4)!='0'){
            m += Character.getNumericValue(ymd.charAt(4)) * 10;
            m += Character.getNumericValue(ymd.charAt(5));
        }
        else{
            for(int i=4; i<6; i++){
                m += Character.getNumericValue(ymd.charAt(i));
            }
        }
        
        if(ymd.charAt(6) != '0'){
            d += Character.getNumericValue(ymd.charAt(6)) * 10;
            d += Character.getNumericValue(ymd.charAt(7));
        }
        else
            for(int i=6; i<8; i++){
                d += Character.getNumericValue(ymd.charAt(i));
            }


        total = y+m+d;

        System.out.printf("%d",total);

        s.close();
    }


}