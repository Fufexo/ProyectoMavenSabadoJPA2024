package TestEntidades;

import Dao.ClassClienteImp;
import model.TblCliente;

public class TestEntidadCliente {
	public static void main (String[] args) {
		//realizamos la respectiva instancia de las clases ...
		TblCliente cliente = new TblCliente();
		ClassClienteImp crud = new ClassClienteImp();
		//asignamos valores
		cliente.setNombre("nilson ronaldo2");
		cliente.setApellido("ramirez ramirez");
		cliente.setDni("1045789");
		cliente.setEmail("nilson@gmail.com");
		cliente.setTelf("3871459");
		cliente.setSexo("M");
		cliente.setNacionalidad("argentina");
		
		crud.RegistrarCliente(cliente);
	}

}
