package edu.cristian.evaluacion4a.modelo.dao.jpa;

import edu.cristian.evaluacion4a.modelo.dao.PermisoFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Permiso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PermisoFacade extends AbstractFacade<Permiso> implements PermisoFacadeLocal {

    @PersistenceContext(unitName = "evaluacion4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PermisoFacade() {
        super(Permiso.class);
    }

}
