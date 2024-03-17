public class FriendlyGenie {
    private int grantedWishes; // Número de desejos concedidos
    private int remainingWishes; // Número de desejos restantes

    /**
     * Construtor da classe FriendlyGenie.
     * @param remainingWishes O número inicial de desejos que o génio pode conceder.
     */
    public FriendlyGenie(int remainingWishes) {
        this.remainingWishes = remainingWishes;
    }

    /**
     * Método que concede um desejo.
     * @return true se o desejo foi concedido com sucesso, false caso contrário.
     */
    public boolean grantWish() {
        if (remainingWishes > 0) {
            grantedWishes++; // Incrementa o número de desejos concedidos
            remainingWishes--; // Decrementa o número de desejos restantes
            return true; // Retorna true indicando que o desejo foi concedido
        } else {
            return false; // Retorna false indicando que não há mais desejos para conceder
        }
    }

    /**
     * Método que retorna o número de desejos já concedidos.
     * @return O número de desejos concedidos.
     */
    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Método que retorna o número de desejos restantes que o génio pode conceder.
     * @return O número de desejos restantes.
     */
    public int getRemainingWishes() {
        return remainingWishes;
    }

    /**
     * Método que verifica se ainda existem desejos que o génio pode conceder.
     * @return true se ainda existem desejos para conceder, false caso contrário.
     */
    public boolean canGrantWish() {
        return remainingWishes > 0;
    }

    /**
     * Sobrescrita do método toString para fornecer uma representação textual do génio bem-humorado.
     * @return Uma string descrevendo o estado do génio bem-humorado.
     */
    @Override
    public String toString() {
        return "Friendly genie has granted " + grantedWishes + " wishes and still has " +
                remainingWishes + " to grant.";
    }
}
