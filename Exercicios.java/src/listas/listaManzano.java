package listas;
import java.util.Scanner;

public class listaManzano {

	public static void ex01(Scanner sc){
	
			double f, c;

			System.out.println("Este é o Algoritmo A (conversor de Celsius para Fahrenheit)");

			System.out.println("Por favor digite uma quantia de Graus Celsius: ");
			c = sc.nextDouble();

			f = (9 * c + 160) / 5;

			System.out.println("A conversão do valor de Celsius para Fahrenheit é: " + f + "°F");

			System.out.println("=================================================");
 }
	
	public static void ex02(Scanner sc){
		System.out.println("Este é o Algoritmo B (conversor de Fahrenheit para Celsius)");

		System.out.println("Por favor digite uma quantia de Graus Fahrenheit: ");
		double f, c;
		f = sc.nextDouble();

		c = (f - 32) * (5 / 9);

		System.out.println("A conversão do valor de Fahrenheit para Celsius é: " + c + "°C");
		
		System.out.println("=================================================");
	}
	
	public static void ex03(Scanner sc){
	
	    System.out.println("Vamos calcular para você o volume da sua Lata e Oleo");
	
	    System.out.println("Por favor digite o raio da circuferencia da lata: ");
    	double r = sc.nextDouble();
	
	    System.out.println("Agora por favor digite a altura da lata: ");
	    double h = sc.nextDouble();
	  
	    double v = 3.13159 * (r*r)*h;
	
	    System.out.println("Esse é o volume da lata de Oleo que voce digitou: "+v+"m³");
	}
	
	public static void ex04(Scanner sc){
		

		System.out.println("Por favor digite a velocidade media de seu carro em km: ");
		double vl = sc.nextDouble();
		
		System.out.println("Agora digite o tempo medio gasto em horas: ");
		double tp = sc.nextDouble();
		
		double dt = vl*tp;

		double lg = dt/12;
		
		System.out.println("seu Carro ira gastar ou gastou: "+ lg+"L");
	
	}
	public static void ex05(Scanner sc){
		
		System.out.println("Por favor nos informe o Valor original da prestação: ");
		double valor = sc.nextDouble();
		
		System.out.println("Qual é a taxa por atraso da prestação: ");
		double taxa = sc.nextDouble();
		
		System.out.println("Qual o tempo de atraso em dias: ");
		double tempo = sc.nextDouble();
		
		double prestacao = valor+(valor*(taxa/100)*tempo);
		
		System.out.println("O valor da prestação com a taxa de atraso sera: "+ "R$"+prestacao);
	}
	
	public static void ex06(Scanner sc){
		
		
		System.out.println("Por favor Digite o Valor A: ");
		double a = sc.nextDouble();
		
		System.out.println("Agora digite o valor B: ");
		double b = sc.nextDouble();
		
		double aux = a;
		a = b;
		b = aux;
		
		System.out.println("A Variavel B agora é :"+b + " .A variavel A agora é :"+ a);
	}
	public static void ex07(Scanner sc){
		
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Por favor Digite o Valor A: ");
			double a = sc.nextDouble();

			System.out.println("Agora digite o valor B: ");
			double b = sc.nextDouble();

			System.out.println("Por favor Digite o Valor C: ");
			double c = sc.nextDouble();

			System.out.println("Agora digite o valor D: ");
			double d = sc.nextDouble();

			System.out.println("O resultado de A+B e A*B é " + a + b + " ;" + a * b + ". O resultado de A+C e A*C é " + a
					+ c + " ;" + a * c + ". O resultado de A+D e A*D é " + a + d + " ;" + a * d);

			System.out.println("O resultado de B+C e B*C é " + b + c + " ;" + b * c + ". O resultado de B+D e B*D é " + b
					+ d + " ;" + b * d);

			System.out.println("O resultado de C+D e C*D é " + c + d + " ;" + c * d);
		
	}
		public static void ex08(Scanner sc){
			

				System.out.println("Qual é a altura da caixa? ");
				double altura = sc.nextDouble();

				System.out.println("Qual é a largura da caixa? ");
				double largura = sc.nextDouble();

				System.out.println("Qual é o comprimento da caixa? ");
				double comprimento = sc.nextDouble();

				double volume = comprimento * largura * altura;

				System.out.println("O volume da Caixa é de " + volume + "m³");

	}
		public static void ex09(Scanner sc){
			

			System.out.println("Digite um numero: ");
			double numero = sc.nextDouble();

			System.out.println("O seu numero ao quadrado é " + (numero * numero));
			
		}
		public static void ex10(Scanner sc){
		
			System.out.println("Digite um numero: ");
			double a = sc.nextDouble();
			
			System.out.println("Digite outro numero: ");
			double b = sc.nextDouble();
			
			double dif = (a-b)*(a-b);
			
			System.out.println("A diferença dos dois numeros ao quadrado é "+dif);

		}
		public static void ex11(Scanner sc){
			
			System.out.println("Quantos Dolares você tem: ");
			double dolar = sc.nextDouble();
			
			System.out.println("Qual a cotagem do dolar? ");
			double cotagem = sc.nextDouble();
			
			double real = cotagem*dolar;
			
			System.out.println("Você tem R$"+real);
			
		}
		public static void ex12(Scanner sc){
			
			System.out.println("Quantos Dolares você tem: ");
			double dolar = sc.nextDouble();
			
			System.out.println("Qual a cotagem do dolar? ");
			double cotagem = sc.nextDouble();
			
			double real = cotagem*dolar;
			
			System.out.println("Você tem R$"+real);
		}
		public static void ex13(Scanner sc){
			
			System.out.println("Quantos Reais você tem: ");
			double real = sc.nextDouble();
			
			System.out.println("Qual a cotagem do real? ");
			double cotagem = sc.nextDouble();
			
			double dolar = real/cotagem;
			
			System.out.println("Você tem US$"+dolar);

		}
		public static void ex14(Scanner sc){
			

			System.out.println("Escreva o primeiro numero: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Escreva o segundo numero: ");
			double num2 = sc.nextDouble();
			
			System.out.println("Escreva o terceiro numero: ");
			double num3 = sc.nextDouble();
			
			System.out.println("A soma destes 3 numeros ao quadrado é "+ (num1*num1+num2*num2+num3*num3));
			
		}
		public static void ex15(Scanner sc){

			System.out.println("Digite um numero: ");
			double a = sc.nextDouble();
			
			System.out.println("Digite o segundo numero: ");
			double b = sc.nextDouble();
			
			System.out.println("Digite o terceiro numero: ");
			double c = sc.nextDouble();
			
			System.out.println("O quadrado da soma dos 3 numeros é:"+ (a+b+c)*(a+b+c));
			
		}
		public static void ex16(Scanner sc){
			
			System.out.println("Digite um numero: ");
			double a = sc.nextDouble();
			
			System.out.println("Digite o segundo numero: ");
			double b = sc.nextDouble();
			
			System.out.println("Digite o terceiro numero: ");
			double c = sc.nextDouble();
			
			System.out.println("O quadrado da soma dos 3 numeros é:"+ (a+b+c)*(a+b+c));

		}
		public static void ex17(Scanner sc){
			
			System.out.println("Digite um numero: ");
			double a = sc.nextDouble();

			System.out.println("Digite o segundo numero: ");
			double b = sc.nextDouble();

			System.out.println("Digite o terceiro numero: ");
			double c = sc.nextDouble();

			System.out.println("Digite o quarto numero: ");
			double d = sc.nextDouble();

			System.out.println("A soma do primeiro e terceiro numero é " + (a + c));
			System.out.println("A soma do segundo e do quarto numero é " + (b + d));
			
			
		}
		public static void ex18(Scanner sc){
		
		System.out.println("Qual o salario do seu funcionario ? ");
		double salarioMen = sc.nextDouble();
		
		System.out.println("Qual o percentual de reajuste do seu funcionario ? ");
		double percentualRea = sc.nextDouble();

		double novoSal = (salarioMen*percentualRea/100)+salarioMen;
		
		System.out.println("O novo salario do seu funcionario sera R$"+novoSal);
		}
		public static void ex19(Scanner sc){

			System.out.println("Por favor digite qual é o raio da circuferencia escolhida: ");
			double raio = sc.nextDouble();
			
			double area = 3.14159*(raio*raio);
			
			System.out.println("A área da circuferencia escolhida é "+area);
		
		}
		public static void ex20(Scanner sc){
			
			System.out.println("Quantos eleitores tem em seu municipio ? ");
			int eleitores = sc.nextInt();

			System.out.println("Quantos votos tiveram o candidato A ? ");
			int candidatoA = sc.nextInt();

			System.out.println("Quantos votos tiveram o candidato B ? ");
			int candidatoB = sc.nextInt();

			System.out.println("Quantos votos tiveram o candidato C ? ");
			int candidatoC = sc.nextInt();

			System.out.println("Quantos votos brancos tiveram em seu municipio ? ");
			int vBrancos = sc.nextInt();

			int vNulos = eleitores - (candidatoA + candidatoB + candidatoC + vBrancos);

			double pVotosBrancos = 100 * vBrancos / eleitores;

			double pVotosNulos = 100 * vNulos / eleitores;

			double pCandidatoA = 100 * candidatoA / eleitores;
			double pCandidatoB = 100 * candidatoB / eleitores;
			double pCandidatoC = 100 * candidatoC / eleitores;

			System.out.println("O seu municipio contava com" + eleitores + " eleitores");
			System.out.println("No seu mucipio teve" + pVotosNulos + "% de votos Nulos");
			System.out.println("E também teve" + pVotosBrancos + "% de votos Brancos");
			System.out.println("O candidato A teve" + pCandidatoA + "% dos votos");
			System.out.println("O candidato B teve" + pCandidatoB + "% dos votos");
			System.out.println("O candidato C teve" + pCandidatoC + "% dos votos");
			
		}
		public static void ex21(Scanner sc){
			
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			int i = 0;
			
			
			while(i<=10){
			    System.out.println(numero+"x"+i+"="+(numero*i));
			    i++;
			}
		}
		public static void ex22(Scanner sc){
			
			int contadora,acomulador;
			
			contadora = 1;
			acomulador = 0;
			
			while(contadora <= 100){
			    acomulador = acomulador+contadora;
			    contadora = contadora+1;
			}
			System.out.println(acomulador);
		}
		public static void ex23(Scanner sc){
			
			int contadora = 2;
			
			int numero = 0;
			
			while(contadora<=500){
			    numero = numero+contadora;
			    contadora = contadora+2;
			}
			
			System.out.println(numero);
		}
		public static void ex24(Scanner sc){
			
			int i = 0, base = 3;
			
			while(i<15){
				if(i == 0) {
					System.out.println("O resultado do numero 3 elevado a "+i+" é: 1");
				}
			    i++;
			    System.out.println("O resultado do numero 3 elevado a "+i+" é: "+ base);
			    base = base * 3;
			    
			}
		}
		public static void ex25(Scanner sc){
			
			int base,expoente, i = 1;
			
			System.out.println("Por favor digite o valor da base: ");
			base = sc.nextInt();
			
			System.out.println("Por favor digite o valor do expoente: ");
			expoente = sc.nextInt();
			
			int baseAUX = base;
			
			
			while(i < expoente) {
				
				baseAUX = baseAUX * base;
				i++;
				
			}
			
			System.out.println(base+"^"+expoente+"="+baseAUX);
			sc.close();
		}
		public static void ex26(Scanner sc){
			
			
				int contadora = 0,numero = 0,numeroaux = 1,resultado = 1;
				
				System.out.println(numeroaux);
				while(contadora<=15){
				    resultado = numero+numeroaux;
				    numero = numeroaux;
				    numeroaux = resultado;
				    System.out.println(resultado);
				    contadora = contadora + 1; 
				}
		}
		public static void ex27(Scanner sc){
			
			
				int contadora = 10, c = 0, f = 0;
				
				while(contadora<=100){
				    c = contadora;
				    f = (9*c+160)/5;
				    System.out.println("A conversão de "+c+" °C, para Fahrenheit é "+f+" °F");
				    contadora = contadora + 10;
			}
		}
		public static void ex28(Scanner sc){
			
			int contadora = 1;
			double numero = 0.00, numeroaux = 0.00;
			
			while(contadora<=10){
			    System.out.println(contadora+"° Digite um numero: ");
			    numeroaux = sc.nextDouble();
			    numero = numero+numeroaux;
			    contadora = contadora+1;
			}
			
			System.out.println("A soma dos dez valores é "+numero);
			System.out.println("A media dos dez valores é "+ (numero/10));
			sc.close();
		}
		public static void ex29(Scanner sc){
			
			int contadora = 50, numero = 0;
			
			while(contadora<=70){
			    numero = numero+contadora;
			    contadora = contadora+2;
			}

			System.out.println("A soma dos numeros pares de 50 ate 70 é "+numero);
			System.out.println("A media da soma dos numeros pares de 50 ate 70 é "+(numero/20));
		}
		public static void ex30(Scanner sc){
			
			int quantidade = 0, contadora = 0, x = 1;
			double comprimento = 0.00, largura = 0.00, area = 0.00, total = 0.00;
			while(contadora<=x){
				System.out.println("Você quer adicionar um comodo ? (1) para sim, (2) para não");
				quantidade = sc.nextInt();
			    if(quantidade == 1){
			        x = x+1;
			        System.out.println("Qual o nome do comodo ? ");
			        String nome = sc.next();
			        System.out.println("Qual o comprimento do comodo em metros ? ");
			        comprimento = sc.nextDouble();
			        System.out.println("Qual é a largura do comodo em metros ? ");
			        largura = sc.nextDouble();
			        total = area;
			        area = largura*comprimento;
			        System.out.println("A área do/a "+nome+" é :"+area+"m²");
			        contadora = contadora+1;
			        total = total+area;
			    }else if(quantidade == 2){
			        contadora = x+1;
			        if (area>0){
			            System.out.println("O total da area da casa é: "+total+"m²");
			        }
			    }
			}
			
			
		}
		public static void ex31(Scanner sc){
int maior = 0, menor = 9999, n = 1;
		
		while(n>0){
			System.out.println("Digite um numero: ");
			n = sc.nextInt();
		    if(n>maior){
		        maior = n;
		    }
		    if(n<menor){
		        menor = n;
		    }
		}
		
		System.out.println("o maior numero: "+maior);
		System.out.println("o menor numero: "+menor);
		
		sc.close();
	}
		public static void ex32(Scanner sc){
		
		for(int contadora = 15; contadora <= 200; contadora++){
			System.out.println(contadora*contadora);
		}
		}
		public static void ex33(Scanner sc){
			System.out.println("Você quer ver a tabuada de qual numero ? ");
			int numero = sc.nextInt();

			for (int contadora = 1; contadora <= 10; contadora++) {
				System.out.println(numero + " x " + contadora + " = " + numero * contadora);
			}
			
		}
		public static void ex34(Scanner sc){
			int acomuladora = 0;
			for(int contadora = 1; contadora <= 100; contadora++){
			   acomuladora = acomuladora + contadora;
			    System.out.println(acomuladora);
			}
		
		}
		
		public static void ex35(Scanner sc){

				for(int contadora = 0; contadora <= 20; contadora++){
				    if(contadora%2 != 0){
				    	System.out.println(contadora);
				    }
				}
			
				
		}
		public static void ex36(Scanner sc){
			for(int contadora = 0; contadora <= 20; contadora++){
			    if(contadora%2 != 0){
			    	System.out.println(contadora);
			    }
			}
			
		}
		public static void ex37(Scanner sc){
			int base = 3, potencia = 1;
			
			for(int expoente = 0;expoente <= 15; expoente++){
			    if(expoente != 0){
			        potencia = 1;
			        for(int contadora = 1;contadora <= expoente;contadora++){
			            potencia = potencia * base;
			        }
			        System.out.println(potencia);
			    }
			    if(expoente == 0){
			    	System.out.println(1);
			    }
			}
		}
		public static void ex38(Scanner sc){
			int resultado = 1, contadora;

			System.out.println("Digite o valor da Base: ");
			int b = sc.nextInt();

			System.out.println("Digite o valor do expoente: ");
			int ex = sc.nextInt();

			for (contadora = 1; contadora <= ex; contadora++) {
				resultado = resultado * b;
			}
			
			System.out.println(b+" ^ "+ (contadora-1) +" = "+ resultado);

			sc.close();
		}
		public static void ex39(Scanner sc){
			int nAnterior = 1, principal = 1, seguinte = 0;
			
			System.out.println(nAnterior);
			System.out.println(principal);
			
			for(int contadora = 3; contadora <= 15;contadora++){
			    seguinte = principal+nAnterior;
			    nAnterior = principal;
			    principal = seguinte;
			    System.out.println(seguinte);
			}
		}
		public static void ex40(Scanner sc){
			
			double f = 0.00, c = 0.00;
			
			System.out.println("A conversão de 10 em 10 graus, de celsius para fahrenheit é:");

			for(c = 10; c<=100;c = c+10){
			    f = ((9*c)+160)/5;
			    System.out.println("A conversão de "+c+" graus celsius para Fahrenheit é "+f);
			}
		}
		public static void ex41(Scanner sc){
			int contadora, numero = 1, fatorial = 0;
			
			for(contadora = 1;contadora <= 10; contadora++){
			    if(contadora % 2 == 1){
			        fatorial = 1;
			        numero = contadora;
			        do{
			            fatorial = fatorial*numero;
			            numero = numero-1;
			        }while(numero>1);
			        System.out.println("o numero impar "+contadora+" tem o fatorial de "+fatorial);
			    }
			}
		}
		public static void ex42(Scanner sc){
			
			int contadora = 15;
			
			do{
				System.out.println(contadora+"² é igual a "+contadora*contadora);
			    contadora = contadora+1;
			}while(contadora <= 201);

		}
		public static void ex43(Scanner sc){
			
			int contadora = 2, par = 0;
			
			do{
			    par = par+2;
			    System.out.println(par);
			    contadora = contadora + 2;
			}while(contadora<500);

		}
		public static void ex44(Scanner sc){
			int contadora = 1;
			do{
			    if(contadora%4 == 0){
			    	System.out.println(contadora);
			    }
			    contadora = contadora + 1;

			}while(contadora<200);
			
		}
		
		public static void ex45(Scanner sc){
			
			int contadora = 1, acomuladora = 0;
			
			do{
			    System.out.println(acomuladora);
			    acomuladora = acomuladora*2+1;
			    contadora = contadora+1;
			}while(contadora<=65);
		}
		public static void ex46(Scanner sc){
			int contadora = 1, soma = 0;

			do {
				System.out.println("Digite um numero: ");
				int numero = sc.nextInt();
				soma = numero + soma;
				contadora = contadora + 1;
			} while (contadora < 15);
			System.out.println(soma);
			sc.close();
		}
		public static void ex47(Scanner sc){
			
			int numero = 0, contadora = 0, soma = 0;
			double media = 0.00;
			do {
				System.out.println("Digite um numero: ");
				numero = sc.nextInt();

				if (numero >= 0) {
					soma = numero + soma;
					contadora = contadora + 1;
					media = soma / contadora;
				}

			} while (numero > 0);

			System.out.println("A soma de todos os numeros é " + soma);
			System.out.println("A quantidade de numeros digitados foi de " + contadora);
			System.out.println("A media dos numeros foi de " + media);
		}
		
		public static void ex48(Scanner sc){
			int contadora = 1, fat = 1;

			do {
				fat = fat * contadora;
				if (contadora % 2 != 0) {
					System.out.println(contadora + " = " + fat);
				}
				contadora = contadora + 1;

			} while (contadora <= 10);

		}
		public static void ex49(Scanner sc){
			int quantidade = 0;
			double total = 0.00;
			do{
				System.out.println("Você quer adicionar um comodo ? (1) para sim, (2) para não");
				quantidade = sc.nextInt();
			    if(quantidade == 1){
			    	System.out.println("Qual o nome do comodo ? ");
			    	String nome = sc.next();
			    	System.out.println("Qual o comprimento do comodo em metros ?");
			    	double comprimento = sc.nextDouble();
			    	System.out.println("Qual é a largura do comodo em metros ?");
			    	double largura = sc.nextDouble();
			        double area = largura*comprimento;
			        System.out.println("A área do/a "+nome+" é :"+area+"m²");
			        total = total+area;
			    }
			}while(quantidade != 2);
			
			System.out.println("O total da area da casa é:"+total+"m²");
			
			
		}
		public static void ex50(Scanner sc){
			int maior = 0, menor = 9999, n = 1;

			System.out.println("Digite um numero inteiro positivo ou um negativo para encerra a contagem");

			do {
				System.out.println("Digite o numero: ");
				n = sc.nextInt();
				if (n > maior) {
					maior = n;
				}
				if (n < menor) {
					menor = n;
				}
			} while (n > 0);
			System.out.println("O maior numero digitado foi: " + maior);
			System.out.println("O menor numero digitado foi: " + menor);
		}
		public static void ex51(Scanner sc){
			boolean contadora = true;
			
			System.out.println("Agora iremos começar a calcular para você a sua conta");
			do {
				System.out.println("Digite o numero do dividendo: ");
				int dividendo = sc.nextInt();
				
				System.out.println("Digite o numero do divisor: ");
				int divisor = sc.nextInt();
				
				if(dividendo%divisor == 0) {
					System.out.println("Quociente é = "+dividendo/divisor);
				}else {
					System.out.println("O quociente não sera inteiro");
				}
				System.out.println("Quer realizar outra conta de divisão que apresente o quociente como inteiro? Digite (1) para sim, (2) para não: ");
				int resposta = sc.nextInt();
				
				if(resposta == 2){
			        contadora = false;
			    }else{
			        contadora = true;
			    }
				
			}while(contadora != false);
			
			sc.close();
		}
		}
	
	

	
			

