package com.example.useofspinner;

import java.util.ArrayList;
import java.util.List;

public class GameExpert {
    List<String> getGames(String game) {
        List<String> Games = new ArrayList<>();
        if (game.equals("Action Category")) {
            Games.add("Grand Theft Auto V");
            Games.add("Red Dead Redemption 2");
            Games.add("Elden Ring");
            Games.add("God Of War");
            Games.add("Call Of Duty");
        } else if (game.equals("Racing Category")) {
            Games.add("Need For Speed");
            Games.add("Gran Turismo");
            Games.add("Project Cars");
            Games.add("Assetto Corsa");
            Games.add("Forza Horizon");
        } else {
            Games.add("The Witcher 3");
            Games.add("Baldur's Gate 3");
            Games.add("Assassin's Creed Odyssey");
            Games.add("Mass Effect");
            Games.add("Final Fantasy");
        }
        return Games;
    }

}