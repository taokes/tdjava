package fr.inti.td1;



public class Arithmetique {

	public static int pgcd (int a, int b){
		int c;

		if (b == 0)
			return a;
		while (  ( c =  a % b )!= 0 ){
			a = b;
			b = c;
		}
		return b;
	}

	public static int ppcm (int a , int b){
		if ( a == 0 || b == 0)
			return 0;
		return a/pgcd (a,b) * b;
	}


	public static boolean premier (int n){
		if ( n <= 3 ) 
			return n == 2 || n == 3 ;
		if (n % 2 == 0)
			return false;
		for (int i = 3 ; i * i <= n ; i += 2)
			if ( n % i == 0 )
				return false;
		return true;
	}

	public static void premiersEntre (int min, int max){
		if ( min <= 2 && max >= 2 )
			System.out.print ( "2 ");
		for (int i = min + 1 - ( min & 1 ); i <= max ; i += 2)
			if  (premier(i))
				System.out.print ( i + " "); 
		System.out.println();
	}

	public static void main(String args[]){
		int a = 18;
		int b = 24;

		System.out.println ("Le pgcd de " + a + " et " + b + " est " 
				+pgcd(a,b));
		System.out.println ("Le ppcm de " + a + " et " + b + " est "
				+ppcm(a,b));

		premiersEntre (a, b);
	}   
}
