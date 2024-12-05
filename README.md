Este é um sistema simples para gerenciar pedidos de produtos e aplicar descontos com base em diferentes critérios, como quantidade ou temporada. O sistema calcula o total do pedido considerando esses descontos e envia uma notificação ao usuário após a finalização do pedido.

Funcionalidades
Cadastro de Clientes: O sistema permite cadastrar clientes que farão os pedidos.
Cadastro de Produtos: Produtos podem ser adicionados ao pedido, com preços e quantidades.
Aplicação de Descontos: Descontos podem ser aplicados com base em diferentes critérios:
Desconto Sazonal: Aplica um desconto fixo (ex: 10%) no preço do produto.
Desconto por Quantidade: Aplica um desconto baseado na quantidade comprada do produto.
Cálculo do Total: O sistema calcula o total do pedido após a aplicação dos descontos.
Notificação de Pedido: Após a finalização do pedido, o sistema envia uma notificação por e-mail utilizando o Gmail.
Estrutura do Projeto
Este projeto foi estruturado para seguir o conceito de Programação Orientada a Objetos (OOP) e aplica princípios de design como SOLID. O código é modular, facilitando a manutenção e a adição de novas funcionalidades.

Principais Classes
Product: Representa os produtos que são adicionados aos pedidos, com atributos como nome, preço e quantidade.
Client: Representa o cliente que faz o pedido.
Order: Representa o pedido feito por um cliente, contendo a lista de produtos e a aplicação dos descontos.
Discount: Interface para representar descontos. Classes específicas como SeasonalDiscount e DiscontQuantity implementam essa interface para aplicar regras específicas de desconto.
OrderItem: Responsável por calcular o total do pedido, aplicando os descontos nos produtos.
Message: Interface para enviar notificações. SendGmail é uma implementação concreta dessa interface que envia um e-mail de confirmação do pedido.
RegisterNotification: Registra a notificação após o pedido ser finalizado, enviando a mensagem de confirmação para o cliente.
