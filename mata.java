public class Tugas12 {
 public static void main(String [] args) {

String namaCustomer [] = new String [10];

	namaCustomer [0] = "Linda" ;
	namaCustomer [1] = "Nur Rahmasari" ;
	namaCustomer [2] = "Irma" ;
	namaCustomer [3] = "Putri Butar butar" ;
	namaCustomer [4] = "Herin" ;
	namaCustomer [5] = "Srimingkurnia" ;
	namaCustomer [6] = "Hamidah Sofiumairoh" ;
	namaCustomer [7] = "Widya" ;
	namaCustomer [8] = "Indah Andarini" ;
	namaCustomer [9] = "Erawati Joana" ;

int jumlahBeli [] = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
System.out.println("panjang array = "+ namaCustomer.length);
for (int i = 0; i < 10; i++) {
System.out.println(i + ". "+ namaCustomer[i] + "\t: "+ jumlahBeli[i]);
	}
    }
}