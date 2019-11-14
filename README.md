# TrabNP2
trabalho da np2 de poo 4 semestre 2019/2

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
Adicionada combobox para o campo estado na tela de cadastro;
Adicionado o função limpar combobox dentro do método Limpar Campos;
Criada FarmaciaGUI;
Mudadas todas as tabelas para public e static, para que a biblioteca de comunicação
com o Mysql funcione;
Criado ProntuarioGUI;




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



