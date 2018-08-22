package edu.cristian.evaluacion4a.modelo.dao;

import edu.cristian.evaluacion4a.modelo.entidades.MovimientoCuenta;
import java.util.List;
import javax.ejb.Local;

@Local
public interface MovimientoCuentaFacadeLocal {

    void create(MovimientoCuenta movimientoCuenta);

    void edit(MovimientoCuenta movimientoCuenta);

    void remove(MovimientoCuenta movimientoCuenta);

    MovimientoCuenta find(Object id);

    List<MovimientoCuenta> findAll();

    List<MovimientoCuenta> findRange(int[] range);

    int count();

}
