package org.example;

import com.opencsv.CSVReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("data/cuentas.csv");

        List<Cuenta> cuentas = new ArrayList<>();


        try(CSVReader sr = new CSVReader(new InputStreamReader(inputStream))){
            String [] linea;

            sr.readNext();

            while ((linea = sr.readNext()) != null){
                String nombre = linea[0];
                int seguidos = Integer.parseInt(linea[1]);
                int seguidores = Integer.parseInt(linea[2]);
                int cantFotos = Integer.parseInt(linea[3]);

                Cuenta cuenta = new Cuenta(nombre, seguidos, seguidores, cantFotos);
                cuentas.add(cuenta);
            }

            for (Cuenta c: cuentas){
                System.out.println(c);
            }

            ordenarNombresAalaZ(cuentas);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static List<Cuenta> ordenarNombresAalaZ(List<Cuenta> cuentas) {
        cuentas.sort(Comparator.comparing(Cuenta::getNombre)); // Ordena por nombre de la A a la Z
        return cuentas;
    }
}