/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import com.oracle.jrockit.jfr.DataType;
import java.util.ArrayList;

/**
 *
 * @author Laura Parada
 */
public class Column {
    
     private ArrayList<Constraint> res;
     
    public Column(String name, DataType dataType){
        this.res= new ArrayList<>();
    }
      String name;
    DataType dataType;
}
