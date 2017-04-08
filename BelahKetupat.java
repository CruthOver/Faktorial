package belahketupat;

import java.util.Scanner;

public class BelahKetupat {
    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int n = show.nextInt();
        
        for(int i=n; i>=1; i--){
            for(int j=i-1; j>=1; j--){
                System.out.print("0");
            }
            for(int k=1; k<=((n+1)-i)*2; k++){
                System.out.print("*");
            }
            for(int j=i-1; j>=1; j--){
                System.out.print("0");
            }
             System.out.println();
        }
        for (int i=1;i<=n;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print("0");
             }
             for(int z=n;z>=i;z--){
              System.out.print("*");
              }
             for(int k=n;k>=i;k--){
               System.out.print("*");
             }
             for(int j=1;j<=i-1;j++){
                 System.out.print("0");
             }
             System.out.println("");
         }

    }
}
