package edu.cristian.evaluacion4a.modelo.dao;

import edu.cristian.evaluacion4a.modelo.entidades.Cuenta;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CuentaFacadeLocal {

    void create(Cuenta cuenta);

    void edit(Cuenta cuenta);

    void remove(Cuenta cuenta);

    Cuenta find(Object id);

    List<Cuenta> findAll();

    List<Cuenta> findRange(int[] range);

    int count();
    
    Cuenta cuentaMasMovimientosUltimoMes();

}
