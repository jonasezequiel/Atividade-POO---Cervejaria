Nesta atividade de Programção Orientada a Objetos foi proposto para ser desenvolvido um programa de fabricação de cerveja, usando os atributos do tipo private e para acessar usando os métodos getters() e setters().

CLASSE INGREDIENTE:
    Contém os atributos e os métodos getters()esetters().
CLASSE RECEITA: 
    Contém o nome e uma lista com vários Ingredientesprovidos da classe Ingrediente, métodos getters()esetters()e o métodoque adiciona um ingredienteatravés de parâmetro.
CLASSE CERVEJA:
    Contém os atributos e um objeto Receita vindo da classe Receitae os métodos getters()esetters().
CLASSE PRINCIPAL: 
    -Cadastrar vários ingredientes.
    -Cadastrar3 receitas usando os ingredientes da classe Ingrediente.
    -Montar 3 Cervejas usando as receitar já criadas.
    
Ao final mostrar todos os dados, neste formato:
    System.out.println("Informaçõesdacerveja:");
    System.out.println("Nome:"+ minhaCerveja.getNome());
    System.out.println("Volume:"+ minhaCerveja.getVolumeLitros() +"litros");
    System.out.println("Receita:"+ minhaCerveja.getReceita().getNome());
    System.out.println("Ingredientes:");
    for(Ingrediente ingrediente : minhaCerveja.getReceita().getIngredientes()) {System.out.println("-"+ ingrediente.getNome() +":"+ ingrediente.getQuantidade() +"kg");}
