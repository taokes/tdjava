package fr.inti.td1;



public class Stats{
	public static double moyenne(int[] t){
		return TableauEntiers.somme(t)/(double) t.length;
	}
	public static double ecartype(int[] t){
		double m= moyenne(t);
		double var=0;
		for(int i=0; i<t.length; i++)
			var+= (t[i] -m)*(t[i] -m);
		var/= t.length;
		return Math.sqrt(var);
	}
	public static double mediane(int[] t){
		TableauEntiers.triBulles(t);
		if(t.length % 2 == 1)
			return t[t.length/2];
		else
			return (t[t.length/2 - 1] + t[t.length/2])/2.;
	}
}
