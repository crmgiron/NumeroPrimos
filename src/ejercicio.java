import java.util.Scanner;
public class ejercicio extends utilerias{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int suma = 0;
		System.out.println("Ingrese un numero: ");
		n = sc.nextInt();
		for (int i=1; i<n;i++) {
			if ( determinarPrimo(i)) {
				
			
			suma += i;
			System.out.println(i);
			}
		}
		System.out.println("La sumatoria es: "+suma);

	}

}
