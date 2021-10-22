/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSAH;

/**
 *
 * @author TSAH
 */
abstract class Std {
    public static String StdStr(String str){
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        return str;
    }
}
