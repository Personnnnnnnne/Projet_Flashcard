package com.beroule.projet_flashcard;

import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {
    static Champion tableauChampion[] = {new Champion(R.raw.aatrox_selection,"Aatrox"), new Champion(R.raw.rammus_selection,"Rammus"),
            new Champion(R.raw.nasus_selection,"Nasus"), new Champion(R.raw.brand_selection, "Brand")
            , new Champion(R.raw.caitlyn_selection, "Caitlyn"), new Champion(R.raw.cassiopeia_selection, "Cassiopeia")
            , new Champion(R.raw.chogath_selection, "Cho'Gath"), new Champion(R.raw.corki_selection, "Corki")
            , new Champion(R.raw.darius_selection, "Darius"), new Champion(R.raw.braum_selection, "Braum")};


    int numberOfQuestions = EasyActivity.totalSon;


    public List<Question>QuestionGenerator(){

        ArrayList<Question> questions = new ArrayList<Question>();

        for(int i = 0; i < tableauChampion.length; i++) {

            questions.add(new Question(tableauChampion[i], choises));
            if (questions.choises = findViewById(tableauChampion.text)){
        }

        return questions;

    }

    public List<Champion>Choises(Object tableauhero){
        List<Champion> champions;
        champions = new ArrayList<Champion>();

        }

    }

    private java.awt.SystemColor findViewById(Champion[] tableauChampion) {
    }

    //{"Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe", "Blitzcrank", "Brand", "Braum", "Caitlyn",
    //"Cassiopeia", "Cho'gath", "Corki", "Darius", "Diana", "Dr Mundo", "Draven", "Elise", "Evelyn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz",
    // "Galio", "Gangplank", "Garen", "Gragas", "Graves", "Hecarim", "Heimerdinger", "Irelia", "Janna", "Jarvan IV", "Jax", "Jayce", "Jinx",
    //"Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kennen", "Kha'zix", "Kog'maw", "Leblanc", "Lee Sin", "Leona", "Lissandra", "Lucian",
    // "Lulu", "Lux", "Malphite", "Malzahar", "Maokai", "Maitre Yi", "Miss Forturne", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus",
    // "Nidalee", "Nocturne", "Nunu", "Olaf", "Orianna", "Panteon", "Poppy", "Rammus", "Renekton", "Rengar", "Riven", "Rumble", "Ryze", "Sejuani",
    // "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Sona", "Soraka", "Swain", "Syndra", "Talon", "Taric", "Teemo", "Thresh", "Tristana",
    //  "Trundle", "Tryndamere", "Twisted Fate", "Twitch", "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Vel'koz", "Vi", "Viktor", "Vladimir",
    //  "Volibear", "Warwick", "Wukong", "Xerath", "Xin Zhao", "Yasuo", "Yorick", "Zac", "Zilean", "Zed", "Ziggs", "Zyra"};



}

