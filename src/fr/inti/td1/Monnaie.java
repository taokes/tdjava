package fr.inti.td1;



public class Monnaie{

	public static void usage(){
		System.err.println("Usage : <somme>");
	}

	public static void afficheMonnaie (int[] rep, int[] val){
		for (int i = 0; i < rep.length ; ++i)
			System.out.println("Nbre de billets de  " + val[i] + "  euros:  " + rep[i]);
	}

	public static int[] calculMonnaie (int somme, int[] val)
	{
		int n = val.length;
		int[] r = new int[n];

		for (int i = 0; (i < n && somme != 0) ; i++)
			while (somme >= val[i]) 
			{
				r[i]++;    
				somme = somme - val[i];
			}
		return r;
	}

	public static void main(String[] arg){
		if (arg.length == 0)
			usage();
		else
		{
			int[] val = {100, 50, 20, 10, 5, 2, 1};
			int a = Integer.parseInt(arg[0]);
			int [] t = calculMonnaie(a, val);
			afficheMonnaie(t, val);
		}
	}
}
