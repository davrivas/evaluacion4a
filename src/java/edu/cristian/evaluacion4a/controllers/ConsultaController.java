package edu.cristian.evaluacion4a.controllers;

import edu.cristian.evaluacion4a.modelo.dao.CiudadFacadeLocal;
import edu.cristian.evaluacion4a.modelo.dao.CuentaFacadeLocal;
import edu.cristian.evaluacion4a.modelo.dao.SucursalFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Ciudad;
import edu.cristian.evaluacion4a.modelo.entidades.Cuenta;
import edu.cristian.evaluacion4a.modelo.entidades.Sucursal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "consultaController")
@RequestScoped
public class ConsultaController {

    @EJB
    private CuentaFacadeLocal cuentafl;
    @EJB
    private SucursalFacadeLocal sucursalfl;
    @EJB
    private CiudadFacadeLocal ciudadfl;
    
    private List<Cuenta> todasLasCuentas;
    private List<Sucursal> todasLasSucursales;
    private List<Ciudad> todasLasCiudades;

    public ConsultaController() {
    }

    public List<Cuenta> getTodasLasCuentas() {
        return cuentafl.findAll();
    }

    public List<Sucursal> getTodasLasSucursales() {
        return sucursalfl.findAll();
    }

    public List<Ciudad> getTodasLasCiudades() {
        return ciudadfl.findAll();
    }

}
