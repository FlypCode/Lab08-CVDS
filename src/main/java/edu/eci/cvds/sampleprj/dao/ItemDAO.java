package edu.eci.cvds.sampleprj.dao;
import org.apache.ibatis.exceptions.PersistenceException;
import edu.eci.cvds.samples.entities.Item;

public interface ItemDAO {

   public void save(Item it) throws PersistenceException;

   public Item load(int id) throws PersistenceException;

}