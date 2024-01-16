package com.coreNetworks.Presentacion;

import java.io.*;

public class ContenidoEjercicio2 {
    public static void main(String[] args) {

        //Ejercicio 2


        try {
            // Lee el contenido del archivo de origen

            String rutaOrigen = null;
            File archivoOrigen = new File(rutaOrigen);
            FileReader fr = null;
            try {
                fr = new FileReader(archivoOrigen);
            } catch (FileNotFoundException e) {
                System.out.println(e.toString());
            }
            char[] contenido = new char[(int) archivoOrigen.length()];
            try {
                fr.read(contenido);
            } catch (IOException e) {
                System.out.println(e.toString());
            }

            // Realiza el cifrado del contenido utilizando la clave proporcionada
            for (int i = 0; i < contenido.length; i++) {
                char clave = 0;
                contenido[i] = (char) (contenido[i] ^ clave);
            }

            // Guarda el contenido cifrado en el archivo destino
            File rutaDestino = null;
            FileWriter fw = null;
            try {
                fw = new FileWriter(rutaDestino);
            } catch (IOException e) {
                System.out.println(e.toString());
            }
            try {
                fw.write(contenido);
            } catch (IOException e) {
                System.out.println(e.toString());
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}








