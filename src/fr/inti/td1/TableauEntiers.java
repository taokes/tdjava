package fr.inti.td1;



public class TableauEntiers{
	
	public static void afficher(int[] t){
		for(int i=0; i<t.length; i++)
			System.out.print(" " + t[i]);
		System.out.println();
	}

	

	
	public static int calculerSomme(int[] t){
		int somme = 0 ;
		for(int i=0; i<t.length; i++) {
			somme = somme + t[i] ;
		}
		return somme;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int somme( int[] t){
		int s=0;
		for(int i=0; i<t.length; i++)
			s+= t[i];
		return s;
	}

	public static int minimum( int[] t){
		int min= t[0];
		for(int i=1; i<t.length; i++)
			if(min > t[i])
				min= t[i];
		return min;
	}

	public static int indiceMaxi(int[] t){
		int iMax= 0;
		for(int i=1; i<t.length; i++)
			if(t[i] > t[iMax])
				iMax= i;
		return iMax;
	}

	public static int[] opposes(int[] t){
		int[] tRes= new int[t.length];
		for(int i=0; i<t.length; i++)
			tRes[i]= -t[i];
		return tRes;
	}

	public static void echanger(int[] t, int i, int j) {
		int tmp= t[i];
		t[i]= t[j];
		t[j]= tmp;
	}

	public static void inverserOrdre(int[] t) {
		int l = t.length;
		for(int i=0; i<l/2; i++)
			echanger(t, i, l-i-1);
	}

	public static boolean testerEgalite(int[] t1, int[] t2){
		if (t1.length != t2.length)
			return false;
		for (int i=0; i<t1.length ; i++)
			if (t1[i] != t2[i])
				return false;
		return true;
	}

	public static int[] copier(int[] t){
		int[] tCopie= new int[t.length];
		for(int i=0; i<t.length; i++)
			tCopie[i]= t[i];
		return tCopie;
	}

	public static void triBulles(int t[]){
		int l = t.length;
		boolean estTrie = false;
		while (!estTrie){
			estTrie = true;
			for(int i = 1; i <l; i++)
				if(t[i-1]>t[i]){
					echanger(t, i-1, i);
					estTrie = false;
				}
			l = l-1;		
		}
	}
	
	
	public static int[]  remplirTab(int[] t) {
		
		int[]	resultat = t ;
		for(int i=0; i<t.length; i++) {
			resultat[i] = 2*i ;
		}
		return resultat;
	
	}
	
	public static void main(String[] args){
		int[] t = new int [5];
		
		t = remplirTab(t) ;
		
	//	calculerSomme(t) ;
		
		
		System.out.println("Le resultat de la fonction calculerSomme(t) "+ calculerSomme(t) );
		
		
		
		
		
		/*
		
		for(int i=0; i<t.length; i++)
			t[i]= 2*i;
		t[14] = 50;
		t[10] = -2;

		afficher(t);
		System.out.println("La somme des elements est " + somme(t));
		System.out.println("Le min des elements est " + minimum(t));
		System.out.println("L'indice du max des elements est " + indiceMaxi(t));
		System.out.println("Le tableau des opposes est: ");
		afficher(opposes(t));
		System.out.println("Le tableau dans l'ordre inverse est: ");
		inverserOrdre(t);
		afficher(t);

		System.out.println("Le tableau trié est: ");
		triBulles(t);
		afficher(t);
		
		int[] t1 = {1, 2, 3};
		int[] t2 = {1, 2, 3, 4};
		System.out.println(testerEgalite(t1, t2));
		int[] t3 = copier(t1);
		afficher(t1);
		afficher(t3);*/
	}

}
