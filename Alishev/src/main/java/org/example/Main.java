package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        //Music music = context.getBean("rapMusic",Music.class);

//        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
//        player.playMusic();

        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(player.getVolume());
        System.out.println(player.getName());

//        Computer computer = context.getBean("computer",Computer.class);

    }
}