# challenge

Crie uma classe Pizza que possua o método adicionaIngrediente(Ingrediente ingrediente) <br>
que receba um Ingrediente com os campos String nome, int quantidade. <br>

A classe Pizza também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 <br>
reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.

É preciso contabilizar os ingredientes gastos por todas as pizzas! <br> 
Utilize uma variável na classe Pizza para guardar esse tipo de informação <br>
(dica: utilize a classe List para guardar os ingredientes de cada pizza).

Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. <br> 
Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas.<br>
O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

Crie uma classe Principal com o método main() que faz o seguinte:<br>
Cria 3 pizzas com ingredientes diferentes <br>
Adiciona essas Pizzas em um CarrinhoDeCompra <br>
Imprime o total do CarrinhoDeCompra <br>
Imprime o ingrediente e sua quantidade utilizada em cada pizza.

