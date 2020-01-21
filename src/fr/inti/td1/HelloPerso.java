package fr.inti.td1;


public class  HelloPerso{
	private static void usage() {
		System.err.println("usage : HelloPerso nom");
		System.exit(1);
	}
	public static void main (String[] args){
		if (args.length != 1)
			usage();
		else 
			System.out.println ("Hello " + args[0] + "!");
	}    
} 






