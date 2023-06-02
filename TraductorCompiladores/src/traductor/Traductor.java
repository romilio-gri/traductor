/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traductor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Romilio
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz i = new Interfaz();
        i.show();
//        try{
//            crea();
//        }
//        catch(Exception e){ System.out.println("Error");}

        
    }
    
    public static void crearLexico() throws IOException, Exception{
        
        
}
public static void crea() throws IOException, Exception
{

    File file= new File("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Lexico\\Lex.flex");
        JFlex.Main.generate(file);
        Path temp = Files.move(Paths.get("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Lexico\\Lexico.java"),
        Paths.get("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Clases\\Lexico.java"));
        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    String[] asintactico = {"-parser", "Sintactico", "F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Sintactico\\parser.cup"};
    java_cup.Main.main(asintactico);
    Files.move(
        Paths.get("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Sintactico\\Sintactico.java"),
        Paths.get("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Clases\\Sintactico.java")
    );
    Files.move(
        Paths.get("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\traductor\\sym.java"),
        Paths.get("F:\\9No Semestre\\Compiladores\\Proyecto\\TraductorInglesEspaniol-main\\TraductorInglesEspaniol-main\\src\\Clases\\sym.java")
    );
}
    
}
