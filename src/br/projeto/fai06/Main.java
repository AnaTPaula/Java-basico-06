package br.projeto.fai06;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
	String[] carros = {"Civic", "Gol", "Palio", "Uno"};
	
	System.out.println("Posição 1: " + carros[10]);
	
        for (String carro : carros) {        	
        	
        	System.out.println("Carro: "+ carro);
		}
        
        System.out.println("\n----------------------\n");
        
        
        carros[1] = "L200";
        
        for (String carro : carros) {
        	
            System.out.println("Carro: "+ carro);
		}
        
        int tamanhoDoNovoArray = carros.length + 1;
        String[] novoArrayDeCarros =
        		new String [tamanhoDoNovoArray];   
 
	        
	        for (int i =0; i < carros.length; i++) {
	        	
	        	String carro = carros[i];
	        	novoArrayDeCarros[i]= carro;
	        	
	        	
	        }
	        
	        novoArrayDeCarros[tamanhoDoNovoArray -1] = "Gol";
	        
	        System.out.println("-----");
	        
	        for (String carro : novoArrayDeCarros)
	        {
	        	System.out.println("Carro: " + carro);
	      
		}
        
	}

}
