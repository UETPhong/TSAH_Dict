/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSAH;
import java.io.*;
import com.sun.speech.freetts.*;
import javax.swing.JOptionPane;
/**
 *
 * @author TSAH
 */
abstract class Speak {
    private static final String VOICENAME = "kevin16";
    public static void voice(String txtVoice) {                                         
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
//            voice.speak(txtVoice);
                        voice.speak("Hello");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No Voice");
        }
    }
}
