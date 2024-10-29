package com.resumo;

public class Conversor {

    private float temperatura;

    public Conversor(float temperatura) {
        this.temperatura = temperatura;
    }

    public float converter(Conversao conversao) {
        return conversao.converter(temperatura);
    }
}
