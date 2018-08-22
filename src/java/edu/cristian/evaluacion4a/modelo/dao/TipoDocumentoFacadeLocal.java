package edu.cristian.evaluacion4a.modelo.dao;

import edu.cristian.evaluacion4a.modelo.entidades.TipoDocumento;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoDocumentoFacadeLocal {

    void create(TipoDocumento tipoDocumento);

    void edit(TipoDocumento tipoDocumento);

    void remove(TipoDocumento tipoDocumento);

    TipoDocumento find(Object id);

    List<TipoDocumento> findAll();

    List<TipoDocumento> findRange(int[] range);

    int count();

}
