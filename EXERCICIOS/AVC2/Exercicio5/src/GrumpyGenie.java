public class GrumpyGenie {
    private boolean wishGranted; // Indica se o desejo foi concedido ou não

    /**
     * Método que concede um desejo, desde que ainda não tenha concedido nenhum desejo anteriormente.
     * @return true se o desejo foi concedido com sucesso, false caso contrário.
     */
    public boolean grantWish() {
        if (!wishGranted) {
            wishGranted = true; // Define que o desejo foi concedido
            return true; // Retorna true indicando que o desejo foi concedido
        } else {
            return false; // Retorna false indicando que o desejo não foi concedido
        }
    }

    /**
     * Método que retorna o número de desejos já concedidos pelo génio mal-humorado.
     * @return 1 se um desejo foi concedido, 0 caso contrário.
     */
    public int getGrantedWishes() {
        return wishGranted ? 1 : 0;
    }

    /**
     * Sobrescrita do método toString para fornecer uma representação textual do génio mal-humorado.
     * @return Uma string descrevendo o estado do génio mal-humorado.
     */
    @Override
    public String toString() {
        return wishGranted ? "Grumpy genie has granted a wish." : "Grumpy genie has a wish to grant.";
    }
}
