package edu.cristian.evaluacion4a.modelo.dao.jpa;

import edu.cristian.evaluacion4a.modelo.dao.SucursalFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Sucursal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SucursalFacade extends AbstractFacade<Sucursal> implements SucursalFacadeLocal {

    @PersistenceContext(unitName = "evaluacion4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SucursalFacade() {
        super(Sucursal.class);
    }

}
