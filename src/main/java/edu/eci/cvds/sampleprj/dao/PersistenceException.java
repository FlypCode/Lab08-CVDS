package edu.eci.cvds.sampleprj.dao;

public class PersistenceException extends Exception{
	
	/**
	 * Versión del serial para la excepción
	 */
	private static final long serialVersionUID = 1L;
	public static final String EXCEPCION = "Ha ocurrido una excepción"; 
	
    public PersistenceException(String M) 
    {
        super(M);
    }

	public PersistenceException(String string, org.apache.ibatis.exceptions.PersistenceException e) {
		super(string,e);
	}

}