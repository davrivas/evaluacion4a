package edu.cristian.evaluacion4a.modelo.dao.jpa;

import edu.cristian.evaluacion4a.modelo.dao.CiudadFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Ciudad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CiudadFacade extends AbstractFacade<Ciudad> implements CiudadFacadeLocal {

    @PersistenceContext(unitName = "evaluacion4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadFacade() {
        super(Ciudad.class);
    }

}
