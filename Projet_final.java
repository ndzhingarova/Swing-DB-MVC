/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.sql.SQLException;

/**
 *
 * @author ddaar
 */
public class Projet_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Modele mod = new Modele();
        Interface_db inter = new Interface_db();
        
        Controleur cont = new Controleur(mod, inter);
        mod.addObserver(inter);
        cont.updateView();
    }
    
}
