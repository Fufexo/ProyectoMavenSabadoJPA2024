package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class ClassClienteImp implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
        EntityManager em=fabr.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        System.out.println("Cliente registrado en la BD correctamente");
        em.getTransaction().commit();
        em.close();
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		em.merge(cliente);
		System.out.println("Cliente actualizado en la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblCliente elim = em.merge(cliente);
		em.remove(elim);
		System.out.println("Cliente eliminado de la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblCliente buscliente = em.find(TblCliente.class, cliente.getIdcliente());
		em.getTransaction().commit();
		em.close();
		return buscliente;
	}

	@Override
	public List<TblCliente> ListadoCliente() {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		List<TblCliente> listadoclientes=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadoclientes;
	}

}
