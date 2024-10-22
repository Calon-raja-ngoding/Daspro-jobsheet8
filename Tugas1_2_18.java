import java.util.Scanner;
public class Tugas1_2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        int N,a,b,c,i=1;
        System.out.println("Masukkan angka diatas 200 jika ingin memberhentikan program");
        System.out.print("Masukkan nilai N = ");
        N = sc.nextInt();
        a = N -1;
        b = N +a;
        if (N >= 10 && N <= 99) {
            c = N*2 -2 +a;
        }else if (N >= 100 && N <= 999) {
            c = N*3 -4 +a;
        } else{c =N +a;}
            if (N >= 201) {
                break;
            }else {
                while (i <= N) {
                    if (i == 1 || i == N) {
                        for (int j=1;j<=b;j++){
                            if (j%2 ==0) {
                                System.out.print(" ");
                            }
                            else {System.out.print(N);}
                        }
                    }else{
                        for (int j=1;j<=c;j++){
                            if (j == 1 || j== c) {
                             System.out.print(N);   
                            }else{ System.out.print(" ");}
                        }
                    } 
                    i++;
                    System.out.println();
                }
            }
        }
        
    }
}
