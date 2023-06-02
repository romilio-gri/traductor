/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author EricksonV11
 */
public class TablaSimbolos {
    HashMap<String,String> tabla = new HashMap<String,String>();//declaracion de hahmap para tabla de simbolos
     
    public  void addTable(String tipo, String valor)
    {
      if(tabla.isEmpty())//si la tabla esta vacia se agregan los valores por primera vez 
      {
          tabla.put(tipo,valor);
      }else   //si la tabla ya tiene contenido se empieza a verificar la existencia de datos para no almacenar datos repetidos
      {  
          if(!tabla.containsValue(valor))//si la tabla ya contiene el valor no se agregara 
          {
                     tabla.put(tipo,valor);
          }
          else
          {
        //  System.out.println("ya existe");
          }
      }
  //    this.mostrar();
    }
    
    
    
    public  void mostrar()//despliega el listado de elemntos de la tabla
    {
        Iterator iterador = tabla.entrySet().iterator();
        Map.Entry lista;
        while (iterador.hasNext()) {
            lista = (Map.Entry) iterador.next();
            System.out.println(lista.getKey() + " - " + lista.getValue());
        }   
    }
    //fin de clase
}
