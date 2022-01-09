import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("kaç kilo armut alacaksınız =");
        int armut=input.nextInt();
        System.out.print("kaç kilo elma alacaksınız =");
        int elma=input.nextInt();
        System.out.print("kaç kilo domates alacaksınız =");
        int domates=input.nextInt();
        System.out.print("kaç kilo muz alacaksınız =");
        int muz=input.nextInt();
        System.out.print("kaç kilo patlıcan alacaksınız =");
        int patlıcan=input.nextInt();
        double toplam=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5));

        System.out.println("Toplam tutar ="+toplam);

    }
}
