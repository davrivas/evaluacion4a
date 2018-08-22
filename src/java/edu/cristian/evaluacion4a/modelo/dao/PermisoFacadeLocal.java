package edu.cristian.evaluacion4a.modelo.dao;

import edu.cristian.evaluacion4a.modelo.entidades.Permiso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PermisoFacadeLocal {

    void create(Permiso permiso);

    void edit(Permiso permiso);

    void remove(Permiso permiso);

    Permiso find(Object id);

    List<Permiso> findAll();

    List<Permiso> findRange(int[] range);

    int count();

}
