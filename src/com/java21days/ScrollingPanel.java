package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ScrollingPanel extends JFrame {
    Dimension dim = new Dimension(200, 300);

    ScrollingPanel(String title){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
