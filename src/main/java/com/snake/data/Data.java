package com.snake.data;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Data {

    // head
    public static ImageIcon head = loadImage("/statics/head.jpg", 50, 50);
    // food
    public static ImageIcon food = loadImage("/statics/food.png", 50, 50);
    // body
    public static ImageIcon body = loadImage("/statics/body.png", 50, 50);
    // background
    public static ImageIcon background = loadImage("/statics/head.jpg", 850, 650);

    private static ImageIcon loadImage(String path, int width, int height) {
        try {
            URL imageUrl = Data.class.getResource(path);
            BufferedImage image = ImageIO.read(imageUrl);
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            if (originalWidth > width || originalHeight > height) {
                double scale = Math.min((double) width / originalWidth, (double) height / originalHeight);
                int scaledWidth = (int) (originalWidth * scale);
                int scaledHeight = (int) (originalHeight * scale);
                Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            } else {
                return new ImageIcon(image);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
