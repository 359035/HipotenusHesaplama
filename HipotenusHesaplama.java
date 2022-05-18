/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenushesaplama;

/**
 *
 * @author Samsung
 */
    import java.util.Scanner;
public class HipotenusHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int a, b;
            double c;
		
            Scanner scanner = new Scanner(System.in);
		
		System.out.print("Üçgeninizin ilk kenarýný giriniz:");
		a = scanner.nextInt();
		System.out.print("Üçgeninizin ikinci kenarýný giriniz:");
		b = scanner.nextInt();
		
		c= Math.sqrt((a*a)+(b*b));
		
		System.out.println("Üçgeninizin hipotenüsü:" + c);
		
		
		
		
		
		
		
		
		
	}

}
    
    

