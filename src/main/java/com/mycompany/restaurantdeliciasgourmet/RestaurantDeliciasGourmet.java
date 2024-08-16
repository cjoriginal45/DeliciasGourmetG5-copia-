/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantdeliciasgourmet;

import com.mycompany.restaurantdeliciasgourmet.swing.windows.Login;
import javax.swing.SwingUtilities;

/**
 *
 * @author sebas
 */
public class RestaurantDeliciasGourmet {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
