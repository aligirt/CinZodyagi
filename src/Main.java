import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year, range;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = inp.nextInt();
        range = year % 12;

        switch (range){
            case 0:
                System.out.println("Çin Zodyağı Burcunu : MAYMUN");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunu : HOROZ");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunu : KÖPEK");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunu : DOMUZ");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunu : FARE");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunu : ÖKÜZ");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunu : KAPLAN");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunu : TAVŞAN");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunu : EJDERHA");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunu : YILAN");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunu : AT");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunu : KOYUN");
                break;
        }
    }
}