package com.java21days;

import javax.swing.*;

public class CreatePanel {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JScrollPane scrollerPanel = new JScrollPane(
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );

        JLabel titleLabel = new JLabel("Title");
        JTextField title = new JTextField(15);

        JLabel commentsLabel = new JLabel("Comments");
        JTextArea comments = new JTextArea(15, 15);



        ScrollingPanel scroller = new ScrollingPanel("Scroller");

    }
}
