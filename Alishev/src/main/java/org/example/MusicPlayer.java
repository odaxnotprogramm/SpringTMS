package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music rock;
    private Music rap;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rock,
    @Qualifier("rapMusic") Music rap) {
        this.rock = rock;
        this.rap = rap;
    }

    public void playMusic(){
        System.out.println("Song style: " + rock.getSong());
        System.out.println("Song style: " + rap.getSong());
    }
}
