package com.unc.poo.test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ManejadorObjetosArchivo {
    private static final Map<String, Object> objetosArchivo = new HashMap<>();

    public static void guardarObjetoEnArchivo(Object objeto, String nombreArchivo) {
        try {
            FileOutputStream archivoSalida = new FileOutputStream(nombreArchivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(objeto);
            objetoSalida.close();
            archivoSalida.close();
            objetosArchivo.put(nombreArchivo, objeto);
            System.out.println("Objeto guardado en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object leerObjetoDeArchivo(String nombreArchivo) {
        if (objetosArchivo.containsKey(nombreArchivo)) {
            return objetosArchivo.get(nombreArchivo);
        }

        try {
            FileInputStream archivoEntrada = new FileInputStream(nombreArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            Object objeto = objetoEntrada.readObject();
            objetoEntrada.close();
            archivoEntrada.close();
            objetosArchivo.put(nombreArchivo, objeto);
            return objeto;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}