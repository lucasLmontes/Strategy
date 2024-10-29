package com.resumo;

public class Termometro {

    private float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void converterParaCelsius(float temperatura) {
        Conversor conversor = new Conversor(temperatura);
        this.temperatura = conversor.converter(new ConversaoParaCelsius());
    }

    public void converterParaFahrenheit(float temperatura) {
        Conversor conversor = new Conversor(temperatura);
        this.temperatura = conversor.converter(new ConversaoParaFahrenheit());
    }

    public void converterParaKelvin(float temperatura) {
        Conversor conversor = new Conversor(temperatura);
        this.temperatura = conversor.converter(new ConversaoParaKelvin());
    }
}

