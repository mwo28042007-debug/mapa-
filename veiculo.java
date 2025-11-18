/**
 * Veiculo.java
 * Classe base que representa um veículo genérico.
 * Contém atributos comuns a todos os veículos e um método para exibir dados.
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double capacidadeTanque;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Getters (caso precise usar fora da classe)
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getCapacidadeTanque() { return capacidadeTanque; }

    // Método para exibir informações do veículo
    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
      /**
 * Onibus.java
 * Subclasse de Veiculo que adiciona o atributo quantidadePassageiros.
 * Demonstra herança e sobrescrita (polimorfismo).
 */
public class Onibus extends Veiculo {
    private int quantidadePassageiros;

    public Onibus(String marca, String modelo, int ano, double capacidadeTanque, int quantidadePassageiros) {
        super(marca, modelo, ano, capacidadeTanque);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantidadePassageiros() { return quantidadePassageiros; }

    // Sobrescreve exibirDados para adicionar informação específica
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de passageiros: " + quantidadePassageiros);
        System.out.println("----------------------------------");
    }
}
      /**
 * Caminhao.java
 * Subclasse de Veiculo que adiciona o atributo capacidadeCarga (em toneladas).
 */
public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeTanque, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadeTanque);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("----------------------------------");
    }
}
      /**
 * Main.java
 * Classe principal para instanciar veículos e exibir no console.
 * Aqui usamos um array de Veiculo para demonstrar polimorfismo.
 */
public class Main {
    public static void main(String[] args) {
        // Criando um array de Veiculo com 3 posições
        Veiculo[] veiculos = new Veiculo[3];

        // Instanciando objetos: um Veiculo genérico, um Onibus e um Caminhao
        veiculos[0] = new Veiculo("Fiat", "Uno", 2015, 45.0);
        veiculos[1] = new Onibus("Mercedes", "Tourismo", 2020, 200.0, 50);
        veiculos[2] = new Caminhao("Volvo", "FH16", 2022, 300.0, 25.0);

        // Exibe dados de cada veículo — aqui o polimorfismo garante que o método correto seja chamado
        for (Veiculo v : veiculos) {
            v.exibirDados();
        }
    }
}
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade do tanque: " + capacidadeTanque + " litros");
    }
}
