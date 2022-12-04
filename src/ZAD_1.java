import java.util.Arrays;
import java.util.Scanner;

public class ZAD_1 {

    public static void main(String args[] ) {
    System.out.print("Wprowadz dowolna liczbe calkowita, a system wyswietli " +"\n" + "wszystkie liczby poprzedzajace ta wartosc: " + '\n');
    Scanner sc = new Scanner(System.in);
    System.out.print("Podaj swoja liczbe calkowita: ");
    int NumC = sc.nextInt();
    int NumF = 0;
    int i;
    LiczbyNaturalne(NumF, NumC);

    int[] zakres = {NumC, NumF};}

    private static void LiczbyNaturalne(int NumF, int NumC)
    { int i;
        for( i=NumF; i <= NumC; i++)
        {
            System.out.println(i +" ");
    }}}

