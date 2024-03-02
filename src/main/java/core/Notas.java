package core;

public class Notas {

    public boolean calcularAprovacao(
            float nota1,
            float nota2,
            float notaFinal,
            int frequencia){

        boolean resultado;
        float media;

        if (frequencia < 75) {
            resultado = false;
        }
        else {
            media = ( nota1 + nota2)/2;

            if(media < 30){
                resultado = false;
            } else if (media >= 70) {
                resultado = true;
            } else if ((media + notaFinal)/2 >= 50) {
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }
}
