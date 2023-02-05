public class PlanoOperadore {
    public static void main(String[] args) {
        String plano = "y";

        switch (plano) {
            case "T": {
                System.out.println("5Gb YouTube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            default: {
                System.out.println("Plano inválido!");
            }
        }
    }
}
