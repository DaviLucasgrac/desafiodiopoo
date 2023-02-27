package br.com.desafiodiopoo;

public class principal {

	public static void main(String[] args) {
		package urna;
		import java.util.Scanner;
		public class urna1 {

			public static void main(String[] args) {
				Scanner leia= new Scanner(System.in);
		        Eleitor eleitor=new Eleitor();
		        Candidatos candidato = new Candidatos();
		        int numero = 0;
		        String cadastro="davi";
		        System.out.println("digite '1' para votar e '0' para sair");
		        numero=leia.nextInt();
		        while (numero != 0) {
		        	
		        
		        System.out.println("digite seu nome:  ");
		        eleitor.Nome=leia.nextLine();
		        if (eleitor.Nome==cadastro) {
		        System.out.println("digite o numero do candidato :");
		        candidato.numerocandidato=leia.nextInt();
		       
		        
		        
		        
		        }
		        break;
		        
			}}

		}

		// TODO Auto-generated method stub

	}

}
