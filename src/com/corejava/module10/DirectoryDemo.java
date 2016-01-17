package com.corejava.module10;
import java.io.*;

public class DirectoryDemo {
	public static void main(String args[]) {
		String dirname = "/home/manisha/mydirectory";
		File dir = new File(dirname);
		// Create directory now.
		dir.mkdirs();
		
		
		   
	      String[] paths;
	            
	      try{      
	                                 
	         paths = dir.list();
	         System.out.println("Total Files:");

	         for(String path:paths)
	         {
	            System.out.println(path);
	         }
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
	      

	      FilenameFilter filter = new FilenameFilter() {
	             public boolean accept
	             (File dir, String name) {
	                return name.startsWith("T");
	            }
	          };
		         paths = dir.list(filter);

	          if (paths == null) {
	             System.out.println("Either dir does not exist or is not a directory");
	          } 
	          else {
		         System.out.println("Found:");

	             for (int i=0; i< paths.length; i++) {
	                System.out.println(paths[i]);
	             }
	          } 
	      
	}
}