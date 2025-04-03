package ex5;

import lombok.Getter;

@Getter
public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida: " + dia + "/" + mes + "/" + ano);
        }
    }

    public void setDia(int dia) {
        if (isDataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido: " + dia + " para o mês " + this.mes + " e ano " + this.ano);
        }
    }

    public void setMes(int mes) {
        if (isDataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido: " + mes + " para o dia " + this.dia + " e ano " + this.ano);
        }
    }

    public void setAno(int ano) {
        if (isDataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido: " + ano + " para o dia " + this.dia + " e mês " + this.mes);
        }
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private int getDiasNoMes(int mes, int ano) {
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 2) {
            return isAnoBissexto(ano) ? 29 : 28;
        } else {
            return 31;
        }
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        return dia >= 1 && dia <= getDiasNoMes(mes, ano);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public void avancarData() {
        dia++;
        if (dia > getDiasNoMes(mes, ano)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }
    }
}