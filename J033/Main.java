import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Main pStudio = new Main();
        pStudio.J033();
    }
    void J033(){
        Scanner s = new Scanner(System.in);
        
        int count = 0;
        String name;
        String longest = "",shortest = "";
        int max = 0;
        int min = Integer.MAX_VALUE; 

        count = s.nextInt();
        s.nextLine();

        for(int i=0; i<count; i++){
            int num = 0;
            name = s.nextLine();

                for(int j=0; j<name.length(); j++){
                    if(name.charAt(j) != ' ' && name.charAt(j) != ',')
                        num ++;
                }
                    
            if( max < num){
                    max = num;
                    longest = name;
            }
            if (min > num){
                    min = num;
                    shortest = name;
            }
        }

        System.out.printf("Longest: %s\n",longest);
        System.out.printf("Shortest: %s\n",shortest);
        s.close();
    }
}