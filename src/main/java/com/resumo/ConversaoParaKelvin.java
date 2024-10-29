package com.resumo;

public class ConversaoParaKelvin implements Conversao {

    @Override
    public float converter(float temperatura) {
        return temperatura + 273.15f;
    }
}
