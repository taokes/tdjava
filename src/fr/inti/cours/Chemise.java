/**
 * 
 */
package fr.inti.cours;


/**
 * @author taokes
 *
 */
public class Chemise {
	
	int id;
	char couleur;
	float prix;
	String description;
	int quantite;
	static int stock = 0 ;

	void ajouterChemise(int nombre) {
	quantite+= nombre;
	}
	void dimunierChemise(int nombre) {
	quantite-= nombre;
	}
	void afficherInfoChemise() {
	System.out.println(id+"  "+ description);
	
	if ( stock >20) {
		System.out.println("Super je suis riche ");
	} else {
		System.out.println("hélas je suis pauvre ");
	}
	
	System.out.println("j'ai "+ stock + " chemises");
	}
	
	

	public Chemise(int id, String description, int quantite) {
		super();
		stock += quantite ;
		this.id = id;
		this.description = description;
		this.quantite = quantite;
	}
	/**
	 * 
	 */
	public Chemise() {
		stock ++ ;
	}
	
	
	
	

}








