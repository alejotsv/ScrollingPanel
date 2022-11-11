package com.java21days;

import javax.swing.*;

public class CreatePanel {
    public static void main(String[] args) {
        JPanel panel = new JPanel();

        JLabel titleLabel = new JLabel("Title");
        JTextField title = new JTextField(15);

        JLabel commentsLabel = new JLabel("Comments");
        JTextArea comments = new JTextArea(5, 15);

        JScrollPane scrollerPanel = new JScrollPane(
                comments,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
        );

        panel.add(titleLabel);
        panel.add(title);
        panel.add(commentsLabel);
        panel.add(scrollerPanel);

        ScrollingPanel scroller = new ScrollingPanel("Scroller");

        scroller.add(panel);

    }
}
