package com.resumo;

public class ConversaoParaCelsius implements Conversao {

    @Override
    public float converter(float temperatura) {
        return (temperatura - 32) * 5 / 9;
    }
}
