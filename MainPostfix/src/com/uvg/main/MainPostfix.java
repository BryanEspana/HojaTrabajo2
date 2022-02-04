package com.uvg.main;

import java.io.File;
import java.util.Scanner;

public class MainPostfix {
    public static void main(String[] args){
        File doc = new File("C:\\Users\\Bryan\\OneDrive - Universidad del Valle de Guatemala\\Documentos\\UVG\\SEMESTRE III\\Algoritmos y Estructura de Datos\\Hoja de Trabajo 2\\Repositorio_Hoja2\\HojaTrabajo2\\src\\com\\uvg\\main\\postfix.txt");
        Scanner obj = new Scanner(doc);
        
        while (obj.hasNextLine())
            System.out.println(obj.nextLine());
    }
    
}
