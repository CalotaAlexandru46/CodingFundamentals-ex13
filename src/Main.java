import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String toBeCounted=input.nextLine();
        String[] prop=toBeCounted.split("");
        int count=0;
        for(int i=0; i<prop.length;i++){
            if(prop[i].matches("[0-9]")){
                count++;
            }
        }
        System.out.println("Numarul cifrelor din string este de:"+count);
    }
}
