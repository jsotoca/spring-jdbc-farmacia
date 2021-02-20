package com.jdbcfarmacia.entities;

public class Laboratory {
	
	public long id_laboratorio;
	public String nombre;
	public boolean vigencia;
	
	
	public Laboratory() {
		super();
	}


	public Laboratory(long id_laboratorio, String nombre, boolean vigencia) {
		super();
		this.id_laboratorio = id_laboratorio;
		this.nombre = nombre;
		this.vigencia = vigencia;
	}
	
	
}
