package principal;

import java.util.Scanner;

import produtos.Produtos;

//import geometria.Triangulo;

public class Main  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produtos a= new Produtos();
		
		System.out.println("Digite o nome do produto: ");
		a.nome = sc.next();
		System.out.println("Digite o pre�o do produto: R$");
		a.preco= sc.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		a.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + a.nome + ", " + a.quantidade + " unidades, Valor unit�rio: R$"+ a.preco + " Totalizando: R$"+ a.totalValorEmEstoque());
		
		
		System.out.print("Entre com nova remessa: ");
		int quantidade = sc.nextInt();
		a.addProdutos(quantidade);
	
		System.out.println("Dados do produto: " + a.nome + ", " + a.quantidade + " unidades, Valor unit�rio: R$"+ a.preco + " Totalizando: R$"+ a.totalValorEmEstoque());
		
		System.out.println("Remova a quantidade de produtos: ");
		quantidade = sc.nextInt();
		a.removerProdutos(quantidade);
		
		System.out.println("Dados do produto: " + a.nome + ", " + a.quantidade + " unidades, Valor unit�rio: R$"+ a.preco + " Totalizando: R$"+ a.totalValorEmEstoque());
		
		sc.close();
	}

	}


//		//double xA, xB, xC, yA, yB, yC;
//		Triangulo x = new Triangulo();
//		Triangulo y = new Triangulo();
//		
//		System.out.println("Digite as medidas do tri�ngulo X");
//		x.ladoA = sc.nextDouble();
//		x.ladoB = sc.nextDouble();
//		x.ladoC = sc.nextDouble();
//		
//		System.out.println("Digite as medidas do tri�ngulo Y");
//		y.ladoA = sc.nextDouble();
//		y.ladoB = sc.nextDouble();
//		y.ladoC = sc.nextDouble();
//		
//		
//		double areaX = x.area();
//
//		double areaY = y.area();
//		
//		System.out.println("O valor da �rea de X �: "+ areaX);
//		System.out.println("O valor da �rea de Y �: "+ areaY);
//		
//		if (areaX>areaY) {
//			System.out.println("A �rea de X � maior!");
//		}else {
//			System.out.println("A �rea de Y � maior!");
//		}
//	}
//
//}