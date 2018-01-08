import java.util.Scanner;
public class Jumlah
{
public static void main(String args[])
{
	Scanner masuk = new Scanner (System.in);
	int A,B, Jumlah;
	System.out.print("Bilangan 1 : ");
	A = masuk.nextInt();
	System.out.print("Bilangan 2 : ");
	B = masuk.nextInt();
	Jumlah = A + B;
	System.out.print("Jumlah = "+ Jumlah);
	}
}


	