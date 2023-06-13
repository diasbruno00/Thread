package threds;

public class Main {

	public static void main(String[] args) {
		
		/*
		ThreadExtends t1 = new ThreadExtends("thread1");
		t1.start();
		ThreadExtends t2 = new ThreadExtends("thread2");
		t2.start();
		*/
		
		int[] array = new int [10];
		
		 for(int i = 0 ; i < 10; i++) {
	    		array[i] =  i  ;
	    }

       
		ThreadsArray t1 = new ThreadsArray();
		t1.setArray(array);
		t1.setInicio(0);
		t1.setFim(4);
		

		ThreadsArray t2 = new ThreadsArray();
		t2.setArray(array);
		t2.setInicio(5);
		t2.setFim(9);
		
	
		t1.start();
		t2.start();
		
	    try {
			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    
	    int soma  =  t1.getResultado() + t2.getResultado();
        System.out.println("soma final do array: "+ soma);


		
        System.out.println("Metodo main finalizou");
	}

}
