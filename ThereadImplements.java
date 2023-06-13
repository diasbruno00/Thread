package threds;

public class ThereadImplements implements Runnable{

	private String nome;
    
    public  ThereadImplements (String nome) {
    	this.nome = nome;
    }
    
	@Override
	public void run() {
		for(int i = 0 ; i < 10; i++) {
    		System.out.println(nome + " : " + i);
    	}
    	System.out.println(nome + " finalizou \n");
	}

}
