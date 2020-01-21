/**
 * 
 */
package fr.inti.cours;

/**
 * @author taokes
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			Chemise maChemise;
			maChemise=new Chemise(21,"Une belle chemise en coton 100 %" , 3);
			maChemise.couleur='R';
			Chemise madeuxiemeChemise;
			maChemise.afficherInfoChemise();
			madeuxiemeChemise=new Chemise(22,"Une belle chemise en satin 100 %" , 13);
			
			
			madeuxiemeChemise.afficherInfoChemise();
	}
	

}
