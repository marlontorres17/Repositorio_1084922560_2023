/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Interfase;

/**
 *
 * @author ariel
 */
public interface Accion {

    void Agregar();

    void Modificar();

    void Eliminar();
    
    void EliminadoFisico();
    
    void EliminadoLogico();
    
    
    
    Object Consultar();

    String ConsultarWhereAnd();
}