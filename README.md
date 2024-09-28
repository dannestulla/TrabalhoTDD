## Cenários elaborados
### Cenário 1: Gerenciamento de máquinas

#### Cenário 1.1: Adicionar de máquinas

    Dado que o sistema de cadastro de máquinas está acessível
    E uma máquina com nome "Máquina 1" e ID "001" não está cadastrada no sistema
    Quando um usuário cadastrar a máquina "Máquina 1" com ID "001"
    Então a máquina "Máquina 1" deverá estar registrada no sistema

#### Cenário 1.2: Remoção de máquinas

    Dado que o sistema de cadastro de máquinas está acessível
    E uma máquina com nome "Máquina 1" e ID "001" está cadastrada no sistema
    Quando um usuário remover a máquina "Máquina 1" com ID "001"
    Então a máquina "Máquina 1" não deverá estar mais registrada no sistema

#### Cenário 1.3: Consultar uma máquina
    Dado que o sistema de cadastro de máquinas está acessível
    E uma máquina com nome "Máquina 1" e ID "001" está cadastrada no sistema
    Quando um usuário consultar a máquina "Máquina 1" com ID "001"
    Então os detalhes da máquina "Máquina 1" deverão ser exibidos, incluindo ID "001" e outras informações relevantes.

#### Cenário 1.4: Consultar listar todas as máquinas
    Dado que o sistema de cadastro de máquinas está acessível
    E existem máquinas cadastradas no sistema
    Quando um usuário solicitar a lista de todas as máquinas
    Então todas as máquinas cadastradas deverão ser exibidas, incluindo seus nomes e IDs.

#### Cenário 1.5: Alterar dados de uma máquina
    Dado que o sistema de cadastro de máquinas está acessível
    E uma máquina com nome "Máquina 1" e ID "001" está cadastrada no sistema
    Quando um usuário alterar os dados da máquina "Máquina 1", por exemplo, mudando seu nome para "Máquina A"
    Então os dados da máquina devem ser atualizados no sistema, e a máquina "Máquina A" deverá estar registrada com ID "001".

## Lista de Tarefas a Implementar**
Sistema de Cadastro de Máquinas
1.0 Criar uma classe para representar máquinas.

1.1 Criar método para adicionar máquina no sistema.

1.2 Criar método para remover máquina no sistema.

1.3 Criar método para consultar uma máquina no sistema.

1.4 Criar metodo para listar todas maquinas cadastradas 

1.5 Criar método para alterar dados de uma máquina

## ** Diagrama de caso de uso
<img width="677" alt="image" src="https://github.com/user-attachments/assets/5dbac6a8-7192-4926-80cd-b067e9717b67">




