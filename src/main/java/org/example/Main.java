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

            ordenarNombresAalaZ(cuentas);

            System.out.println("Nombres ordenados A-Z:");
            for (Cuenta c: cuentas){
                System.out.println(c);
            }

            // Obtener las cuentas con más seguidores
            List<Cuenta> topCuentas = obtenerCuentasConMasSeguidores(cuentas);
            System.out.println(

            );
            System.out.println("Cuenta(s) con más seguidores:");
            for (Cuenta c : topCuentas) {
                System.out.println(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Cuenta> ordenarNombresAalaZ(List<Cuenta> cuentas) {
        cuentas.sort(Comparator.comparing(Cuenta::getNombre));
        return cuentas;
    }
        public static List<Cuenta> obtenerCuentasConMasSeguidores(List<Cuenta> cuentas) {
            List<Cuenta> resultado = new ArrayList<>();
            int maxSeguidores = Integer.MIN_VALUE;

            // Encontramos el número máximo de seguidores
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getSeguidores() > maxSeguidores) {
                    maxSeguidores = cuenta.getSeguidores();
                }
            }

            // Recopilamos las cuentas con el número máximo de seguidores
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getSeguidores() == maxSeguidores) {
                    resultado.add(cuenta);
                }
            }
            return resultado;
        }

}