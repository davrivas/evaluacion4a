package edu.cristian.evaluacion4a.modelo.dao.jpa;

import edu.cristian.evaluacion4a.modelo.dao.CuentaFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Cuenta;
import java.time.LocalDate;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class CuentaFacade extends AbstractFacade<Cuenta> implements CuentaFacadeLocal {

    @PersistenceContext(unitName = "evaluacion4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentaFacade() {
        super(Cuenta.class);
    }

    @Override
    public Cuenta cuentaMasMovimientosUltimoMes() {
        try {
            LocalDate hoy = LocalDate.now();
            LocalDate primerDiaMes = hoy.withDayOfMonth(1);
            
            TypedQuery<Cuenta> q = getEntityManager().createQuery("SELECT c FROM Cuenta c "
                    + "INNER JOIN c.movimientoCuentaList m "
                    + "WHERE m.size = (SELECT max(m.size) FROM Cuenta) "
                    + "AND m.fecha BETWEEN :primero AND :hoy", Cuenta.class);
            q.setParameter("primero", primerDiaMes);
            q.setParameter("hoy", hoy);
            return q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
