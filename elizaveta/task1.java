import  java.util.*;

public class Main{
    public static void main(String[] args){
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(in.hasNextInt()){
            a=in.nextInt();
            System.out.print("Делителями являются ");
            for(int i=a;i>0;i--){
                int b=a%i;
                if(b==0)
                    System.out.print(i+" ");
            }
        }
        else System.out.println("Ошибка. Введено не число");

    }
}





