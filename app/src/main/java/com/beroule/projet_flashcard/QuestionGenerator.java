package com.beroule.projet_flashcard;

import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {
    static ArrayList<Champion> tableauChampion = new ArrayList<>();


    public static void load() {
        ArrayList<String> answers = new ArrayList<>();
        answers.add("Aatrox");
        answers.add("Ahri");
        answers.add("Elise");
        Champion c = new Champion(R.raw.aatrox_selection, "Aatrox", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Rammus");
        answers.add("Fiora");
        answers.add("Lulu");
        c = new Champion(R.raw.rammus_selection, "Rammus", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Jax");
        answers.add("Rengar");
        answers.add("Lux");
        c = new Champion(R.raw.rengar_selection, "Rengar", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Caitlyn");
        answers.add("Fiora");
        answers.add("Irelia");
        c = new Champion(R.raw.caitlyn_selection, "Caitlyn", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Garen");
        answers.add("Tryndamere");
        answers.add("Swain");
        c = new Champion(R.raw.garen_selection, "Garen", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Brand");
        answers.add("Fizz");
        answers.add("Ezreal");
        c = new Champion(R.raw.ezreal_selection, "Ezreal", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Lee Sin");
        answers.add("Alistar");
        answers.add("Galio");
        c = new Champion(R.raw.alistar_selection, "Alistar", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Katarina");
        answers.add("Anivia");
        answers.add("Elise");
        c = new Champion(R.raw.katarina_selection, "Katarina", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Dr Mundo");
        answers.add("Gragas");
        answers.add("Maokai");
        c = new Champion(R.raw.drmundo_selection, "Dr Mundo", answers);
        tableauChampion.add(c);

        answers = new ArrayList<>();
        answers.add("Mordekaiser");
        answers.add("Hecarim");
        answers.add("Thresh");
        c = new Champion(R.raw.mordekaiser_selection, "Mordekaiser", answers);
        tableauChampion.add(c);
    }
}

