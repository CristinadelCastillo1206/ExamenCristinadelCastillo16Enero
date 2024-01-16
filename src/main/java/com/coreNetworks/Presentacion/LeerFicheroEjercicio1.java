package com.coreNetworks.Presentacion;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class LeerFicheroEjercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1
        //Importar las clases necesarias
        //Solicita al usuario que ingrese la ruta completa del archivo:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ruta completa del archivo");
        String rutaArchivo = scanner.nextLine();

        //Depues creo un objeto de tipo File con la ruta proporcionada

        File archivo = new File(rutaArchivo);

        //Acontinuacion verifico si el archivo existe y si es válido
        if (archivo.exists() && archivo.isFile()) {
            // Obtengo la información del archivo
        } else {
            System.out.println("El archivo no existe o no es válido.");
        }
            System.out.println("El archivo no existe o no es válido");

            System.out.println("Nombre del archivo: " + archivo.getName());
            System.out.println("Tamaño del archivo: " + archivo.length() + " bytes");
            System.out.println("Última fecha de modificación: " + new Date(archivo.lastModified()));


        }
    }

