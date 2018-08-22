package edu.cristian.evaluacion4a.controllers;

import edu.cristian.evaluacion4a.modelo.dao.CuentaFacadeLocal;
import edu.cristian.evaluacion4a.modelo.dao.MovimientoCuentaFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Cuenta;
import edu.cristian.evaluacion4a.modelo.entidades.MovimientoCuenta;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "cuentaController")
@ViewScoped
public class CuentaController implements Serializable {

    @EJB
    private CuentaFacadeLocal cfl;
    @EJB
    private MovimientoCuentaFacadeLocal mcfl;
    private Cuenta cuentaSeleccionada = new Cuenta();
    private MovimientoCuenta nuevoMovimiento = new MovimientoCuenta();
    // Tuve que sacar el dia de hace un año y convertirlo en Date para hacer la comparacion en la vista
    private java.util.Date cdtYear = java.sql.Date.valueOf(LocalDate.now().minusYears(1));

    public CuentaController() {
    }

    public Cuenta getCuentaSeleccionada() {
        return cuentaSeleccionada;
    }

    public void setCuentaSeleccionada(Cuenta cuentaSeleccionada) {
        this.cuentaSeleccionada = cuentaSeleccionada;
    }

    public MovimientoCuenta getNuevoMovimiento() {
        return nuevoMovimiento;
    }

    public void setNuevoMovimiento(MovimientoCuenta nuevoMovimiento) {
        this.nuevoMovimiento = nuevoMovimiento;
    }

    public Date getCdtYear() {
        return cdtYear;
    }

    public void seleccionarCuenta(Cuenta c) {
        cuentaSeleccionada = c;
    }

    public void nuevoMovimientoCuenta(String tipoMovimiento) {
        nuevoMovimiento.setFecha(new Date());
        nuevoMovimiento.setCuenta(cuentaSeleccionada);
        nuevoMovimiento.setTipoMovimiento(tipoMovimiento);
    }

    public void nuevoMovimientoEnList() {
        if (cuentaSeleccionada.getMovimientoCuentaList().isEmpty() || cuentaSeleccionada.getMovimientoCuentaList() == null) {
            cuentaSeleccionada.setMovimientoCuentaList(new ArrayList<>());
        }

        cuentaSeleccionada.getMovimientoCuentaList().add(nuevoMovimiento);
    }

    public void consignacion() {
        nuevoMovimientoCuenta("Consignacion");
        cuentaSeleccionada.setSaldo(cuentaSeleccionada.getSaldo() + nuevoMovimiento.getValor());
        mcfl.create(nuevoMovimiento);
        nuevoMovimientoEnList();
    }

    public void retiro() {
        nuevoMovimientoCuenta("Retiro");
        cuentaSeleccionada.setSaldo(cuentaSeleccionada.getSaldo() - nuevoMovimiento.getValor());
        mcfl.create(nuevoMovimiento);
        nuevoMovimientoEnList();
    }
}
