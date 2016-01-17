package com.corejava.module10;

import java.io.*;

public class FilesAndStreamsDemo{

   public static void main(String args[]){
   
   try{
       String bWrite="manisha";
      OutputStream os = new FileOutputStream("test.txt");
      for(int x=0; x < bWrite.length() ; x++){
         os.write( bWrite.charAt(x) ); // writes the bytes
      }
      os.write(bWrite.getBytes());
      os.close();
     
      InputStream is = new FileInputStream("test.txt");
      int size = is.available();

      for(int i=0; i< size; i++){
         System.out.print((char)is.read() + "  ");
      }
      is.close();
   } catch(FileNotFoundException e){
      System.out.print("FileNotFoundException caught");
   }  catch(IOException e){
      System.out.print("IOException caught");
   }    
   }
}
