/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package uta.cse.cse3310.JSBSimEdit;
//package components;

/*
 * TabbedPaneDemo.java requires one additional file:
 *   images/middle.gif.
 */

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

public class TabbedPaneDemo extends JPanel {
    public class SectionTab {
        String TabName;
        JComponent TextPane;
        ImageIcon icon;
    }

    SectionTab SectionTabs[] = new SectionTab[12];

    public TabbedPaneDemo() {
        super(new GridLayout(1, 1));
        System.out.println(" constructor");
        /*
         * // SectionTabs = new SectionTab[12];
         * SectionTabs[0].TabName = "fileheader";
         * SectionTabs[1].TabName = "metrics";
         * SectionTabs[2].TabName = "mass_balance";
         * SectionTabs[3].TabName = "ground_reactions";
         * SectionTabs[4].TabName = "external_reactions";
         * SectionTabs[5].TabName = "buoyant_forces";
         * SectionTabs[6].TabName = "system";
         * SectionTabs[7].TabName = "autopilot";
         * SectionTabs[8].TabName = "flight_control";
         * SectionTabs[9].TabName = "aerodynamics";
         * SectionTabs[10].TabName = "input";
         * SectionTabs[11].TabName = "output";
         */
        /*
         * JTabbedPane tabbedPane = new JTabbedPane();
         * ImageIcon icon = createImageIcon("images/middle.gif");
         * 
         * for (int i = 0; i < SectionTabs.length; i++) {
         * //SectionTabs[i].icon = createImageIcon("images/middle.gif");
         * SectionTabs[i].TextPane = makeTextPanel("xxx");
         * tabbedPane.addTab(SectionTabs[i].TabName, icon, SectionTabs[i].TextPane);
         * }
         */

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("images/middle.gif");

        JComponent panel1 = makeTextPanel("FileHeader");
        tabbedPane.addTab("fileheader", icon, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = makeTextPanel("Panel #2");
        JComponent pxx = makeTextPanel("XXX");
        panel2.add(pxx);
        tabbedPane.addTab("metrics", icon, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = makeTextPanel("Panel #3");
        tabbedPane.addTab("mass_balance", icon, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4 = makeTextPanel(
                "Panel #4 (has a preferred size of 410 x 50).");
        panel4.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("ground_reactions", icon, panel4,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        JComponent panel5 = makeTextPanel(
                "Panel #5 (has a preferred size of 410 x 50).");
        panel5.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("external_reactions", icon, panel5,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);

        JComponent panel6 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel6.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("buoyant_forces", icon, panel6,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_6);

        JComponent panel7 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel7.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("system", icon, panel7,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(6, KeyEvent.VK_7);

        JComponent panel8 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel8.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("autopilot", icon, panel8,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(7, KeyEvent.VK_8);

        JComponent panel9 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel9.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("flight_controls", icon, panel9,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(8, KeyEvent.VK_9);

        JComponent panel10 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel10.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("aerodynamics", icon, panel10,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(9, KeyEvent.VK_1);

        JComponent panel11 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel10.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("input", icon, panel11,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(9, KeyEvent.VK_1);

        JComponent panel12 = makeTextPanel(
                "Panel #6 (has a preferred size of 410 x 50).");
        panel10.setPreferredSize(new Dimension(410, 410));
        tabbedPane.addTab("output", icon, panel12,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(9, KeyEvent.VK_1);

        // Add the tabbed pane to this panel.
        add(tabbedPane);

        // The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPaneDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from
     * the event dispatch thread.
     */
    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("TabbedPaneDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add content to the window.

        frame.add(new FileChooserDemo(), BorderLayout.PAGE_START);

        frame.add(new TabbedPaneDemo(), BorderLayout.PAGE_END);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void mainx() {
        // Schedule a job for the event dispatch thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}