import java.util.Scanner;
public class gajiii
{
 public static void main(String [] args)
{

	String Nama;
	String BidangKerja;
	long NIP;
	int GajiPokok;
	int UangMakan;
	int JumlahHadir;
	int JumlahAbsen;

	Scanner data= new Scanner(System.in);
	System.out.println("____________________________");

	System.out.print(" Masukan Nama Anda : "); 
	Nama = data.nextLine();

	System.out.print(" Masukan Biadang Kerja Anda : ");
	BidangKerja = data.nextLine();
 						
	System.out.print(" Masukan Nip Anda : ");
	NIP = data.nextInt();

	System.out.print(" Masukan Gaji pokok anda : ");
	GajiPokok = data.nextInt();

	System.out.print(" Masukan Uang Makan Anda : ");
	UangMakan = data.nextInt();
	
	System.out.print(" Masukan Jumlah Hadir : ");
	JumlahHadir = data.nextInt();
	
	System.out.print(" Masukan Jumlah Absen : ");
	JumlahAbsen = data.nextInt();


System.out.println("_________________________________________________");
	
System.out.println("Nama Anda "+ Nama);
System.out.println("Bidang Anda : "+ BidangKerja);
System.out.println("NIP Anda "+ NIP);
System.out.println("Gaji Pokok Anda "+ GajiPokok);
System.out.println("Jumlah Hadir Anda : "+ JumlahHadir);
System.out.println("Jumlah Absen Anda : "+ JumlahAbsen);	
System.out.println("Totaal Uang Makan : "+ UangMakan);



	int TotalUangMakan;
	TotalUangMakan = UangMakan * JumlahHadir;
	
	int TotalGaji;
	TotalGaji= GajiPokok + TotalUangMakan;


boolean Akhir;
Akhir=JumlahAbsen<10;
String JawKir;

JawKir = Akhir? "selamat ! Gaji Anda Dapat diterima" : "Gaji Anda Tidak Dapat diterima";
System.out.println(JawKir);

System.out.println("TERIMA KASIH");


System.out.println();
System.out.println("Nama                                       : " + Nama);
System.out.println("Bidang Anda                                : " + BidangKerja); 
System.out.println("NIP                                        : " + NIP);
System.out.println("Gaji Pokok                                 : Rp " + GajiPokok+ " (per bulan)");
System.out.println("Jumlah Hadir                               : Rp " + JumlahHadir+ " (perbulan)");
System.out.println("Jumlah Absen                               : " + JumlahAbsen+ " (Per bulan)");
System.out.println("Total Uang Makan                           : Rp " + TotalUangMakan+ " (Bulan ini)");
System.out.println("Total Gaji                                 :Rp " + TotalGaji+ " (Bulan ini)");


System.out.println(JawKir);


	}	
}