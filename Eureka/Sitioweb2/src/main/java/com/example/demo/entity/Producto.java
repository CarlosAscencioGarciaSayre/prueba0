package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@Column (name="id")
	private Long id;
	@Column (name="codigo")
	private String codigo;
	@Column (name="nombre")
	private String nombre;
	@Column (name="marca")
	private String marca;
	@Column (name="modelo")
	private String modelo;
	@Column (name="precio")
	private double precio;
	@Column (name="stcck")
	private int stcck;
	@Column (name="fabricacion")
	private int fabricacion;
	@Column (name="foto")
	private String correo;
	
	public Producto() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStcck() {
		return stcck;
	}
	public void setStcck(int stcck) {
		this.stcck = stcck;
	}
	public int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
} 
