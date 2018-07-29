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
public abstract class Constraint {
    private ArrayList<Column> columnas;
    public Constraint(String name){
        this.columnas= new ArrayList<>();
        this.columnas.add(new Column(name, DataType.BYTE));
    }
    String name;
}
