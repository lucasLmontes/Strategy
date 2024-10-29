package com.resumo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveConverterParaCelsius() {
        Termometro termometro = new Termometro();
        termometro.converterParaCelsius(98.6f);
        assertEquals(37.0f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveConverterParaFahrenheit() {
        Termometro termometro = new Termometro();
        termometro.converterParaFahrenheit(0.0f);
        assertEquals(32.0f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveConverterParaKelvin() {
        Termometro termometro = new Termometro();
        termometro.converterParaKelvin(0.0f);
        assertEquals(273.15f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveConverterNegativoParaKelvin() {
        Termometro termometro = new Termometro();
        termometro.converterParaKelvin(-273.15f);
        assertEquals(0.0f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveManterPrecisaoParaConversaoFahrenheitParaCelsius() {
        Termometro termometro = new Termometro();
        termometro.converterParaCelsius(32.0f);
        assertEquals(0.0f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveConverterParaFahrenheitComPrecisao() {
        Termometro termometro = new Termometro();
        termometro.converterParaFahrenheit(100.0f);
        assertEquals(212.0f, termometro.getTemperatura(), 0.01f);
    }
}