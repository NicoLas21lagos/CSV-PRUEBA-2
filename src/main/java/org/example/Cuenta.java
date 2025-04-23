package org.example;

public class Cuenta {

    private String nombre;

    private  int seguidos;

    private  int seguidores;

    private  int cantidadFotos;

    public Cuenta (String nombre, int seguidores, int seguidos, int cantidadFotos){
        this.nombre = nombre;
        this.seguidos = seguidos;
        this.seguidores = seguidores;
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
