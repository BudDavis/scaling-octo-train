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
import generated.FlightControl;
import generated.Channel;
import generated.Summer;
import generated.Kinematic;


public class App {

  public class Display {
	 public Display draw(Display D){
		 return null;
	 } 
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
    //TabbedPaneDemo.mainx();

    try {

      File file = new File("f16.xml");

      JAXBContext jc = JAXBContext.newInstance("generated");

      Unmarshaller um = jc.createUnmarshaller();
      FdmConfig cfg = (FdmConfig) um.unmarshal(file);
    
      //System.out.println(cfg);
      //System.out.println(cfg.getFileheader().getCopyright());
      //System.out.println(cfg.getFileheader().getVersion() );
      //System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
      //System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
      //System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass());


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



      FlightControl fc = cfg.getFlightControl();

      System.out.println("Channels are");
      for ( Channel ch : fc.getChannel())
      {
	      System.out.println(ch.getName());
	      for (Object o :ch.getActuatorOrAerosurfaceScaleOrIntegrator())
	      {
	         //System.out.print("    ");
		 if (o instanceof Summer)
		 {
			 Summer S = (Summer) o;
	                 System.out.print(" summer ");
	                 System.out.print(S.getName());
	                 System.out.println();
			 System.out.println("   ");
			 for (String I :S.getInput())
			 {
				 System.out.print("     ");
				 System.out.println(I);
			 }
		 }
		 if (o instanceof Kinematic)
		 {
			 Kinematic S = (Kinematic) o;
	                 System.out.print(" kinematic ");
	                 System.out.print(S.getName());
			 System.out.println(S.getInput());
		 }
                 System.out.println();

        //@XmlElement(name = "actuator", type = Actuator.class),
        //@XmlElement(name = "aerosurface_scale", type = AerosurfaceScale.class),
        //@XmlElement(name = "integrator", type = Integrator.class),
        //@XmlElement(name = "kinematic", type = Kinematic.class),
        //@XmlElement(name = "lag_filter", type = LagFilter.class),
        //@XmlElement(name = "lead_lag_filter", type = LeadLagFilter.class),
        //@XmlElement(name = "pid", type = Pid.class),
        //@XmlElement(name = "pure_gain", type = PureGain.class),
        //@XmlElement(name = "scheduled_gain", type = ScheduledGain.class),
        //@XmlElement(name = "second_order_filter", type = SecondOrderFilter.class),
        //@XmlElement(name = "sensor", type = Sensor.class),
        //@XmlElement(name = "summer", type = Summer.class),
        //@XmlElement(name = "switch", type = Switch.class),
        //@XmlElement(name = "washout_filter", type = WashoutFilter.class),
        //@XmlElement(name = "deadband", type = Deadband.class),
        //@XmlElement(name = "fcs_function", type = FcsFunction.class)

                 //System.out.println(o.getInput());
	      }
      }


      Marshaller m = jc.createMarshaller();
      m.setProperty("jaxb.formatted.output", true);
      //m.marshal(cfg, System.out);

    } catch (JAXBException e) {
      e.printStackTrace();
    }

  }
}
