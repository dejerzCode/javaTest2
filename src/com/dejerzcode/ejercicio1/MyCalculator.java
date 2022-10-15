package com.dejerzcode.ejercicio1;

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int resultado = 0;
        for(int factor = n; factor > 0; factor--){
            if ((n % factor)==0){
                System.out.println(factor+" es divisor");
                resultado = resultado+factor;
            }
        }
        return resultado;
    }
}
