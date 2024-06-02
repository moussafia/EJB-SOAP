package metier.session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Compte;


@Stateless(name="BK")
public class BanqueEJB implements IBanqueLocal, IBanqueRemote{
	
	@PersistenceContext(unitName = "UP_BANQUE")
	private EntityManager em;

	@Override
	public void addCompte(Compte c) {
		em.persist(c);
		
	}

	@Override
	public List<Compte> getAllCompte() {
		Query req = em.createQuery("select c from Compte c where c.active = true");
		return req.getResultList();
	}

	@Override
	public Compte getCompte(Long code) {
		Compte cp = em.find(Compte.class, code);
		if(cp == null) throw new RuntimeException("compte introuvable");
		return cp;
	}

	@Override
	public void verser(double mt, Long code) {
		Compte cp = getCompte(code);
		cp.setSolde(cp.getSolde() + mt);
		
	}

	@Override
	public void retirer(double mt, Long code) {
		Compte cp = getCompte(code);
		cp.setSolde(cp.getSolde() - mt);
		
	}

	@Override
	public void virement(double mt, Long cpte1, Long cpte2) {
		retirer(mt, cpte1);
		retirer(mt, cpte2);
		
	}

	@Override
	public void updateCompte(Compte c) {
		em.merge(c);
		
	}

	@Override
	public void suprimmerCompte(Long code) {
		Compte c = getCompte(code);
		em.remove(c);
		
	}

}
