//Ejercicio 5: Define una clase con un método main. Crea un alumno que viva en una casa,
//utilizando las 3 clases que tenemos hasta el momento
package org.ieslosremedios.daw1.prog.ut3.practica3;


public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion();
        direccion1.setTipovia("Calle");
        direccion1.setNombrevia("Calvario");
        direccion1.setNumerovia(4);
        direccion1.setNumeroadicional("4ºB");
        direccion1.setCodigopostal(11600);
        direccion1.setLocalidad("Ubrique");
        direccion1.setProvincia("Cádiz");

        Direccion direccion2 = new Direccion();
        direccion2.setTipovia("Calle");
        direccion2.setNombrevia("La Torre");
        direccion2.setNumerovia(16);
        direccion2.setNumeroadicional("1ºA");
        direccion2.setCodigopostal(11600);
        direccion2.setLocalidad("Ubrique");
        direccion2.setProvincia("Cádiz");

        Direccion direccion3 = new Direccion();
        direccion3.setTipovia("Avenida");
        direccion3.setNombrevia("España");
        direccion3.setNumerovia(27);
        direccion3.setNumeroadicional("4ºA");
        direccion3.setCodigopostal(11600);
        direccion3.setLocalidad("Ubrique");
        direccion3.setProvincia("Cádiz");

        Casa casa1 = new Casa();
        casa1.setPrecio(500);
        casa1.setCalificacionenergetica('a');
        casa1.setReferenciacatastral("1234ABCD");
        casa1.setDireccion(direccion1);


        Casa casa2 = new Casa();
        casa2.setPrecio(750);
        casa2.setCalificacionenergetica('b');
        casa2.setReferenciacatastral("5678ZYX");
        casa2.setDireccion(direccion2);

        Casa casa3 = new Casa();
        casa3.setPrecio(625);
        casa3.setCalificacionenergetica('c');
        casa3.setReferenciacatastral("9123FGH");
        casa3.setDireccion(direccion3);

        Alumno alumno1 = new Alumno(); //Nuevo Alumno antes de importar Persona
        alumno1.setNombre("Manuel");
        alumno1.setApellidos("Garcia Candil");
        alumno1.setEdad(18);
        alumno1.setEmail("manuelgarciacandil123ABC@gmail.com");
        alumno1.setRepetidor(false);
        alumno1.setNotamedia(8.5);
        alumno1.setCasa(casa1);
        alumno1.setDireccion(direccion1);

        Alumno alumno2 = new Alumno(); //Nuevo Alumno tras heredar los campos de Persona

        alumno2.setNombre("Pablo");
        alumno2.setApellidos("Gutierrez Pérez");
        alumno2.setPrimerApellido("Gutierrez");
        alumno2.setSegundoApellido("Pérez");
        alumno2.setEdad(21);
        alumno2.setEmail("pablogutierrezperez12345asbc@gmail.com");
        alumno2.setRepetidor(true);
        alumno2.setNotamedia(4.5);
        alumno2.setCasa(casa2);
        alumno2.setDireccion(direccion2);

        Alumno alumno3 = new Alumno(); //Nuevo Alumno tras heredar los campos de Persona

        alumno3.setNombre("Maria");
        alumno3.setApellidos("Chacón Coronil");alumno3.setEdad(19);
        alumno3.setPrimerApellido("Chacón");
        alumno3.setSegundoApellido("Coronil");
        alumno3.setEmail("mariachaconcoronil1234asbc@gmail.com");
        alumno3.setRepetidor(false);
        alumno3.setNotamedia(9.5);
        alumno3.setCasa(casa3);
        alumno3.setDireccion(direccion3);

        alumno1.CompararNotaMedia(alumno1, alumno2);
        alumno1.CompararNotaMedia(alumno2, alumno3);
        alumno1.CompararNotaMedia(alumno1, alumno3);


    }
}