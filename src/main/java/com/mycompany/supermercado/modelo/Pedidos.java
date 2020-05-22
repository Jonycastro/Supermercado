/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercado.modelo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
/**
 *
 * @author Jonathan
 */
@Entity
@Table(name="pedidos")
public class Pedidos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPedido;
    
    @Column(name ="fecha")
    private DateTime fecha;
    
    @JoinColumn(name="idUsuarios")
    @ManyToOne
    private Usuarios usuario;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public DateTime getFecha() {
        return fecha;
    }

    public void setFecha(DateTime fecha) {
        this.fecha = fecha;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
