public class Main_produtos {
    public static void main(String[] args) {
          Produtos produtos = new Produtos();


          produtos.setProduto("telefone");
          produtos.setDescricao("de ultima geração");
          produtos.setDataDeVecimento("28/07/22");

          System.out.println(produtos.getProduto()+ "\n" + produtos.getDescricao() + "\n" + produtos.getDataDeVecimento());

    }
}
