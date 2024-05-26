package metier.session;

import java.util.List;

import metier.entities.Compte;

public interface IBanqueRemote {

	public void addCompte(Compte c);
	public List<Compte> getAllCompte();
	public Compte getCompte(Long compte);
	public void verser(double mt, Long code);
	public void retirer(double mt, Long code);
	public void virement(double mt, Long cpte1, Long cpte2);
	public void updateCompte(Compte c);
}
