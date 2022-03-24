package busca;

public class search {

	public static void main(String[] args) {

		
		  int a [] = {1,54,65,7,6};
	   System.out.println( Linear(a));
		  
	}

	 public static int Linear(int vet[]) {
	         if(vet.length == 1 || vet.length == 0) {
	        	   return vet.length;
	         }
		      
	          for(int i = 0; i<= vet.length; i++) {
                      if(vet[i] == 65) {
                    	  return i;
                      }
	          }
	          return 1;
	 }
	         

	
}
