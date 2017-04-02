/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurara
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Prueba {

   public static void main(String[] args) throws FileNotFoundException, IOException {

      try{
          FileInputStream dire;
          JFileChooser fc=new JFileChooser();
          if(fc.showOpenDialog(fc)==JFileChooser.APPROVE_OPTION){
              File file=fc.getSelectedFile();
              dire=new FileInputStream(file.getAbsolutePath());
              
              Player player;
              BufferedInputStream bis=new BufferedInputStream(dire);
              player=new Player(bis);
              player.play();
              
          }else{
              JOptionPane.showMessageDialog(null, "nada");
          }
          
      }catch(JavaLayerException e){
          e.printStackTrace();
      }/*catch(FileNotFoundException e1){
          e1.printStackTrace();
      }*/
   }
}