package ejercicio3;

public class TestEj3 {

	public static void main(String[] args) {

		Estudiante[] ArrayEstu = new Estudiante[2];
		
		ArrayEstu[0] = new Estudiante();
		ArrayEstu[0].setNombre("Javier");
		ArrayEstu[0].setApellido("Orleans");
		ArrayEstu[0].setComision("43");
		ArrayEstu[0].setEmail("javi@mail.com");
		ArrayEstu[0].setDireccion("69 699");
		
		ArrayEstu[1] = new Estudiante();
		ArrayEstu[1].setNombre("Mariana");
		ArrayEstu[1].setApellido("Girardelli");
		ArrayEstu[1].setComision("10");
		ArrayEstu[1].setEmail("mari@mail.com");
		ArrayEstu[1].setDireccion("69 691");
		
		for(Estudiante e: ArrayEstu) {
			System.out.println(e.tusDatos());
		}		
		
		System.out.println("---------------");
		
		Profesor[] ArrayProfe = new Profesor[3];
		
		ArrayProfe[0] = new Profesor();
		ArrayProfe[0].setNombre("Alberto");
		ArrayProfe[0].setApellido("Balbin");
		ArrayProfe[0].setEmail("albert@mail.com");
		ArrayProfe[0].setCatedra("Anatomia");
		ArrayProfe[0].setFacultad("Medicina");
		
		ArrayProfe[1] = new Profesor();
		ArrayProfe[1].setNombre("Carlos");
		ArrayProfe[1].setApellido("Desiree");
		ArrayProfe[1].setEmail("charly@mail.com");
		ArrayProfe[1].setCatedra("Algoritmos");
		ArrayProfe[1].setFacultad("Ingenieria en Sistemas");
				
		ArrayProfe[2] = new Profesor();
		ArrayProfe[2].setNombre("Ernesto");
		ArrayProfe[2].setApellido("Favalli");
		ArrayProfe[2].setEmail("ef@mail.com");
		ArrayProfe[2].setCatedra("FOD");
		ArrayProfe[2].setFacultad("Informatica");
		
		for(Profesor e: ArrayProfe) {
			System.out.println(e.tusDatos());
		}	
	}

}
