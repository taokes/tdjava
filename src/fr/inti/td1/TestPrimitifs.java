package fr.inti.td1;

public class TestPrimitifs {

	
	static String message1 = "Bonjour";
	static String message2 = "Marhaba" ;
	
	 static void permuter(){
			 String messageTemporaire ;
			 messageTemporaire = message1 ;
			 message1= message2 ;
			 message2 = messageTemporaire ;
	 }
	
	
	
	
	
	static int t = 0;
	
	
	
	
	

	public TestPrimitifs() {
	}

	public static void ajouterCinq() {
		t = t + 5 ;
	}
	
	public static void f(int x) 
	{ 
		x = 5; 
	}
	
	
	public static int ff() 
	{ 
		return 5 ;
	
		
	}

	
	 static void afficher(String str){
			System.out.println("Mes messages "+str);
			System.out.println(" message1 : "+message1);
			System.out.println(" message2 : "+message2);
 }
	
	
	public static void main(String[] argv) { 
		
	
		afficher("avant") ;
		
		permuter() ;
		

		afficher("après") ;
		
		
		
		
		String message ;
		
		message = "Bonjour" ;
		
		String ancienMessage = message;
		
		
		message = "Hello" ;
		
		System.out.println("ancien Message : "+ancienMessage); 
		
		System.out.println("nouveau Message : "+message); 
		
		
		System.out.println("avant l'ajout t : "+t); 
		
		ajouterCinq() ;
		System.out.println("après l'ajout t : "+t); 
	//	System.out.println("y : "+y); 
		
		
		int y = 1; 
		f(y); 
		y = ff() ;
		System.out.println("y : "+y); 
		
		System.out.println(ff()); 
		

		char c = 'a'; 
		int z = c;
		System.out.println(z); 

		float f = 1.5f; //
		System.out.println("f : "+f); 
		float ff = (float) 1.5; 
		System.out.println("ff : "+ff); 
		float g = 0.1f; 
		double h = (double) g; 
		System.out.println(0.1 - h); 
		boolean b = true; 
		int v; // v = b; 
		v = y; 
		
		if (v == y) { 
			System.out.println("v == y"); } 
		else { 
			System.out.println("v != y"); 
		} 
	} 
} 



