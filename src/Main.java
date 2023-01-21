import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int sayi1,sayi2,choose,result;
		Scanner input = new Scanner(System.in);

		System.out.print("1. Sayıyı Giriniz:");
		sayi1 = input.nextInt();

		System.out.print("2. Sayıyı Giriniz:");
		sayi2 = input.nextInt();

		System.out.println("1-Toplama 2-Çıkartma 3-Çarpma 4-Bölme");
		System.out.print("Lütfen Yapmak İstediğiniz İşlemi Giriniz:");
		choose = input.nextInt();


		switch(choose) {
			case 1:
				result = sayi1 + sayi2;
				System.out.println(result);
				break;

			case 2:
				result = sayi1 - sayi2;
				System.out.println(result);
				break;

			case 3:
				result = sayi1 * sayi2;
				System.out.println(result);
				break;

			case 4:
				result = sayi1 / sayi2;
				System.out.println(result);
				break;

			default:
				System.out.println("HATALI İŞLEM");
				break;
		}

	}
}