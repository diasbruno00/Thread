package threds;

public class ThreadsArray extends Thread {
	
    private int [] array = new int [10];
    private int inicio;
    private int fim;
    private int resultado;
    

	public void run() {
    	somarArray(array, inicio,fim);
    }
	
	  public void somarArray(int[] array , int inicio, int fim) {
		  
		  for(int i = inicio ; i <= fim; i++) {
	    		resultado += array[i];
	    	}
		  System.out.printf("\nResultado somatoria de uma thread aleatorioa: %d \n" ,resultado);
	  }

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	 
	
    
}
