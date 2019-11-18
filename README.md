# TrabNP2
trabalho da np2 de poo 4 semestre 2019/2

============================================================================================================================ 
ATENÇÃO: Pessoal, quando forem testar o programa nunca se esqueçam de conferir as credenciais para fazer login com o banco!

Sempre que for fazer mudanças, abra um novo branch no git para evitarmos conflito no master (git checkout -b nome_do_branch)
============================================================================================================================
update guilhpupo 17/11/19
---
- Os logins agora carregam as novas telas com os dados do usuário que irá utilizar
- No sql do banco está os insert into dos profissionais

update victortortelli 17/11/19
---
Em NovaConsultaGUI:
- Botão pesquisar já funcionando. Ao pesquisar pelo numero do cartao sus, a função retornaPaciente() é chamda e os dados sao 
automaticamente preenchidos nos campos abaixo para conferência
- Campo Número da Consulta apagado


Em ConsultaDAO:
- Criada função retornaPaciente(), Já funcionando



update victortortelli 16/11/19
---
Em PacienteDAO:
- Função selectAll() já pronta e funcionando

Em ListarUsuariosGUI:
- Botão pesquisar funcionando. Quando nenhum campo é preenchido, todos os usuários são listados
Quando o campo Cartao_sus é preenchido, retorna apenas o paciente correspondente
- Removido botão de Atualizar

Em ListarConsultaGUI():
- Removido botão Atualizar Consulta
- Botão de Cancelar consulta finalizado, falta testar

Em Consulta():
- Criada variavel data (compativel com mysql) e variavel numero (numero da consulta)

Em ConsultaDAO():
- Criada função listarConsultas(), já funcionando

Em Banco de Dados:
- Para facilitar a programação, separei a coluna data (datetime) em duas: data (date) e hora (time).



update victortortelli 14/11/19
---
Em CadastroGUI:
- Quando é feito o clique nos campos data de nasc, cpf, sus ou telefone, o cursor vai automaticamente pro inicio do textfield
- Feito o set de todos os atributos e seus devidor campos
- Criado a "mascara" para setar o Estado, cor/raçca e deficiencia de acordo com o que foi selecionado no combobox
- Mudado label RG para RG/CN, onde aproveitaremos o problema de não poder colocar um filtro por causa dos diferentes tipos de RG para acrescentar
a possibilidade de registrar a certidão de nascimento CN no lugar
- Todos os campos obrigatórios agora tem um *
- Criada a armadilha para que não possa ser selecionado as duas opções de sexo ao mesmo tempo (buga as vezes)
- Criada uma função que retorna um String com o sexo selecionado

Em Paciente:
- Criado atributos cor/raça, sexo e deficiencia



update guilhpupo 13/11/19
---
Agora o login utiliza users do banco para acessar:
codigo sql para criacao dos users:
****
create user pupo@localhost identified by "thegreat";
grant select,insert,update,delete on trabalhoNp2.* to pupo@localhost;

create user ed@localhost identified by "willy";
grant select,insert,update,delete on trabalhoNp2.* to ed@localhost;

create user vitao@localhost identified by "victor";
grant select on trabalhoNp2.pacientes to vitao@localhost;
grant select on trabalhoNp2.diagnosticos to vitao@localhost;
****

update victortortelli 11/11/19
---
- Adicionada combobox para o campo estado na tela de cadastro;
- Adicionado o função limpar combobox dentro do método Limpar Campos;
- Criada FarmaciaGUI;
- Mudadas todas as tabelas para public e static, para que a biblioteca de comunicação
com o Mysql funcione;
- Criado ProntuarioGUI;




update guilhpupo 04/11/19
---
adicionadas arquivo .jar pra usar de biblioteca (ta na pasta Banco de Dados)
adicionadas mascaras na GUI CadastroGUI para cartaoSUS, cpf, telefone e data de nascimento
feitos alguns testes de consistencia do formulario (ainda faltam alguns)
colocadas todas as GUI pra iniciar no centro da tela




update guilhpupo 02/11/2019
---
terminada a PacienteDAO insert, falta fazer os testes de consistencia em CadastroGUI e fazer o select na PacienteDAO pra retornar um paciente conforme é pedido em ListPacientesGUI




update victor 02/11/2019
---

criada a pasta com a biblioteca do mysql dentro 

encapsulados os campos da classe pacientes






update guilhpupo 01/11/19
---

criei a primeira interação com o banco é um insert into, mas não funciona devido a um erro no Class.forName("essa string aqui tem que arrumar").newInstance(); da classe Conexao.

o botão de cadastro já está configurado para o teste

precisa de um banco chamado trabalhoNp2 com a tabela paciente(cartaosus,cpf,nome) ----> para o teste

a partir do momento que este teste funcionar, a parte de conexao com o banco vira só mão de obra

vamos fazer um log dessas atualizações sempre depois do ultimo merge do dia, colocar a proxima atualização em cima deste texto (aonde eu fiz um modelo com "??") obrigado



