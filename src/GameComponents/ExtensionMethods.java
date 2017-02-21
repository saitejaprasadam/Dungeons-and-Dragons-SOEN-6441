package GameComponents;

import java.io.File;

public class ExtensionMethods {

      public static String[] getMapsList(){
        
        if(!new File(SharedVariables.MapsDirectory).exists())
          return new String[0];
        
        File[] fileList = new File(SharedVariables.MapsDirectory).listFiles();
        String[] fileName = new String[fileList.length];

        for(int i=0; i<fileList.length;i++) 
            if(fileList[i].getName().endsWith(".xml"))
              fileName[i] = fileList[i].getName().replaceFirst("[.][^.]+$", "");
        
        return fileName;
      }
      
    /*  public static String[] getCampaignsList(){
    	  File f=new File(SharedVariables.CampaignsDirectory);
    	  if(f.exists()){
    		  System.out.println("I am in If condition getCampaignsList() ");
    		  return  new String[0];
    	  }
    	  File[] fileList = f.listFiles();
          String[] fileName = new String[fileList.length];
          for(int i=0; i<fileList.length;i++) {
        	  		fileName[i] = fileList[i].getName();
            		System.out.println("file Name added is"+ fileName[i]);
          }
    	  return fileName;
      }
      */
      
  
}