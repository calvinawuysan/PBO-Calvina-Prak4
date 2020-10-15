import java.util.Scanner;
public class hadiahprak4{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	char pilihan = 'a';
	String nama,alamat;
	int bayar, kembalian;
	boolean loop = true ;
	
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.print("Masukkan Alamat = ");
	alamat = masukan.nextLine();
	
	System.out.println("Tipe Pesawat:");
	System.out.println("a. Rp.5.000.000");
	System.out.println("b. Rp.3.000.000");
	System.out.println("c. Rp.1.000.000");
	System.out.print("Pilihan = ");
	try {
		pilihan = (char)System.in.read();
	}catch(Exception e){
		System.out.println("Salah ko menginput cess!!!");	
	}
	
	while(loop) {
		switch(pilihan) {
			case 'a' : System.out.print("Bayaran Anda = ");
					   bayar = masukan.nextInt();
					   kembalian = bayar - 5000000;
					   System.out.println();
					   System.out.println("Nama = " +nama); 
					   System.out.println("Alamat = " +alamat); 
					   System.out.println("Kembalian = " +kembalian); 
					   loop = false; break;
			case 'b' : System.out.print("Bayaran Anda = ");
					   bayar = masukan.nextInt();
					   kembalian = bayar - 3000000; 
					   System.out.println();
					   System.out.println("Nama = " +nama); 
					   System.out.println("Alamat = " +alamat); 
					   System.out.println("Kembalian = " +kembalian); 
					   loop = false; break;
			case 'c' : System.out.print("Bayaran Anda = ");
					   bayar = masukan.nextInt();
			           kembalian = bayar - 1000000;
			           System.out.println(); 
					   System.out.println("Nama = " +nama); 
					   System.out.println("Alamat = " +alamat);
					   System.out.println("Kembalian = " +kembalian); 
					   loop = false; break;
			default : System.out.println("Pilihan Anda Salah!! Silahkan pilih tipe a-c");
		}
		break;
	}
	}
}