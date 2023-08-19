package uta.cse.cse3310.JSBSimEdit;

import java.io.File;  
import java.util.List; 

import jakarta.xml.bind.JAXBContext;  
import jakarta.xml.bind.JAXBException;  
import jakarta.xml.bind.Unmarshaller;
import generated.FdmConfig;
import generated.Propulsion;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //TabbedPaneDemo.mainx();
        
        try {  
   
            File file = new File("f16.xml");  
            JAXBContext jaxbContext = JAXBContext.newInstance(FdmConfig.class);  
       
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
            FdmConfig cfg= (FdmConfig) jaxbUnmarshaller.unmarshal(file);  
              
            System.out.println(cfg.getName());  
            //System.out.println("Answers:");  
            //List<Answer> list=que.getAnswers();  
            //for(Answer ans:list)  
            //  System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());  
       
          } catch (JAXBException e) {  
            e.printStackTrace();  
          }  
   
    }
}
