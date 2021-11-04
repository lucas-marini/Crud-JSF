package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// TODO: Auto-generated Javadoc
/**
 * The Class JPAUtil.
 */
public class JPAUtil {

	/** The factory. */
	private static EntityManagerFactory factory = null;
	
	static {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("CrudJSF");
		}
	}
	
	/**
	 * Gets the entity manager.
	 *
	 * @return the entity manager
	 */
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	/**
	 * Gets the primary key.
	 *
	 * @param entity the entity
	 * @return the primary key
	 */
	public static Object getPrimaryKey(Object entity) {
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}
