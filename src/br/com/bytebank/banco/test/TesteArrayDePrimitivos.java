package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
        int [] idades = new int[0]; // também é possível usar da seguinte forma "int idades []", mas é mais comum do outro jeito


        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }
    }
}
