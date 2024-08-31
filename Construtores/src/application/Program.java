
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product(); Não vale mais pois terei que instanciar o construtor depois de receber os resultados, para Guardar/OBRIGA a ser digitado
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		//product.name = sc.nextLine(); entites/construtor pede ele como Sreing
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//product.price = sc.nextDouble();entities pede ele como Double ( e nao como metodo )
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		//product.quantity = sc.nextInt(); entites pede ele como inteiro 
		
		Product product = new Product (name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		 quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}