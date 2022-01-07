package application;

import java.util.Scanner;

import entidade.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double areaX,  areaY;
		Triangulo x,y;
		
		x = new Triangulo();
		y = new Triangulo();
		


		System.out.println("Enter the measures of triangle X");

		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		areaX = areaTriangulo(x.a, x.b, x.c);
		System.out.printf("Triangle area X : %.4f", areaX);

		areaY = areaTriangulo(y.a, y.b, y.c);
		System.out.printf("\nTriangle area Y : %.4f", areaY);

		if (areaX > areaY) {
			System.out.println("\nLargue area X");
		} else {
			System.out.println("\nlargue area Y");

			sc.close();
		}

	}

	public static double areaTriangulo(double a, double b, double c) {
		double area, perimetro;
		perimetro = (a + b + c) / 2;
		area = Math.sqrt(perimetro * (perimetro - a) * (perimetro - b) * (perimetro - c));

		return area;

	}

}
