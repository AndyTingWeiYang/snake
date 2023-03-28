package com.snake;

import com.snake.data.GamePanel;

import javax.swing.*;

public class GameStart {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Snake!");
        jFrame.setSize(900, 720);
        jFrame.setLocationRelativeTo(null);//視窗顯示螢幕中間
        jFrame.setResizable(false);//固定視窗大小
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定表單關閉事件
        jFrame.add(new GamePanel());
        jFrame.setVisible(true);//設定表單可見
    }
}