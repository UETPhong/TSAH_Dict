/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSAH;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TSAH
 */
public class ReadData {
    private HashMap map = new HashMap();
    private String str1 = "";
    private String str2 = "";
    
    public ReadData(String fileName) throws IOException{
        BufferedReader fileInput = null;
        String txtLine = "";
        try {
            fileInput = new BufferedReader(new FileReader(fileName));
            while(null != (txtLine = fileInput.readLine())){
                String temp = "";
                String t = "";
                txtLine = txtLine.concat("abc");
              
                for(int j = 0; j < txtLine.length() - 3; j ++){
                    temp += txtLine.charAt(j);
                    t += txtLine.charAt(j+1);
                    t += txtLine.charAt(j+2);
                    t += txtLine.charAt(j+3);
                    
                    if(t.equals("<ht")){
                        str1 = temp;
                        temp = "";
                        t = "";  
                    }
                    
                    else if(t.equals("ml>")){
                        str2 = temp + t;
                        t = "";
                       
                    }
                    t = "";
                }
                str1 = Std.StdStr(str1);
                str2 = Std.StdStr(str2);
                map.put(str1, str2);
            }
            fileInput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileInput.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public String searchMean(String word){
        word = Std.StdStr(word);
        return map.get(word).toString();
    }
    public HashMap getMap(){
        return map;
    }
}
