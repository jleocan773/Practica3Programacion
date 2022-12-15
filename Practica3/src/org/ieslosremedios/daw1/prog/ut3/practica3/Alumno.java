//Ejercicio 2: Define una clase para modelar a los alumnos de un instituto. De ellos se debe
//almacenar: nombre, apellidos, edad, si es repetidor o no, nota media y correo electrónico.
//También se espera que de un alumno se pueda obtener una impresión de su nombre con
//los apellidos y la edad. Además, dado que se usará dentro de un modelo más amplio (aulas,
//profesores, etc...), se debe permitir acceder a todos los campos para consulta y
//modificación, pero no de forma directa, sino encapsulando esta información. Por último,
//añade un constructor sin parámetros y otro con los parámetros del nombre, apellidos y
//edad.

package org.ieslosremedios.daw1.prog.ut3.practica3;
import org.ieslosremedios.daw1.prog.ut3.persona.Persona; //Para poder usar una clase de otro paquete debemos de importarla tal que así

public class Alumno extends Persona{
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Boolean repetidor;
    private Double notamedia;
    private String email;
    private Direccion direccion; //Relación de composición
    private Casa casa;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRepetidor(Boolean repetidor) {
        this.repetidor = repetidor;
    }

    public void setNotamedia(Double notamedia) {
        this.notamedia = notamedia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public Double getNotamedia() {
        return notamedia;
    }

    public Boolean getRepetidor() {
        return repetidor;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Casa getCasa() {
        return casa;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    void MostrarInformacion(){
        System.out.println("Nombre: " + nombre + " | Apellidos: " + apellidos + " | Edad: " + edad);
    }

    public Alumno(){}

    //Ejercicio 3: Añade una restricción a la clase anterior para que no puedan crearse alumnos
    //nuevos sin darles un nombre, apellidos y edad

    //No sé cómo crear la restricción
    public Alumno(String nombre, String apellidos, Integer edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Ejercicio 8: Crea un método perteneciente a la clase Alumno que dados dos alumnos
    //calcule la nota media máxima utilizando la librería Math. Prueba este método en el main con
    //los dos alumnos anteriores.

    public void CompararNotaMedia(Alumno alumno1, Alumno alumno2){
        Double notamedia1 = alumno1.getNotamedia();
        Double notamedia2 = alumno2.getNotamedia();

        if (notamedia1 > notamedia2){
            System.out.println(alumno1.getNombre() + " tiene la mayor nota media de los dos, porque el " + notamedia1 + " de " + alumno1.getNombre() + " es mayor que el " + notamedia2 + " de " + alumno2.getNombre());
        }
        else if (notamedia2 > notamedia1){
            System.out.println(alumno2.getNombre() + " tiene la mayor nota media de los dos, porque el " + notamedia2 + " de " + alumno2.getNombre() + " es mayor que el " + notamedia1 + " de " + alumno1.getNombre());
        }
        else System.out.println("Ambos alumnos tienen la misma nota media");
    }
}
