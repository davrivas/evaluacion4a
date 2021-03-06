package edu.cristian.evaluacion4a.modelo.dao.jpa;

import edu.cristian.evaluacion4a.modelo.dao.TipoUsuarioFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.TipoUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TipoUsuarioFacade extends AbstractFacade<TipoUsuario> implements TipoUsuarioFacadeLocal {

    @PersistenceContext(unitName = "evaluacion4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoUsuarioFacade() {
        super(TipoUsuario.class);
    }

}
