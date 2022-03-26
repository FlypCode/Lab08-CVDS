
package edu.eci.cvds.samples.services;

import edu.eci.cvds.sampleprj.dao.PersistenceException;

public class ExcepcionServiciosAlquiler extends Exception {
	
	public static final String CLIENTE_NO_EXISTENTE = "El cliente no esta registrado."; 
	public static final String ITEM_NO_EXISTENTE = "El item no esta registrado."; 
	public static final String ERROR_CLIENTE = "Se produjo un error al consultar el cliente con id. "; 
	public static final String ERROR_CLIENTES = "Se produjo un error al consultar los clientes. "; 
	public static final String ERROR_ITEM = "Se produjo un error al consultar el item con id "; 
	public static final String ERROR_TIPO_ITEM = "Se produjo un error al consultar el tipo item con id ";
	public static final String ERROR_ITEMS = "Se produjo un error al consultar los items disponibles. "; 
	public static final String TIPO_ITEM_NO_EXISTENTE = "El tipo del item no esta registrado.";
	public static final String ERROR_TIPO_ITEMS = "Se produjo un error al consultar los tipos de los items. ";
	public static final String ERROR_DIAS_RENTA = "El numero de dias ingresado no es válido.Debe ser mayor o igual a 1";
	public static final String ERROR_REGISTRAR_ALQUILER = "Se produjo un error al registrar el alquiler.";
	public static final String ERROR_REGISTRAR_CLIENTE = "Se produjo un error al registrar el cliente.";
	public static final String ERROR_ACTUALIZAR_TARIFA = "Se produjo un error al actualizar la tarifa.";
	public static final String ERROR_REGISTRAR_ITEM = "Se produjo un error al registrar el item.";
	public static final String ERROR_VETAR_CLIENTE = "Se produjo un error al intentar vetar al cliente";
	public static final String ERROR_ITEM_RENTADO_CLIENTE = "Se produjo un error al intentar ingresa el item rentado al cliente";
	public static final String ERROR_CONSULTAR_ITEMS_RENTADOS_CLIENTE = "Se produjo un error al consultar los items rentados del cliente";
	
	
	public ExcepcionServiciosAlquiler(String string, PersistenceException ex) {
		super(string, ex);
	}

	public ExcepcionServiciosAlquiler(String string) {
		super(string);
	}

}