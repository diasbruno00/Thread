package threds;

public class ThreadExtends extends Thread{
	
    private String nome;
    
    public ThreadExtends(String nome) {
    	this.nome = nome;
    }
    
    public void run() {
    	for(int i = 0 ; i < 10; i++) {
    		System.out.println(nome + " : " + i);
    	}
    	System.out.println(nome + " finalizou \n");
    }
}
