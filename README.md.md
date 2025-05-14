# Bank Account
### Descrição do Projeto
O projeto Bank Account é um sistema simples para o cadastro e gerenciamento de contas bancárias. Ele permite que o usuário informe o número da conta, o nome do titular e o valor de depósito inicial (opcional) ao abrir a conta. Caso o titular não tenha dinheiro para depositar no momento da abertura, o depósito inicial e o saldo inicial da conta serão automaticamente definidos como zero.

## Funcionalidades Principais
* Abertura de Conta: Uma vez que a conta é criada, o número da conta não pode ser alterado. No entanto, o nome do titular pode ser modificado (por exemplo, em caso de casamento ou mudança de nome).
* Gestão de Saldo: O saldo da conta pode ser alterado livremente por meio de depósitos e saques. Para cada saque, é cobrada uma taxa fixa de R$ 5,00. Importante: o saldo da conta não pode ficar negativo após um saque ou pagamento da taxa.
* Fluxo de Operações: O programa permite cadastrar uma conta, escolher entre realizar um depósito ou um saque (informando o valor inicial, se aplicável), e exibe os dados da conta após cada operação.

## Exemplo de Uso
* Cadastre uma conta informando o número, o nome do titular e, opcionalmente, um valor de depósito inicial.
* Realize depósitos e saques, com o sistema atualizando o saldo e aplicando a taxa de R$ 5,00 por saque.
* Visualize os dados atualizados da conta após cada operação.