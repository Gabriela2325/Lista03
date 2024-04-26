package br.edu.up.modelos;

public class Narrador21 {
    private int idadeNadador;

    public Narrador21(int idadeNadador) {
        this.idadeNadador = idadeNadador;
    }

    public int getIdadeNadador() {
        return idadeNadador;
    }

    public void setIdadeNadador(int idadeNadador) {
        this.idadeNadador = idadeNadador;
    }

    public String classificarNadador() {
        if (idadeNadador >= 5 && idadeNadador <= 7) {
            return "Infantil A";
        } else if (idadeNadador >= 8 && idadeNadador <= 10) {
            return "Infantil B";
        } else if (idadeNadador >= 11 && idadeNadador <= 13) {
            return "Juvenil A";
        } else if (idadeNadador >= 14 && idadeNadador <= 17) {
            return "Juvenil B";
        } else if (idadeNadador >= 18 && idadeNadador <= 25) {
            return "Sênior";
        } else {
            return "Fora da faixa etária";
        }
    }
}