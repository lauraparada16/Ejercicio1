/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Laura Parada
 */
public class RelationalSchema {
    
    private ArrayList<Table> tab;
    private ArrayList<Domain> dom;
    
    public RelationalSchema(){
        
      this.tab= new ArrayList<>();  
      this.dom= new ArrayList<>();  

    }
    
    String name;
}
