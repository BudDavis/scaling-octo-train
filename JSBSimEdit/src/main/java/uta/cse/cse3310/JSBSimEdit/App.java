package uta.cse.cse3310.JSBSimEdit;

import java.io.File;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import generated.FdmConfig;
 
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    // TabbedPaneDemo.mainx();

    try {

      File file = new File("f16.xml");
      JAXBContext jaxbContext = JAXBContext.newInstance(FdmConfig.class);

      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      FdmConfig cfg = (FdmConfig) jaxbUnmarshaller.unmarshal(file);

      System.out.println(cfg.getName());
       

      JAXBContext jc = JAXBContext.newInstance("generated");
      Marshaller m = jc.createMarshaller();
      m.marshal(cfg, System.out);


      // unmarshal from foo.xml
      //Unmarshaller u = jc.createUnmarshaller();
      // FooObject fooObj = (FooObject) u.unmarshal(new File("f16.xml"));

      // marshal to System.out
     
    } catch (JAXBException e) {
      e.printStackTrace();
    }

  }
}
