package edu.cristian.evaluacion4a.modelo.dao;

import edu.cristian.evaluacion4a.modelo.entidades.TipoCuenta;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoCuentaFacadeLocal {

    void create(TipoCuenta tipoCuenta);

    void edit(TipoCuenta tipoCuenta);

    void remove(TipoCuenta tipoCuenta);

    TipoCuenta find(Object id);

    List<TipoCuenta> findAll();

    List<TipoCuenta> findRange(int[] range);

    int count();

}
