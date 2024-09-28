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

## Lista de Tarefas a Implementar
Sistema de Cadastro de Máquinas
1.0 Criar uma classe para representar máquinas.

1.1 Criar método para adicionar máquina no sistema.

1.2 Criar método para remover máquina no sistema.

1.3 Criar método para consultar uma máquina no sistema.

1.4 Criar metodo para listar todas maquinas cadastradas 

1.5 Criar método para alterar dados de uma máquina

## Caso de uso
RF002 – Manter Ativos 

### Descrição:

O sistema deverá possibilitar, para usuários autorizados, a gestão completa dos dados dos ativos utilizados na produção, permitindo a inclusão, alteração, consulta e exclusão de informações. 

### Especificação Detalhada:

#### Cadastro de Ativos: 

O sistema deverá permitir o cadastro de novos ativos, solicitando obrigatoriamente as seguintes informações: 

* Nome do ativo 
* Código de identificação

Após inserir as informações, o usuário terá a opção de salvar o novo ativo ou cancelar a operação. 

##### Consulta de Ativos: 

O sistema deverá permitir a consulta das informações dos ativos já cadastrados. Para isso, o usuário deverá ter duas opções: 

* Busca por palavra-chave: O usuário digita uma ou mais palavras e o sistema retorna todos os ativos que contenham tal(is) palavra(s) em seus dados, ordenados alfabeticamente. 
* Lista completa de ativos: O sistema deverá listar o nome de todos os ativos ordenados alfabeticamente. 

Em ambos os casos, após o usuário selecionar um dos ativos listados, o sistema deverá exibir todos os dados de cadastro do ativo. 

#### Alteração de Dados de Ativos: 
O sistema deverá possibilitar, para usuários autorizados, a alteração de todas as informações referentes aos ativos já cadastrados no sistema. 
Inicialmente, o usuário deverá selecionar o ativo que deseja alterar através do mesmo mecanismo do sistema de consulta de ativos. 
Após selecionar o ativo desejado, o sistema deverá exibir as informações do ativo e possibilitar que o usuário altere-as. 
Após alterar as informações, o usuário poderá salvá-las ou cancelar a operação. 

#### Exclusão de Ativos: 
O sistema deverá possibilitar, para usuários autorizados, a exclusão de ativos cadastrados. 
Para isso, o usuário deverá selecionar o ativo que deseja excluir através do mesmo mecanismo do sistema de consulta de ativos. 
Após selecionar o ativo desejado, o sistema deverá exibir as informações do ativo e possibilitar a exclusão do mesmo. 
Caso o ativo esteja associado a algum registro importante (por exemplo, históricos de manutenção críticos), o sistema deverá exibir uma mensagem de aviso ao usuário de que o ativo não pode ser excluído por razões específicas e listar os registros associados. 
 

## Diagrama de caso de uso
<img width="677" alt="image" src="https://github.com/user-attachments/assets/5dbac6a8-7192-4926-80cd-b067e9717b67">




