

User Interface
Top Row
1. Don't know
2. Folder
3. Open File
4. Save File
5. Don't know


Next Row
1. General Information
2. Metrics
3. Mass Balance
4. Ground Reactions
5. Propulsion
6. Flight Control
7. Aerodynamics
8. Output

Next Row
1.  Widgets / control blocks
2.
3.
4.
5.
6.
7.
8.
9.
10.
11.


Connectors
1.
2.
3.
4.
5.
6.
7.
8.

This is for flight controls.

channels are :
    pitch roll yaw flaps landing gear speedbrakes



Data Structure Driven by xml format of data files....



Here are the files from the previus system:

BudDavis ➜ /workspaces/jsbsimcommander (master) $ find ./ -name "*.c*"
./.cvsignore
./src/bitmaps/.cvsignore
./src/.cvsignore
./src/rc/.cvsignore
./src/rc/trans.cpp
./src/math/.cvsignore
./src/math/MattMD.cpp
./src/math/FGFunction.cpp
./src/math/bspline.cpp
./src/math/FGTable.cpp
./src/math/FGColumnVector3.cpp
./src/math/Matt1D.cpp
./src/math/bsplines.cpp
./src/math/FGPropertyValue.cpp
./src/math/FGRealValue.cpp
./src/wx/.cvsignore
./src/wx/ogl/oglmisc.cpp
./src/wx/ogl/.cvsignore
./src/wx/ogl/divided.cpp
./src/wx/ogl/basic.cpp
./src/wx/ogl/canvas.cpp
./src/wx/ogl/bmpshape.cpp
./src/wx/ogl/composit.cpp
./src/wx/ogl/mfutils.cpp
./src/wx/ogl/drawn.cpp
./src/wx/ogl/ogldiag.cpp
./src/wx/ogl/lines.cpp
./src/wx/ogl/basic2.cpp
./src/wx/ogl/constrnt.cpp
./src/wx/deprecated/.cvsignore
./src/wx/deprecated/cwlex_yy.c
./src/wx/deprecated/cwy_tab.c
./src/wx/deprecated/doslex.c
./src/wx/deprecated/dosyacc.c
./src/wx/deprecated/wxexpr.cpp
./src/wx/plot/.cvsignore
./src/wx/plot/plot.cpp
./src/gui/pid.cpp
./src/gui/switch.cpp
./src/gui/pid_dlg.cpp
./src/gui/MyFrame.cpp
./src/gui/.cvsignore
./src/gui/Property_Diag.cpp
./src/gui/Propulsion_Diag.cpp
./src/gui/gain.cpp
./src/gui/kinemat_dlg.cpp
./src/gui/sensor_dlg.cpp
./src/gui/import.cpp
./src/gui/Mass_Diag.cpp
./src/gui/Engine_Diag.cpp
./src/gui/fcsprop_dlg.cpp
./src/gui/view.cpp
./src/gui/EngineMgr_Diag.cpp
./src/gui/actuator.cpp
./src/gui/sum.cpp
./src/gui/func_dlg.cpp
./src/gui/Turbine_Diag.cpp
./src/gui/Table_Diag.cpp
./src/gui/When_Diag.cpp
./src/gui/actuator_dlg.cpp
./src/gui/deadband.cpp
./src/gui/Axis_Diag.cpp
./src/gui/deadband_dlg.cpp
./src/gui/LGear_Diag.cpp
./src/gui/kinemat.cpp
./src/gui/switch_dlg.cpp
./src/gui/shape.cpp
./src/gui/ResultShow_Diag.cpp
./src/gui/toolbar.cpp
./src/gui/func.cpp
./src/gui/filter_dlg.cpp
./src/gui/doc.cpp
./src/gui/sum_dlg.cpp
./src/gui/Function_Diag.cpp
./src/gui/AircraftDialog.cpp
./src/gui/filter.cpp
./src/gui/TreeItem.cpp
./src/gui/AeroDynamics_Diag.cpp
./src/gui/sensor.cpp
./src/gui/gain_dlg.cpp
./src/gui/condition.cpp
./src/simgear/.cvsignore
./src/simgear/props/.cvsignore
./src/simgear/props/props.cxx
./src/simgear/xml/xmltok_ns.c
./src/simgear/xml/xmltok_impl.c
./src/simgear/xml/.cvsignore
./src/simgear/xml/easyxml.cxx
./src/simgear/xml/xmltok.c
./src/simgear/xml/xmlrole.c
./src/simgear/xml/xmlparse.c
./src/MyApp.cpp
./src/FGJSBBase.cpp
./src/Commander.cpp
./src/input_output/FGXMLParse.cpp
./src/input_output/.cvsignore
./src/input_output/FGXMLElement.cpp
./src/input_output/FGPropertyManager.cpp
./src/mattplot/.cvsignore
./src/mattplot/plot.cpp
./src/mattplot/Condition.cpp
./src/mattplot/NomoFrm.cpp
./src/mattplot/Table.cpp


Here are the sections from the xml xsd file
<xs:element ref="fileheader" />
        <!--The file creation information. -->
        <xs:element ref="metrics" />
        <!--The geometric information for the aircraft model. -->
        <xs:element ref="mass_balance" />
        <!-- The weight and balance information for the aircraft model.</xs:annotation -->
        <xs:element ref="ground_reactions" minOccurs="0" />
        <!--The landing gear and/or structural contact point information for the aircraft model. -->
        <xs:element ref="external_reactions" minOccurs="0" />
        <!--The external reactions information for the aircraft model. -->
        <xs:element ref="buoyant_forces" minOccurs="0" />
        <!--The external reactions information for the aircraft model. -->
        <xs:element ref="propulsion" minOccurs="0" />
        <!-- The propulsion system information for the aircraft model. -->
        <xs:element ref="system" minOccurs="0" maxOccurs="unbounded"/>
        <!-- The systems reference -->
        <xs:element ref="autopilot" minOccurs="0" />
        <!-- The autopilot definition for the aircraft model. -->
        <xs:element ref="flight_control" minOccurs="0" />
        <!-- The flight control system for the aircraft model. -->
        <xs:element ref="aerodynamics" minOccurs="0" />
        <!-- The aerodynamics definition for the aircraft model. -->
        <xs:element ref="input" minOccurs="0" />
        <!-- The input definition for the aircraft model. -->
        <xs:element ref="output" minOccurs="0" maxOccurs="unbounded" />
        <!--The output specification for the aircraft model. -->
      </xs:sequence>

Purpose:
This program is a replacement for "jsbsimcommander", which has rotted into uselessness.  
The program will edit the contents of existing JSBSim xml configuration files, with a gui interface.

Example Uses:
The c172p.xml file used in JSBSim has an empty weight of 1500 LBS.  It is desired to change that value to 1501 LBS.
The user would 
* Open up the c172p.xml file
* Select "metrics" from the top level menu.
* The user would then be able to see all of data items in "metrics".
* The user would chane the empty weight.
* The user would then select the "save file" icon
* The file c172p.xml would be written.



