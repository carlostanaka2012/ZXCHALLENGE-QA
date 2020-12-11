#language: pt
#author: carlos.tanaka
Funcionalidade: Validar direcionamento do site de acordo com faixa etaria informada
  
  Como Usuario
  desejo fazer busca de produtos,selecionar produtos no carrinho
  e navega pelo site

  Cenario: Verificar identificação do usuário menor de idade
    Dado que o usuario acesse o "<site>"
    Entao validar Mensagem de faixa etaria
    E Clicar em "NÃO"
    
    
  Cenario: Verificar identificação do usuário maior de idade
    Dado que o usuario acesse o "<site>"
    Entao validar Mensagem de faixa etaria
    E Clicar no botao "SIM"
	  Entao apresentar a tela Principal "Zé Delivery"
		
	Cenario: Verificar cadastramento Login
    Dado que o usuario acesse o "<site>"
    Entao validar Mensagem de faixa etaria
    E Clicar no botao "SIM"
	  Entao apresentar a tela Principal "Zé Delivery"
	  E Clicar em Entrar
	  Quando Clicar em Criar uma conta
	  Entao Informar dados do Usuario
		
	Cenario: Verificar Login Correto 
		Dado que o usuario acesse o "<site>"
    Entao validar Mensagem de faixa etaria
    E Clicar no botao "SIM"
		Entao apresentar a tela Principal "Zé Delivery"
		E Clicar em Entrar
		Quando Informar E-mail e Senha
		E Clicar em Entrar
		Entao deve apresentar a Home
		

