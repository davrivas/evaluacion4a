/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cristian.evaluacion4a.modelo.dao.jpa;

import edu.cristian.evaluacion4a.modelo.dao.MovimientoCuentaFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.MovimientoCuenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MovimientoCuentaFacade extends AbstractFacade<MovimientoCuenta> implements MovimientoCuentaFacadeLocal {

    @PersistenceContext(unitName = "evaluacion4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovimientoCuentaFacade() {
        super(MovimientoCuenta.class);
    }

}
