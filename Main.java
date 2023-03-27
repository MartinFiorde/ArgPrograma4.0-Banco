import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();

		LocalDate fecha1 = LocalDate.of(2022, 04, 15);
		Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
		Cuenta cuenta2 = new Cuenta(2, true, 350.0f);
		Cuenta[] cuentas1 = { cuenta1, cuenta2 };
		Prestamo prestamo1 = new Prestamo(1, 2000f);
		Prestamo[] prestamos1 = { prestamo1 };
		ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342", "Richard@Fort.com", fecha1, cuentas1,
				2000.0f, prestamos1);
		clientes.add(clienteA1);

		LocalDate fecha2 = LocalDate.of(2021, 05, 30);
		Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
		Cuenta cuenta4 = new Cuenta(2, true, 550.0f);
		Cuenta[] cuentas2 = { cuenta3, cuenta4 };
		Prestamo prestamo2 = new Prestamo(1, 5000f);
		Prestamo[] prestamos2 = { prestamo2 };
		ClienteB clienteB1 = new ClienteB(2l, "Jorge", "Suarez", "12351", "JorgeS@gmail.com", fecha2, cuentas2, 1000.0f,
				prestamos2);
		clientes.add(clienteB1);

		/*
		 * Definir los parametros que van a emplearse para la creación de un cliente.
		 * Establecer un bloque con if statements para determinar si ese cliente, será
		 * creado con caracteristicas de clienteA, B o estudiante. Si el ingreso supera
		 * 2000 y la antiguedad supera los 12 meses, Cliente A Sino, ClienteB Si
		 * ingresos no es mayor a cero, Estudiante
		 */
		LocalDate fechax = LocalDate.of(2021, 05, 30);
		Cuenta cuentax1 = new Cuenta(1, true, 350.0f);
		Cuenta cuentax2 = new Cuenta(2, true, 550.0f);
		Cuenta[] cuentasx = { cuentax1, cuentax2 };
		Prestamo prestamox = new Prestamo(1, 5000f);
		Prestamo[] prestamosx = { prestamox };
		Float ingresox = 0F;
		Long idx = (clientes.get(clientes.size() - 1).getIdCliente() + 1);

		if (ingresox == 0) {
			Estudiante clienteX = new Estudiante(idx, "Pepe", "Honguito", "541234", "PepeH@gmail.com", fechax,
					cuentax1);
			clientes.add(clienteX);
		} else if (ChronoUnit.MONTHS.between(fechax, LocalDate.now()) >= 12 && ingresox >= 2000) {
			ClienteA clienteX = new ClienteA(idx, "Pepe", "Honguito", "541234", "PepeH@gmail.com", fechax, cuentasx,
					ingresox, prestamosx);
			clientes.add(clienteX);
		} else {
			ClienteB clienteX = new ClienteB(idx, "Pepe", "Honguito", "541234", "PepeH@gmail.com", fechax, cuentasx,
					ingresox, prestamosx);
			clientes.add(clienteX);
		}

		System.out.println("Listado despues de agregar Cliente por bloque if");
		System.out.println(clientes);

		/*
		 * Definir un nuevo long dentro de main, llamado idBuscado, generar el codigo
		 * que permita rercorrer el arreglo de clientes, y si encuentra alguno, con
		 * dicho id, lo borre. ArrayList<Cliente> clientes = new ArrayList<>();
		 * clientes.add(cliente); clientes.remove(0);
		 */

		Long idBuscado = 2L;

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getIdCliente() == idBuscado) {
				clientes.remove(i);
				break;
			}
		}

		System.out.println("Listado despues de eliminar por id");
		System.out.println(clientes);

	}
}
