package com.example.kaherine.parcialv2;



public class Contacto {
    private String nombre, telefono;




    public  Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        /*this.apellido = apellido;
        this.correo=correo;
        this.direccion= direccion;
        this.ide=ide;*/
        this.telefono=telefono;
        /*this.completada = completada;
        this.favs=favs;*/
    }

    public String getNombre(){
        return nombre;
    }

    public void setTitulo(String nombre){
        this.nombre = nombre;
    }

    /*public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getCorreocorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo= correo;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide=ide;
    }
*/
    public String getTelefono(){ return telefono;}

    public void setTelefono(String telefono) { this.telefono=telefono;}

    /*public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public boolean isFavs(){
        return favs;
    }

    public void setFavs(boolean favs) {
        this.favs = favs;
    }

*/

}

