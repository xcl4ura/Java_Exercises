package medium.exceptionExamples;

public class VectorLimit {

    public static void main(String[] args) {

    System.out.println("Inicio do main");
    metodo1();
    System.out.println("Fim do main");
}

    static void metodo1() {
        System.out.println("Inicio do metodo 1");
        verf();
        System.out.println("Fim do metodo 1");
    }

    static void verf() {
        try {
            int[] array = new int[15];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                System.out.print(i + ", ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("O limite de indices do vetor foi atingido e não pode ser ultrapassado");
        }finally {
            System.out.println(".");
        }

    }
}