package metier.service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.entities.Compte;
import metier.session.IBanqueLocal;
@Stateless
@WebService
public class BanqueService {
	
	@EJB
	private IBanqueLocal metier;
	
	@WebMethod //optional
	public void addCompte(@WebParam Long soldeInitial) {
		Compte cp = new Compte(soldeInitial, true, new Date());
		metier.addCompte(cp);
	}
	
	@WebMethod
	public List<Compte> listCompte() {
		return metier.getAllCompte();
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name = "code") Long code) {
		return metier.getCompte(code);
	}
	
	@WebMethod
	public void verser(
			@WebParam(name = "mantant") Long mt,
			@WebParam(name = "code") Long code
			) {
		metier.verser(mt, code);
	}
	
	@WebMethod
	public void retirer(
			@WebParam(name = "mantant") Long mt,
			@WebParam(name = "code") Long code
			) {
		metier.retirer(mt, code);
	}
	
	@WebMethod
	public void virement(
			@WebParam(name = "mantant") Long mt,
			@WebParam(name = "cmpt1") Long c1,
			@WebParam(name = "cmpt2") Long c2
			) {
		metier.virement(mt, c1, c2);
	}

}
