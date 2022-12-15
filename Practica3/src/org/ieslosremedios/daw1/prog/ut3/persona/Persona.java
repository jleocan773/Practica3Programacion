//Ejercicio 7: Utiliza la clase Persona que ya hemos creado en clase, si no la tienes, créala
//con los campos: nombre, primerApellido, segundoApellido y edad, métodos constructores,
//getters y setters. Adapta la clase Alumno para que herede estos campos de Persona. La
//clase Persona debe estar en otro paquete fuera del paquete de la clase Alumno, de modo
//que para usarla ¿qué tendrás que hacer?

//Tendremos que importar el paquete en las clases que queramos usarlo dentro del otro paquete

package org.ieslosremedios.daw1.prog.ut3.persona;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    Integer edad;

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
    public Persona(String nombre, String primerApellido, String segundoApellido, Integer edad){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
    }
    public Persona(){};
}
