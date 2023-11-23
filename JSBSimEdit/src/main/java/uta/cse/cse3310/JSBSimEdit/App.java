package uta.cse.cse3310.JSBSimEdit;

import java.io.File;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import generated.FdmConfig;
import generated.Force;
import generated.Location;
import generated.Direction;


public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    TabbedPaneDemo.mainx();

    try {

      File file = new File("f16.xml");
      // JAXBContext jaxbContext = JAXBContext.newInstance(FdmConfig.class);

      // Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      // FdmConfig cfg = (FdmConfig) jaxbUnmarshaller.unmarshal(file);

      // System.out.println(cfg.getName());

      JAXBContext jc = JAXBContext.newInstance("generated");

      Unmarshaller um = jc.createUnmarshaller();
      FdmConfig cfg = (FdmConfig) um.unmarshal(file);
    
      System.out.println(cfg);
      System.out.println(cfg.getFileheader().getCopyright());
      System.out.println(cfg.getFileheader().getVersion() );
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass());


      Force F = new Force();
      F.setName("someForce");
      F.setFrame("BODY");

      Location L = new Location();
      L.setUnit("IN");
      L.setX(1.0);
      L.setY(2.0);
      L.setZ(3.0);

      F.setLocation(L);

      Direction D = new Direction();
      D.setX(10.0);
      D.setY(20.0);
      D.setZ(30.0);

      F.setDirection(D);

      cfg.getExternalReactions().getForce().add(F);
      cfg.getExternalReactions().getProperty().add("cromulent");

      Marshaller m = jc.createMarshaller();
      m.setProperty("jaxb.formatted.output", true);
      m.marshal(cfg, System.out);

    } catch (JAXBException e) {
      e.printStackTrace();
    }

  }
}
