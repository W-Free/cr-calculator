package calculadora;

import list.ArrayList;


public class calculadora {
	
	public int calcular(ArrayList<Criatura> bichos) {
		
		int res = 0;
		
		int cantidadTotal = 0;
		int maxCr = -1;
		
		
		
		
		
		bichos.sort(new Comparator<Integer>){
			
		}
		
		for (int i = 0; i < bichos.size(); i++) {
			Criatura actual = bichos.get(i);
			cantidadTotal += actual.getCantidad();
			
			if (maxCr < actual.getCR()) {
				maxCr = actual.getCR();
			}
			
		}
		
		
		

	    a = [1.3216,    1.4831,    1.6447,    1.8062,    1.9677,   2.1292,    2.2907, 2.4522  ,  2.6137  ,  2.7752  ,  2.9367  ,  3.0982 ,   3.2597 ,   3.4212, 
	         3.5827  ,  3.7442  ,  3.9057 ,   4.0673];

		
		
		
		return res ;
	}

}
