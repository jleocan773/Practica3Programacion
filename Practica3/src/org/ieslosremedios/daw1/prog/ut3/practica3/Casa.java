//Ejercicio 1: Define una clase de nombre Casa que cumpla con las siguientes restricciones:


package org.ieslosremedios.daw1.prog.ut3.practica3;

public class Casa {
    private Integer precio = 500;
    private Character calificacionenergetica = 'a' ;
    private String referenciacatastral = "1234ABCD";
    private final Integer iva = 21;
    private final Integer ivared = 16;
    //Ejercicio 4: Realiza lo mismo para darle una dirección a la clase de ejercicio 1.
    private Direccion direccion; //Relación de composición

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setCalificacionenergetica(Character calificacionenergetica) {
        this.calificacionenergetica = calificacionenergetica;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setReferenciacatastral(String referenciacatastral) {
        this.referenciacatastral = referenciacatastral;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Character getCalificacionenergetica() {
        return calificacionenergetica;
    }

    public Integer getIva() {
        return iva;
    }

    public Integer getIvared() {
        return ivared;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getReferenciacatastral() {
        return referenciacatastral;
    }

    void calcularPrecioIva(){
        System.out.println("El precio con IVA es: " + (precio + precio*iva/100));
    }
    void calcularPrecioRedIva(){
        System.out.println("El precio con IVA es: " + (precio + precio*ivared/100));
    }
    void mostrarTodo(){
        System.out.println("Referencia Catastral: " + referenciacatastral + " | Precio: " + precio + " | Precio con IVA: " + (precio + precio*iva/100) + " | Precio con IVA Reducido: " + (precio + precio*ivared/100));
    }

}
