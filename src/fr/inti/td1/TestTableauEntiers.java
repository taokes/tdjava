package fr.inti.td1;



public class TestTableauEntiers{

	private static void usage(){
		System.err.println("usage : nombre [ nombre ...]");
		System.exit(1);
	}

	public static void main(String[] args){
		if(args.length == 0)
			usage();
		int[] t= new int [args.length];
		for(int i=0; i<args.length; i++)
			t[i]= Integer.parseInt(args[i]);
		TableauEntiers.afficher(t);
		System.out.println("La somme des elements est " + TableauEntiers.somme(t));
		System.out.println("Le min des elements est " + TableauEntiers.minimum(t));
		System.out.println("L'indice du max des elements est " + 
				TableauEntiers.indiceMaxi(t));
		System.out.println(" Le tableau des opposes est: ");
		TableauEntiers.afficher(TableauEntiers.opposes(t));
		TableauEntiers.triBulles(t);
		TableauEntiers.afficher(t);

		System.out.println(" L'ecartype est: " + Stats.ecartype(t));
		System.out.println(" La mediane est: " + Stats.mediane(t));
		System.out.println(" La moyenne est: " + Stats.moyenne(t));
	}
}