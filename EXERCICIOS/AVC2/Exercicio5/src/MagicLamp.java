public class MagicLamp {
    private final int maxGenies; // Capacidade máxima de génios que a lâmpada pode liberar
    private int rubCount; // Contador de vezes que a lâmpada foi esfregada
    private int rechargeCount; // Contador de vezes que a lâmpada foi recarregada
    private int currentGenies; // Número atual de génios disponíveis na lâmpada
    private RecyclableDemon recyclableDemon; // Referência ao demónio reciclável

    /**
     * Construtor da classe MagicLamp.
     * @param maxGenies A quantidade máxima de génios que a lâmpada pode liberar.
     */
    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        this.currentGenies = maxGenies;
    }

    /**
     * Método que esfrega a lâmpada, liberando um génio se ainda houver disponível.
     * @param wishes O número de desejos que se espera que o génio realize.
     * @return true se um génio foi liberado com sucesso, false caso contrário.
     */
    public boolean rub(int wishes) {
        if (currentGenies > 0) {
            rubCount++; // Incrementa o contador de esfregadas na lâmpada
            currentGenies--; // Decrementa o número de génios disponíveis
            return true; // Retorna true indicando que um génio foi liberado
        } else {
            if (recyclableDemon == null) {
                recyclableDemon = new RecyclableDemon(); // Cria um novo demónio reciclável se ainda não existir
            }
            return false; // Retorna false indicando que não há mais génios disponíveis
        }
    }

    /**
     * Método que alimenta o demónio reciclável, recarregando a lâmpada.
     */
    public void feedDemon() {
        if (recyclableDemon != null) {
            recyclableDemon.recycle(); // Recicla o demónio reciclável, tornando-o inativo
            currentGenies = maxGenies; // Recarrega a lâmpada com a quantidade máxima de génios
            rechargeCount++; // Incrementa o contador de recargas na lâmpada
        }
    }

    /**
     * Método que retorna a quantidade atual de génios disponíveis na lâmpada.
     * @return O número de génios disponíveis.
     */
    public int getGenies() {
        return currentGenies;
    }

    /**
     * Método que retorna a quantidade de vezes que a lâmpada foi recarregada.
     * @return O número de recargas na lâmpada.
     */
    public int getDemons() {
        return rechargeCount;
    }

    /**
     * Sobrescrita do método equals para comparar duas instâncias de MagicLamp.
     * @param obj O objeto a ser comparado.
     * @return true se as lâmpadas são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MagicLamp) {
            MagicLamp other = (MagicLamp) obj;
            return this.maxGenies == other.maxGenies && this.getGenies() == other.getGenies() &&
                    this.getDemons() == other.getDemons();
        }
        return false;
    }
}
