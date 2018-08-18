/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cristian.evaluacion4a.controlador.consultas;

import edu.cristian.evaluacion4a.modelo.dao.CuentaFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Cuenta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value="cuentaControlador")
@RequestScoped
public class CuentaControlador {
    
    @EJB
    private CuentaFacadeLocal cfl;
    private List<Cuenta> todasLasCuentas;

    /** Creates a new instance of CuentaControlador */
    public CuentaControlador() {
    }

    public List<Cuenta> getTodasLasCuentas() {
        return cfl.findAll();
    }

}
