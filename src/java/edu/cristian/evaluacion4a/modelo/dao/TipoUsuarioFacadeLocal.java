package edu.cristian.evaluacion4a.modelo.dao;

import edu.cristian.evaluacion4a.modelo.entidades.TipoUsuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoUsuarioFacadeLocal {

    void create(TipoUsuario tipoUsuario);

    void edit(TipoUsuario tipoUsuario);

    void remove(TipoUsuario tipoUsuario);

    TipoUsuario find(Object id);

    List<TipoUsuario> findAll();

    List<TipoUsuario> findRange(int[] range);

    int count();

}
