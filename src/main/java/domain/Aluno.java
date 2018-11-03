package domain;

public class Aluno {
    private int frequencia;
    private int nota1;
    private int nota2;
    private int notaFinal;

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }



    public Aluno() {
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public boolean calcularAprovacao(){
        float media;
        if(frequencia < 75){
            return false;
        }
        else{
            media= (nota1+nota2)/2;
            if(media<30){
                return false;
            }else{
                if(media>=70){
                    return true;
                }else{
                    if((media + notaFinal)/2 >=50){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
    }
}
