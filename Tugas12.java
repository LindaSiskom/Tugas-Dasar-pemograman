public class Tugas12 {
 public static void main(String [] args) {

String namaCustomer [] = new String [10];

	namaCustomer [9] = "Linda" ;
	namaCustomer [8] = "Nur Rahmasari" ;
	namaCustomer [2] = "Irma";
	namaCustomer [4] = "Putri Butar butar" ;
	namaCustomer [5] = "Herin" ;
	namaCustomer [7] = "Srimingkurnia" ;
	namaCustomer [1] = "Hamidah Sofiumairoh" ;
	namaCustomer [3] = "Widia" ;             
	namaCustomer [0] = "Indah Andarini" ;
	namaCustomer [6] = "Erawati Joana" ;

int jumlahBeli [] = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
System.out.println("panjang array = "+ namaCustomer.length);
for (int i = 0; i < 10; i++) {
System.out.println(i + ". "+ namaCustomer[i] + "\t: "+ jumlahBeli[i]);
	}
    }
}