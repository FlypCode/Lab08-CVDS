package edu.eci.cvds.sampleprj.dao;

import java.sql.Date;
import java.util.List;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;

public interface ClienteDAO {

	public void registrarCliente(Cliente c) throws PersistenceException;

	public Cliente consultarCliente(int id) throws PersistenceException;

	public List<Cliente> consultarClientes() throws PersistenceException;

	public void agregarItemRentadoACliente(int id, int idit, Date fechainicio, Date fechafin) throws PersistenceException;
	   
    public void vetarCliente(long docu, boolean estado) throws PersistenceException;

	public List<Item> consultarItemsRentadosCliente(int docu) throws PersistenceException;
	
}