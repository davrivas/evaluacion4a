/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cristian.evaluacion4a.controlador.consultas;

import edu.cristian.evaluacion4a.modelo.dao.SucursalFacadeLocal;
import edu.cristian.evaluacion4a.modelo.entidades.Sucursal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value="sucursalControlador")
@RequestScoped
public class SucursalControlador {
@EJB

private SucursalFacadeLocal sfl;
private List<Sucursal> todasLasSucursales;

    public SucursalControlador() {
    }

    public List<Sucursal> getTodasLasSucursales() {
        return sfl.findAll();
    }

}
