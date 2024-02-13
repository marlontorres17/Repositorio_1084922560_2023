package com.sena.productoback.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ABaseEntity {
	
	@Column(name = "fecha_creacion", nullable = true)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fecha_modificacion", nullable = true)
	private LocalDateTime fechaModificacion;
	
	@Column(name = "fecha_eliminacion", nullable = true)
	private LocalDateTime fechaEliminacion;
    
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }
    
    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
    public LocalDateTime getFechaEliminacion() {
        return fechaEliminacion;
    }
    
    public void setFechaEliminacion(LocalDateTime fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }
}    
