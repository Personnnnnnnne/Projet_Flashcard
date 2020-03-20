package com.beroule.projet_flashcard;

public class Champion {
    public Champion(int mediaIdChampion, String nameChampion) {
        String[] tableauhero = {"Aatrox", "Ahri", "Nasus", "Thresh"};

        this.mediaIdChampion = mediaIdChampion;
        this.nameChampion = nameChampion;
    }

    int mediaIdChampion;
    String nameChampion;
}
