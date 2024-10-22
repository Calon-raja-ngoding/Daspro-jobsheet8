import java.util.Scanner;
public class Tugas2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cabor,layanan ;
        String voli1,voli2,voli3,voli4,voli5,basket1,basket2,basket3,basket4,basket5,
               badminton1,badminton2,badminton3,badminton4,badminton5,TM1,TM2,TM3,TM4,TM5,
               bola1,bola2,bola3,bola4,bola5;
        
        System.out.println("Masukkan nama atlet dari cabang BADMINTON");
        System.out.print("Atlet pertama = ");
        badminton1 = sc.nextLine();
        System.out.print("Atlet kedua = ");
        badminton2 = sc.nextLine();
        System.out.print("Atlet ketiga = ");
        badminton3 = sc.nextLine();
        System.out.print("Atlet keempat = ");
        badminton4 = sc.nextLine();
        System.out.print("Atlet kelima = ");
        badminton5 = sc.nextLine();
        System.out.println("Masukkan nama atlet dari cabang TENIS MEJA");
        System.out.print("Atlet pertama = ");
        TM1 = sc.nextLine();
        System.out.print("Atlet kedua = ");
        TM2 = sc.nextLine();
        System.out.print("Atlet ketiga = ");
        TM3 = sc.nextLine();
        System.out.print("Atlet keempat = ");
        TM4 = sc.nextLine();
        System.out.print("Atlet kelima = ");
        TM5 = sc.nextLine();
        System.out.println("Masukkan nama atlet dari cabang BASKET");
        System.out.print("Atlet pertama = ");
        basket1 = sc.nextLine();
        System.out.print("Atlet kedua = ");
        basket2 = sc.nextLine();
        System.out.print("Atlet ketiga = ");
        basket3 = sc.nextLine();
        System.out.print("Atlet keempat = ");
        basket4 = sc.nextLine();
        System.out.print("Atlet kelima = ");
        basket5 = sc.nextLine();
        System.out.println("Masukkan nama atlet dari cabang BOLA");
        System.out.print("Atlet pertama = ");
        bola1 = sc.nextLine();
        System.out.print("Atlet kedua = ");
        bola2 = sc.nextLine();
        System.out.print("Atlet ketiga = ");
        bola3 = sc.nextLine();
        System.out.print("Atlet keempat = ");
        bola4 = sc.nextLine();
        System.out.print("Atlet kelima = ");
        bola5 = sc.nextLine();
        System.out.println("Masukkan nama atlet dari cabang VOLI");
        System.out.print("Atlet pertama = ");
        voli1 = sc.nextLine();
        System.out.print("Atlet kedua = ");
        voli2 = sc.nextLine();
        System.out.print("Atlet ketiga = ");
        voli3 = sc.nextLine();
        System.out.print("Atlet keempat = ");
        voli4 = sc.nextLine();
        System.out.print("Atlet kelima = ");
        voli5 = sc.nextLine();
        while (true) {
            System.out.println("Menu layanan :");
            System.out.println("  1.Menampilkan nama atlet dari cabang olahraga yg anda inginkan");
            System.out.println("  2.Keluar dari program");
            System.out.print("Masukkan nomor dari layanan yg anda inginkan : ");
            layanan = sc.nextInt();
            if (layanan == 1) {
                System.out.println("Daftar cabang olahraga");
                System.out.println("  1.BADMINTON");
                System.out.println("  2.TENIS MEJA");
                System.out.println("  3.BASKET");
                System.out.println("  4.BOLA");
                System.out.println("  5.VOLI");
                System.out.print("Masukkan nomor dari cabang olahraga yg anda ingin tampilkan nama atletnya : ");
                cabor = sc.nextInt();
                if (cabor == 1) {
                    System.out.println("Nama atlet dari cabang BADMINTON");
                    System.out.println("  - " + badminton1);
                    System.out.println("  - " + badminton2);
                    System.out.println("  - " + badminton3);
                    System.out.println("  - " + badminton4);
                    System.out.println("  - " + badminton5);
                }else if (cabor == 2) {
                    System.out.print("Nama atlet dari cabang TENIS MEJA");
                    System.out.println("  - " + TM1);
                    System.out.println("  - " + TM2);
                    System.out.println("  - " + TM3);
                    System.out.println("  - " + TM4);
                    System.out.println("  - " + TM5);
                }else if (cabor == 3) {
                    System.out.print("Nama atlet dari cabang BASKET");
                    System.out.println("  - " + basket1);
                    System.out.println("  - " + basket2);
                    System.out.println("  - " + basket3);
                    System.out.println("  - " + basket4);
                    System.out.println("  - " + basket5);
                }else if (cabor == 4) {
                    System.out.print("Nama atlet dari cabang BOLA");
                    System.out.println("  - " + bola1);
                    System.out.println("  - " + bola2);
                    System.out.println("  - " + bola3);
                    System.out.println("  - " + bola4);
                    System.out.println("  - " + bola5);
                }else if (cabor == 5) {
                    System.out.print("Nama atlet dari cabang TENIS MEJA");
                    System.out.println("  - " + voli1);
                    System.out.println("  - " + voli2);
                    System.out.println("  - " + voli3);
                    System.out.println("  - " + voli4);
                    System.out.println("  - " + voli5);
                }else {System.out.println("Nomor dari cabang olahraga yg anda masukkan invalid");}
            }else if (layanan == 2) {
                break;
            }else {System.out.println("Nomor dari layanan yg anda masukkan invalid");}
        }
    }
}
