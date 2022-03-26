package edu.eci.cvds.sampleprj.dao.mybatis;

import java.sql.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
//import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;


public class MyBATISClienteDAO implements ClienteDAO {

	@Inject
	  private ClienteMapper clienteMapper;
	

	@Override
	public Cliente consultarCliente(int id) throws PersistenceException {
		try{
			return clienteMapper.consultarCliente(id);
		  }catch (Exception e) {
			  throw new PersistenceException(ExcepcionServiciosAlquiler.ERROR_TIPO_ITEM);
		}
	}


	@Override
	public void registrarCliente(Cliente c) throws PersistenceException {
		try {
			clienteMapper.registrarCliente(c);
		}catch (Exception e) {
			throw new PersistenceException(ExcepcionServiciosAlquiler.ERROR_REGISTRAR_CLIENTE);
		}
		
	}


	@Override
	public List<Cliente> consultarClientes() throws PersistenceException {
		try {
			return clienteMapper.consultarClientes();
		} catch (Exception e) {
			throw new PersistenceException(ExcepcionServiciosAlquiler.ERROR_CLIENTES);
		}
	}


	@Override
	public void agregarItemRentadoACliente(int id, int idit, Date fechainicio, Date fechafin)
			throws PersistenceException {
		try {
			clienteMapper.agregarItemRentadoACliente(id, idit, fechainicio, fechafin);
		} catch (Exception e) {
			throw new PersistenceException(ExcepcionServiciosAlquiler.ERROR_REGISTRAR_ALQUILER);	
		}
	}


	@Override
	public void vetarCliente(long docu, boolean estado) throws PersistenceException {
		try {
			clienteMapper.vetarCliente(docu,estado);
		} catch (Exception e) {
			throw new PersistenceException(ExcepcionServiciosAlquiler.ERROR_VETAR_CLIENTE);
		}
		
	}


	@Override
	public List<Item> consultarItemsRentadosCliente(int docu) throws PersistenceException {
		try {
			return clienteMapper.consultarItemsRentadosCliente(docu);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenceException(ExcepcionServiciosAlquiler.ERROR_CONSULTAR_ITEMS_RENTADOS_CLIENTE);
		}
		 
	}     
	

	
	
}
