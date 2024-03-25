public class App {
    public static void main(String[] args) throws Exception {
           /**
     * Método principal que executa a sequência de operações descritas no enunciado do exercício.
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
        // 1. Criar uma lâmpada mágica com capacidade para 4 génios.
        MagicLamp lamp = new MagicLamp(4);

        // 2. Esfregar 5 vezes a lâmpada, indicando os números de desejos 2, 3, 4, 5, 1.
        for (int i = 1; i <= 5; i++) {
            lamp.rub(i);
        }

        // 3. Invocar e imprimir o resultado do método toString sobre cada um dos génios.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Genie #" + i + ": " + lamp.rub(i));
        }

        // 4. Pedir um desejo a cada um dos génios.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Genie #" + i + ": " + lamp.rub(i));
        }

        // 5. Invocar e imprimir o resultado do método toString sobre cada um dos génios.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Genie #" + i + ": " + lamp.rub(i));
        }

        // 6. Pedir um desejo a cada um dos génios.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Genie #" + i + ": " + lamp.rub(i));
        }

        // 7. Invocar e imprimir o resultado do método toString sobre cada um dos génios.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Genie #" + i + ": " + lamp.rub(i));
        }

        // 8. Colocar o demónio reciclável na lâmpada.
        lamp.feedDemon();

        // 9. Esfregar a lâmpada, indicando 7 como número de desejos.
        lamp.rub(7);

        // 10. Invocar e imprimir o resultado do método toString sobre o génio obtido
        RecyclableDemon demon = new RecyclableDemon();
        System.out.println("Demon: " + demon);
    }
    }

