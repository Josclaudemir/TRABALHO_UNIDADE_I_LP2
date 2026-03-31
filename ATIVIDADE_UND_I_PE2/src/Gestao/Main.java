package Gestao;
public class Main {

    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor("Fazenda Local", "123456", "Brasil");
        Fornecedor f2 = new Fornecedor("TechGlobal", "789101", "EUA");

        ProdutoAlimenticio arroz = new ProdutoAlimenticio(
                "Arroz", 1111, 10.0, f1, 4);

        ProdutoEletronico celular = new ProdutoEletronico(
                "Smartphone", 2222, 1000.0, f2, 24);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem(arroz);
        carrinho.adicionarItem(celular);

        carrinho.processarCompra();
    }
}

/* import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        String continuar;

        System.out.println("=== SISTEMA DE SUPERMERCADO ===");

        do {

            System.out.println("\nNovo Produto");

            System.out.print("Nome da empresa: ");
            String nomeEmpresa = sc.nextLine();

            System.out.print("NIF: ");
            String nif = sc.nextLine();

            System.out.print("País de origem: ");
            String pais = sc.nextLine();

            Fornecedor fornecedor = new Fornecedor(nomeEmpresa, nif, pais);

            
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Código de barras: ");
            int codigo = sc.nextInt();

            System.out.print("Preço base: ");
            double preco = sc.nextDouble();

            System.out.println("Tipo do produto:");
            System.out.println("1 - Alimentício");
            System.out.println("2 - Eletrônico");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.print("Dias de validade: ");
                int dias = sc.nextInt();

                ProdutoAlimenticio p = new ProdutoAlimenticio(
                        nome, codigo, preco, fornecedor, dias);

                carrinho.adicionarItem(p);

            } else if (tipo == 2) {
                System.out.print("Meses de garantia: ");
                int meses = sc.nextInt();

                ProdutoEletronico p = new ProdutoEletronico(
                        nome, codigo, preco, fornecedor, meses);

                carrinho.adicionarItem(p);
            }

            sc.nextLine();

            System.out.print("\nDeseja adicionar outro produto? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n=== PROCESSANDO COMPRA ===");
        carrinho.processarCompra();

        sc.close();
    }
} */