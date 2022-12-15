//Ejercicio 4: Realiza una nueva clase para almacenar direcciones como la siguiente:
//Establece una relación entre esta clase y la clase del ejercicio 2 de modo que cada alumno
//pueda tener o no una dirección. ¿Cómo se llama este tipo de relación?

//Este tipo de relación se llama "composición"

package org.ieslosremedios.daw1.prog.ut3.practica3;

public class Direccion {
    String tipovia;
    String nombrevia;
    Integer numerovia;
    String numeroadicional;
    Integer codigopostal;
    String localidad;
    String provincia;

    public Integer getCodigopostal() {
        return codigopostal;
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getNombrevia() {
        return nombrevia;
    }

    public String getNumeroadicional() {
        return numeroadicional;
    }

    public Integer getNumerovia() {
        return numerovia;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getTipovia() {
        return tipovia;
    }

    public void setCodigopostal(Integer codigopostal) {
        this.codigopostal = codigopostal;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setNombrevia(String nombrevia) {
        this.nombrevia = nombrevia;
    }

    public void setNumeroadicional(String numeroadicional) {
        this.numeroadicional = numeroadicional;
    }

    public void setNumerovia(Integer numerovia) {
        this.numerovia = numerovia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setTipovia(String tipovia) {
        this.tipovia = tipovia;
    }


    //Ejercicio 6: Sobrecarga varios constructores para
    //poder crear direcciones sin provincia ni código postal. Sobreescribe el constructor por
    //defecto para que siga habiendo un constructor sin parámetros.
     public Direccion(String tipovia, String nombrevia, Integer numerovia, String numeroadicional, String localidad){
        this.tipovia = tipovia;
        this.nombrevia = nombrevia;
        this.numerovia = numerovia;
        this.numeroadicional = numeroadicional;
        this.localidad = localidad;
    }

    public Direccion(){}


    //Ejercicio 6: Define un método para imprimir la dirección completa. Sobrecarga el método
    //anterior para imprimir solo la calle y la localidad
    public void MostrarDireccionCompleta(String tipovia, String nombrevia, String numerovia, String numeroadicional, Integer codigopostal, String localidad, String provincia){
        System.out.println(this.tipovia + this.nombrevia + this.numerovia + this.numeroadicional + this.codigopostal + this.localidad + this.provincia);
    }
    public void MostrarCalleLocalidad(String tipovia, String nombrevia, String localidad){
        System.out.println(this.tipovia + this.nombrevia + this.localidad);
    }
}
