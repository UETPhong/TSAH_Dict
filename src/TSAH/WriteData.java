/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSAH;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author TSAH
 */
abstract class WriteData {
    public static void WriteFile(String fileName, String str, boolean bool) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, bool));
        bw.write(str);
        bw.close();
    }
}
