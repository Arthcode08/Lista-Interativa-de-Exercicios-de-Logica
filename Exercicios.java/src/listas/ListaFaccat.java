package listas;
import java.util.Scanner;

public class ListaFaccat{
	
	
	
	public static void ex05(Scanner sc){
		System.out.println("-----Exercício 05-----");
		System.out.println(" Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.");
		
		
		System.out.println("Valor:");
		int a = sc.nextInt();
		
		System.out.println("O antecessor do valor é:"+(a -1));
		System.out.println("---------------------------------");
	}
	
	public static void ex06(Scanner sc) {
		
		System.out.println("-----Exercício 06-----");
		System.out.println("Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a \r\n"+ "área do retângulo. ");
		
		  System.out.print("Base (cm): ");
	        int base = sc.nextInt();

	        System.out.print("Altura (cm): ");
	        int altura = sc.nextInt();
	       
	        System.out.println("Altura:"+(base*altura)+ "cm²");
	        System.out.println("--------------------");
		
	}
	
	public static void ex07(Scanner sc) {
		
		System.out.println("-----Exercício 07-----");
		System.out.println("Idade em anos, meses e dias conertida apenas em dias.");
		System.out.println("É considerado que o ano tem 365 dias e o mês 30 dias.\n");
		
		 System.out.print("Anos: ");
	        int idadeDias = (sc.nextInt() * 365);

	        System.out.println("Meses desde o seu últmo aniversário: ");
	        idadeDias += (sc.nextInt()) * 30;

	        System.out.println("Dia em que você faz aniversário: ");
	        int diaAniversario = sc.nextInt();

	        System.out.println("Dia do mês atual: ");
	        int diaMes = sc.nextInt();
		
	        if(diaAniversario > diaMes){
	        	idadeDias -=(diaAniversario - diaMes);
	         }else if(diaAniversario < diaMes){
	        	 idadeDias += (diaMes - diaAniversario); 
	         }
	        System.out.println("Idade em dias: " + idadeDias);
	        System.out.println("--------------------");
	}
	
	public static void ex08(Scanner sc) {
		System.out.println("--- Exercício 08 ---");
        System.out.println("Percentual de votos brancos, nulos e válidos.\n");

        System.out.print("Total de eleitores do município: ");
        int totalEleitores = sc.nextInt();
        int total = totalEleitores;
        
        float votosBrancos;
        float votosNulos;
        float votosValidos;
        	
        do{
        	System.out.println("Votos brancos(não pode ultrapassar o total): ");
                votosBrancos = sc.nextInt();
            } while (total < votosBrancos);
        total -= votosBrancos;

        do {
            System.out.print("Votos nulos (não pode ultrapassar o total): ");
            votosNulos = sc.nextInt();
        } while (total < votosNulos);

        total -= votosNulos;

        do {
            System.out.print("Votos válidos (não pode ultrapassar o total): ");
            votosValidos = sc.nextInt();
        } while (total < votosValidos);

        total -= votosValidos;

        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Votos brancos: " + ((votosBrancos / totalEleitores) * 100) + "%");
        System.out.println("Votos nulos: " + ((votosNulos / totalEleitores) * 100) + "%");
        System.out.println("Votos válidos: " + ((votosValidos / totalEleitores) * 100) + "%");

        System.out.println("--------------------");
       

        	
	}
	
	public static void ex09(Scanner sc) {
		
		System.out.println("--- Exercício 09 ---");
		System.out.println(" Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.Calcular e escrever o valor do novo salário. ");
		
		System.out.println("Por favor insira o Sálario atual(R$):");
		 float salarioAtual = sc.nextFloat();

		 System.out.println("Por favor insira o reajuste (%):");
		 float reajuste = sc.nextFloat()/100;
		 
		 System.out.println("Por favor insira o Sálario atual(R$):");
	
		
	}
	
	public static void ex10(Scanner sc) {
		
		System.out.println("--- Exercício 10 ---");
		System.out.println("O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do \r\n"
				+ "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor \r\n"
				+ "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, \r\n"
				+ "calcular e escrever o custo final ao consumidor. ");
		System.out.println("Por favor insira o valor de fábrica:");
		float valorFab = sc.nextFloat();
		 
		double valorFim = valorFab+(valorFab*0.45);
		valorFim += valorFim *0.28;
		
		System.out.println("O custo final é de : R$"+ valorFim);
		System.out.println("--------------------");
		
	}
	
	public static void ex11(Scanner sc){
		
		System.out.println("--- Exercício 11 ---");
		System.out.println(" Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, \r\n"
				+ "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele \r\n"
				+ "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas \r\n"
				+ "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do \r\n"
				+ "vendedor.");
		
		
		System.out.println("Por favor insira o salário:");
		float salario = sc.nextFloat();


		System.out.println("Por favor insira o valor da comissão:");
		float comissão = sc.nextFloat();
		
		System.out.println("Por favor insira a quantidade de carros vendidos:");
		int vendas = sc.nextInt();
		 
		
		System.out.println("Por favor insira o valor total das vendas:");
		float total = sc.nextFloat();
		
		
		double salariofim = salario +(vendas*comissão) +(vendas*0.5);
		System.out.println("O salário final é de: R$"+salariofim);
		System.out.println("--------------------");
		
	}
	
	public static void ex12(Scanner sc) {
		
		System.out.println("--- Exercício 12 ---");
		System.out.println(" Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor \r\n"
				+ "correspondente em graus Celsius");
		
		System.out.println("Por favor insira a temperatura em Fahrenheit:");
		float Gfahrenheit = sc.nextFloat();		
		
		
		float gCelsius =(Gfahrenheit-32)/9;
		
		if (Gfahrenheit == 212){
			System.out.println("A conversão de Fahrenheit para Celsius é:100 Graus Celsius");
		}else {
			System.out.println("Aqui está a conversão de Fahrenheit para Celsius:" +gCelsius);
		}
	}
	
	public  static void ex13(Scanner sc) {
		
		 System.out.println("--- Exercício 13 ---");
		
		System.out.println("Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. \r\n"
				+ "Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5");
		  
		int[] nota =  new int[3];
		System.out.println("Digite as notas:");
		 nota[0] = sc.nextInt() * 2;
	     nota[1] = sc.nextInt() * 3;
	     nota[2] = sc.nextInt() * 5;
                   
		float mediaFim =(float) (nota[0] + nota[1]+ nota[2])/10;
		
		 System.out.println("Média final do aluno: " + mediaFim);
	        System.out.println("--------------------");
	}
	
	public static void ex14(Scanner sc) {
		
		System.out.println("--- Exercício 14 ---");
		System.out.println(" Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso \r\n"
				+ "contrário escrever NÃO É MAIOR QUE 10! ");
		
	   	System.out.println("Por favor insira um valor");
		float valor =sc.nextFloat();
		
		if (valor <=10) {
			System.out.println("NÃO É MAIOR QUE 10!");
		}else{
			System.out.println("É MAIOR QUE 10!");
	      }
	}
	
	public static  void ex15(Scanner sc) {
		
		System.out.println("--- Exercício 15 ---");
		System.out.println("Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). ");
		
		System.out.println("Por favor insira um valor");
		float valor =sc.nextFloat();
		
		if (valor <0) {
			System.out.println("é um valor negativo");
		}else{
			System.out.println("É um valor positivo");
	   }
	}
	
	public static void ex16(Scanner sc) {
		
		System.out.println("--- Exercício 16 ---");
		
		 System.out.println("As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem \r\n"
		 		+ "compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e \r\n"
		 		+ "escreva o custo total da compra. ");

	        System.out.print("Quantidade de maçãs: ");
	        int quantidadeMaca = sc.nextInt();

	        double precoFinal = (double) quantidadeMaca < 12 ? (quantidadeMaca * 1.3) : quantidadeMaca;

	        System.out.println("Preço final: R$" + precoFinal);
	        System.out.println("--------------------");
		
	}
	
	public static void ex17(Scanner sc) {
		
		System.out.println("--- Exercício 17 ---");
		System.out.println(" Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever \r\n"
				+ "uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o \r\n"
				+ "aluno é aprovado). Escrever também a média calculada.");
		
        System.out.println("Notas das duas avaliações, respectivamente: ");
        float[]nota  = new float[2];
        nota[0] = sc.nextFloat();
        nota[1] = sc.nextFloat();
        float media =(nota[1]+ nota[0])/2;
        if (media >= 6) {
        	System.out.println("Você foi aprovado e essa é sua nota final:"+media);
		} else{
			System.out.println("Você não foi aprovado e essa é sua nota final:"+media);
		}
        System.out.println("--------------------");
		
	}
	
	public static  void ex18(Scanner sc) {
		
		System.out.println("--- Exercício 18 ---");
		System.out.println(" Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela \r\n"
				+ "poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).");
		
		System.out.println("Digite o Ano atual: ");
		int anoAtual =sc.nextInt();
		
		System.out.println("Digite o Ano do seu nascimento: ");
		int anoNasc =sc.nextInt();
		int idade= anoAtual- anoNasc;
		
		System.out.println(idade >= 16 ? "Você poderá votar esse ano." : "Você NÃO poderá votar esse ano.");
        System.out.println("--------------------");
	}
	
	  public static void ex19(Scanner sc){

	        System.out.println("--- Exercício 19 ---");
	        System.out.println("Imprimir o maior de dois valores diferentes.\n");

	        System.out.print("Primeiro valor: ");
	        int a = sc.nextInt();

	        System.out.print("Segundo valor: ");
	        int b = sc.nextInt();

	        if (a == b){
	            System.out.println("Valores iguais.");
	        }else{
	            System.out.println("Maior valor: " + (a > b ? a : b));
	        }
	        System.out.println("--------------------");
	    }

	    public static void ex20(Scanner sc){

	        System.out.println("--- Exercício 20 ---");
	        System.out.println("Imprimir dois valores diferentes em ordem crescente.\n");

	        System.out.print("Primeiro valor: ");
	        int a = sc.nextInt();

	        System.out.print("Segundo valor: ");
	        int b = sc.nextInt();

	        if (a == b){
	            System.out.println("Valores iguais.");
	        }else{
	            System.out.println("Ordem crescente: " + ((a > b) ? b + " | " + a : a + " | " + b));
	        }
	        System.out.println("--------------------");
	    }
	    public static void ex21(Scanner sc){

	        System.out.println("--- Exercício 21 ---");
	        System.out.println("Cálculo da duração (em horas) de uma partida de xadrez que pode durar até, no máximo, 24 horas.\n");

	        System.out.print("Hora início: ");
	        int horaInicio = sc.nextInt();

	        System.out.print("Hora fim: ");
	        int horaFim = sc.nextInt();

	        System.out.println("Duração: " + (horaInicio < horaFim ? (horaFim - horaInicio) : ((horaFim + 24) - horaInicio)) + " hora(s).");
	        System.out.println("--------------------");
	    }

	    public static void ex22(Scanner sc){

	        System.out.println("--- Exercício 22 ---");
	        System.out.println("A jornada de trabalho semanal de um funcionário é de 40 horas.");
	        System.out.println("A hora extra é o valor da hora regular com um acréscimo de 50%.");
	        System.out.println("Imprimir o salário total do mês (será considerado que o mês possui apenas 4 semanas).\n");

	        System.out.print("Salário (R$) por hora: ");
	        float salarioHora = sc.nextFloat();

	        System.out.print("Horas trabalhadas no mês: ");
	        int horasTrabalhadas = sc.nextInt();

	        float salarioFinal = salarioHora * 160;

	        if(horasTrabalhadas > 160){
	            salarioFinal += ((horasTrabalhadas - 160) * salarioHora) * 1.5;
	        }

	        System.out.println(horasTrabalhadas < 160 ? "Jornada de trabalho mensal não concluída." : ("Salário final: R$" + salarioFinal));
	        System.out.println("--------------------");
	    }
	    public static void ex24(Scanner sc){

	        System.out.println("--- Exercício 24 ---");
	        System.out.println("Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.\n" +
	                "Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% \n" +
	                "sobre o que ultrapassar este valor, calcular e escrever o seu salário total.\n");

	        System.out.print("Salário fixo do vendedor: ");
	        float salarioTotal = sc.nextFloat();

	        System.out.print("Valor total das vendas efetuadas pelo vendedor: R$");
	        float valorTotalVendas = sc.nextFloat();

	        if (valorTotalVendas <= 1500){
	            salarioTotal += valorTotalVendas * 0.03;
	        } else{
	            salarioTotal += 1500 * 0.03;
	            salarioTotal += (valorTotalVendas - 1500) * 0.05;
	        }

	        System.out.println("Salário final: R$" + salarioTotal);
	        System.out.println("--------------------");
	    }
	    public static void ex25(Scanner sc){

	        System.out.println("--- Exercício 25 ---");
	        System.out.println("Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. \n" +
	                "Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). \n" +
	                "Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', \n" +
	                "senão escrever a mensagem 'Saldo Negativo'.\n");

	        System.out.print("Número da conta: ");
	        int numeroConta = sc.nextInt();

	        System.out.print("Saldo: ");
	        float saldoInicial = sc.nextFloat();

	        System.out.print("Débito: ");
	        float debito = sc.nextFloat();

	        System.out.print("Crédito: ");
	        float credito = sc.nextFloat();

	        float saldoAtual = saldoInicial - (debito + credito);
	        System.out.println("Saldo atual: R$" + saldoAtual);
	        System.out.println(saldoAtual >= 0 ? "Saldo POSITIVO." : "Saldo NEGATIVO.");
	        System.out.println("--------------------");
	    }
	    public static void ex26(Scanner sc){

	        System.out.println("--- Exercício 26 ---");
	        System.out.println("Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. \n" +
	                "Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). \n" +
	                "Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem \n" +
	                "'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.\n");

	        System.out.print("Quantidade atual em estoque: ");
	        int qtdAtualEstoque = sc.nextInt();

	        System.out.print("Quantidade máxima em estoque: ");
	        int qtdMaxEstoque = sc.nextInt();

	        System.out.print("Quantidade mínima em estoque: ");
	        int qtdMinEstoque = sc.nextInt();

	        float qtdMediaEstoque = (float) (qtdMinEstoque + qtdMaxEstoque) / 2;

	        System.out.println(qtdAtualEstoque >= qtdMediaEstoque ? "NÃO efetuar compra." : "Efetuar compra.");
	        System.out.println("--------------------");
	    }
	    public static void ex27(Scanner sc){

	        System.out.println("--- Exercício 27 ---");
	        System.out.println("Ler um valor e escrever se é positivo, negativo ou zero.\n");

	        System.out.print("Valor: ");
	        int valor = sc.nextInt();

	        System.out.println(valor > 0 ? "Valor POSITIVO." : valor < 0 ? "Valor NEGATIVO." : "Valor igual a ZERO.");
	        System.out.println("--------------------");
	    }
	    public static void ex28(Scanner sc){

	        System.out.println("--- Exercício 28 ---");
	        System.out.println("Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.\n");

	        int[] valor = new int[3];

	        System.out.print("Primeiro valor: ");
	        valor[0] = sc.nextInt();

	        System.out.print("Segundo valor: ");
	        valor[1] = sc.nextInt();

	        System.out.print("Terceiro valor: ");
	        valor[2] = sc.nextInt();

	        System.out.println("Maior valor: " + (valor[0] > valor[1] ? valor[0] : valor[1] > valor[2] ? valor[1] : valor[2]));
	        System.out.println("--------------------");
	    }
	    public static void ex29(Scanner sc){

	        System.out.println("--- Exercício 29 ---");
	        System.out.println("Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.\n");

	        int[] valor = new int[3];

	        System.out.print("Primeiro valor: ");
	        valor[0] = sc.nextInt();

	        System.out.print("Segundo valor: ");
	        valor[1] = sc.nextInt();

	        System.out.print("Terceiro valor: ");
	        valor[2] = sc.nextInt();

	        System.out.println("Soma dos 2 maiores valores: " + (valor[0] > valor[1] ? (valor[1] > valor[2] ? valor[0] + valor[1] : valor[0] + valor[2]) : (valor[0] > valor[2] ? valor[1] + valor[0] : valor[1] + valor[2])));
	        System.out.println("--------------------");
	    }
	    public static void ex30(Scanner sc){

	        System.out.println("--- Exercício 30 ---");
	        System.out.println("Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.\n");

	        int[] valor = new int[3];
	        int[] crescente = new int[3];

	        System.out.print("Primeiro valor: ");
	        valor[0] = sc.nextInt();

	        System.out.print("Segundo valor: ");
	        valor[1] = sc.nextInt();

	        System.out.print("Terceiro valor: ");
	        valor[2] = sc.nextInt();

	        if(valor[0] > valor[1]){
	            if(valor[0] > valor[2]){
	                crescente[2] = valor[0];
	                if(valor[1] > valor[2]){
	                    crescente[1] = valor[1];
	                    crescente[0] = valor[2];
	                }else{
	                    crescente[1] = valor[2];
	                    crescente[0] = valor[1];
	                }
	            }else{
	                crescente[2] = valor[2];
	                crescente[1] = valor[0];
	                crescente[0] = valor[1];
	            }
	        }else{
	            if(valor[1] > valor[2]){
	                crescente[2] = valor[1];
	                if(valor[0] > valor[2]){
	                    crescente[1] = valor[0];
	                    crescente[0] = valor[2];
	                }else{
	                    crescente[1] = valor[2];
	                    crescente[0] = valor[0];
	                }
	            } else{
	                crescente[2] = valor[2];
	                crescente[1] = valor[1];
	                crescente[0] = valor[0];
	            }
	        }

	        System.out.println("Ordem crescente: " + crescente[0] + " | " + crescente[1] + " | " + crescente[2]);
	        System.out.println("--------------------");
	    }
	    public static void ex31(Scanner sc){

	        System.out.println("--- Exercício 31 ---");
	        System.out.println("Ler 3 valores representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.\n" +
	                "OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.\n");

	        System.out.print("Lado A: ");
	        int a = sc.nextInt();

	        System.out.print("Lado B: ");
	        int b = sc.nextInt();

	        System.out.print("Lado C: ");
	        int c = sc.nextInt();

	        boolean triangulo = false;

	        if(a > (b + c)){
	            triangulo = false;
	        }else if(b > (a + c)){
	            triangulo = false;
	        }else if(c > (a + b)){
	            triangulo = false;
	        }else{
	            triangulo = true;
	        }

	        System.out.println(triangulo ? "Formam um triângulo." : "NÃO formam um triângulo.");
	        System.out.println("--------------------");
	    }
	    public static void ex32(Scanner sc){

	        System.out.println("--- Exercício 32 ---");
	        System.out.println("Ler o nome de 2 times e o número de gols marcados na partida (para cada time). \n" +
	                "Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.\n");

	        sc.nextLine();

	        System.out.print("Time da casa: ");
	        String timeCasa = sc.nextLine();

	        System.out.print("Time de fora: ");
	        String timeFora = sc.nextLine();

	        System.out.print("Gols do " + timeCasa + ": ");
	        int golCasa = sc.nextInt();

	        System.out.print("Gols do " + timeFora + ": ");
	        int golFora = sc.nextInt();

	        System.out.println(golCasa > golFora ? timeCasa + " VENCEU!" : golFora > golCasa ? timeFora + " VENCEU!" : "EMPATE!");
	        System.out.println("--------------------");
	    }

	    public static void ex33(Scanner sc){

	        System.out.println("--- Exercício 33 ---");
	        System.out.println("Ler dois valores e imprimir uma das três mensagens a seguir:\n" +
	                "Números iguais\n" +
	                "Primeiro é maior\n" +
	                "Segundo maior\n");

	        System.out.print("Primeiro valor: ");
	        int a = sc.nextInt();

	        System.out.print("Segundo valor: ");
	        int b = sc.nextInt();

	        System.out.println(a > b ? "Primeiro é maior." : a < b ? "Segundo é maior." : "Números iguais.");
	        System.out.println("--------------------");
	    }

	    public static void ex35(Scanner sc){

	        System.out.println("--- Exercício 35 ---");
	        System.out.println("Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível\n" +
	                "(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente\n" +
	                "sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.\n" +
	                "Álcool:\n" +
	                "até 20 litros, desconto de 3% por litro\n" +
	                "acima de 20 litros, desconto de 5% por litro\n" +
	                "Gasolina:\n" +
	                "até 20 litros, desconto de 4% por litro\n" +
	                "acima de 20 litros, desconto de 6% por litro\n");

	        sc.nextLine();

	        String tipoCombustivel;
	        do{
	            System.out.print("Tipo de combustível - (a)álcool ou (g)gasolina: ");
	            tipoCombustivel = sc.nextLine();
	        }while(!(tipoCombustivel.equals("a") || tipoCombustivel.equals("g")));

	        int litros;
	        do{
	            System.out.print("Litros vendidos: ");
	            litros = sc.nextInt();
	        }while(litros < 0);

	        double preco;

	        if(tipoCombustivel.equals("a")){
	            preco = 2.9;
	            if(litros <= 20){
	                preco *= 0.97;
	            }else{
	                preco *= 0.95;
	            }
	        } else{
	            preco = 3.3;
	            if(litros <= 20){
	                preco *= 0.96;
	            }else{
	                preco *= 0.94;
	            }
	        }

	        System.out.println("Preço final: R$" + (preco * litros));
	        System.out.println("--------------------");
	    }
	}