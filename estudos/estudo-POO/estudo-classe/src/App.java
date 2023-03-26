public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Polo");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(5.89));

        Carro carro2 = new Carro("Cinza","Mercedes-Benz Classe A", 70);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(5.89));
    }
}
