package br.projeto.fai06;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
	String array[] = new String[4];
        
        array[0] = "civic";
        array[1] = "gol";
        array[2] = "palio";
        array[3] = "uno";
        
        for (String iteracao : array) {        	
        	
        	System.out.println("Nome do carro: "+iteracao);
        	
		}
        
        System.out.println("\n----------------------\n");
        
        for (String iteracao : array) {
        	array[1] = "L200";
            System.out.println("Nome do carro: "+iteracao);
		}
        for (String iteracao: array) {
			array[array.length-1]="gol";
			System.out.println(iteracao);
		}
        
	}

}
