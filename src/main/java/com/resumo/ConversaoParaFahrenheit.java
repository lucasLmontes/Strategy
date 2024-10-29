package com.resumo;

public class ConversaoParaFahrenheit implements Conversao {

    @Override
    public float converter(float temperatura) {
        return (temperatura * 9 / 5) + 32;
    }
}
