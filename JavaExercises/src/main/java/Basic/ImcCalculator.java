package Basic;

public class ImcCalculator {

    public static void main(String[] args) {

        double peso = 50.2, altura = 1.58, imc;

        imc = peso / (altura * altura);

        if(imc<18.5){

            System.out.print("Magreza");

        }else if (imc>=18.5 && imc<=24.9) {

            System.out.print("Normal");

        }else if (imc>=25 && imc<=29.9 ) {

            System.out.print("Sobrepeso I");

        } else if (imc>=30 && imc<=39.9) {

            System.out.print("Obesidade");

        } else if (imc > 40) {

            System.out.print("Obesidade Grave");

        }else {

            System.out.print("Não identificado");

        }

    }

}
