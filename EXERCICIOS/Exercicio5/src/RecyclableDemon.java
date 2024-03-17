public class RecyclableDemon {
    private boolean recycled; // Indica se o demónio foi reciclado ou não
    private int grantedWishes; // Número de desejos concedidos pelo demónio

    /**
     * Método que concede um desejo, desde que o demónio não tenha sido reciclado.
     * @return true se o desejo foi concedido com sucesso, false caso contrário.
     */
    public boolean grantWish() {
        if (!recycled) {
            grantedWishes++; // Incrementa o número de desejos concedidos
            return true; // Retorna true indicando que o desejo foi concedido
        } else {
            return false; // Retorna false indicando que o desejo não foi concedido devido ao demónio estar reciclado
        }
    }

    /**
     * Método que recicla o demónio, tornando-o inativo.
     */
    public void recycle() {
        recycled = true; // Define que o demónio foi reciclado
    }

    /**
     * Método que verifica se o demónio foi reciclado.
     * @return true se o demónio foi reciclado, false caso contrário.
     */
    public boolean recycled() {
        return recycled;
    }

    /**
     * Método que retorna o número de desejos concedidos pelo demónio.
     * @return O número de desejos concedidos.
     */
    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Sobrescrita do método toString para fornecer uma representação textual do demónio reciclável.
     * @return Uma string descrevendo o estado do demónio reciclável.
     */
    @Override
    public String toString() {
        return recycled ? "Demon has been recycled." : "Recyclable demon has granted " + grantedWishes + " wishes.";
    }
}
