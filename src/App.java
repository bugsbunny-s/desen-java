import java.util.Scanner;
public class App {

    static void desen(int n,int temp){
        if (n>0){
        System.out.print(n + " ");
        desen(n-5,temp);
        }if(n<=0){
            desen2(n,temp);
        }
     }

     static void desen2(int n,int temp){
        if (n <= temp){
            System.out.print(n + " ");
            desen2(n+5,temp);
        }
     }
public static void main (String[] args) throws Exception {
    Scanner inp = new Scanner(System.in);
    System.out.print("Sayı giriniz : ");
    int n = inp.nextInt();
    int temp=n;
    desen(n,temp);
}
}