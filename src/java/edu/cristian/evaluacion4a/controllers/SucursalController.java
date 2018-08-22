package edu.cristian.evaluacion4a.controllers;

import edu.cristian.evaluacion4a.modelo.dao.SucursalFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Sucursal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value="sucursalController")
@ViewScoped
public class SucursalController implements Serializable {
    
    @EJB
    private SucursalFacadeLocal sfl;
    private Sucursal nuevaSucursal = new Sucursal();
    private Sucursal sucursalSeleccionada = new Sucursal();

    public SucursalController() {
    }

    public Sucursal getNuevaSucursal() {
        return nuevaSucursal;
    }

    public void setNuevaSucursal(Sucursal nuevaSucursal) {
        this.nuevaSucursal = nuevaSucursal;
    }

    public void registrarSucursal() {
        sfl.create(nuevaSucursal);
    }
    
    public void seleccionarSucursal(Sucursal s) {
        sucursalSeleccionada = s;
    }
    
    public void eliminarSucursal() {
        sfl.remove(sucursalSeleccionada);
    }
}
