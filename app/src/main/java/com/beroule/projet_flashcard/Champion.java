package com.beroule.projet_flashcard;

import java.util.ArrayList;

public class Champion {
    public final int soundId;
    public final String name;
    public final ArrayList<String> answers;

    public Champion(int soundId, String name, ArrayList<String> answers) {
        this.soundId = soundId;
        this.name = name;
        this.answers = answers;
    }
}
