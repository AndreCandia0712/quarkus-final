package com.pepe.mirest.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String password;
    @Column (name = "telefono")
    private int teñlefono;
    public Estudiante(){
        id =0;
        nombre = "NA";
        apellido = "NN";
        password = "NN";
        teñlefono = 0;
    }
    public Estudiante(int id, String nombre, String apellido, String password, int teñlefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.teñlefono = teñlefono;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getPassword() {
        return password;
    }
    public int getTelefono() {
        return teñlefono;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setTelefono(int teñlefono) {
        if(teñlefono < 0){
            throw new IllegalArgumentException("El número de teléfono no puede ser negativo");
        }
        this.teñlefono = teñlefono;
    }
}
