package org.example;

public class Cuenta {

    private String nombre;

    private  int seguidos;

    private  int seguidores;

    private  int cantidadFotos;


    public String getNombre() {
        return nombre;
    }

    public int getSeguidos() {
        return seguidos;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public int getCantidadFotos() {
        return cantidadFotos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeguidos(int seguidos) {
        this.seguidos = seguidos;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void setCantidadFotos(int cantidadFotos) {
        this.cantidadFotos = cantidadFotos;
    }

    public Cuenta (String nombre, int seguidores, int seguidos, int cantidadFotos){
        this.nombre = nombre;
        this.seguidos = seguidos;
        this.seguidores = seguidores;
        this.cantidadFotos = cantidadFotos;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public int getCantidadFotos() {
        return cantidadFotos;
    }

    public int getSeguidos() {
        return seguidos;
    }

    //Setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeguidos(int seguidos) {
        this.seguidos = seguidos;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void setCantidadFotos(int cantidadFotos) {
        this.cantidadFotos = cantidadFotos;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", siguiendo=" + seguidos +
                ", seguidores=" + seguidores +
                ", fotos=" + cantidadFotos +
                '}';
    }
}
