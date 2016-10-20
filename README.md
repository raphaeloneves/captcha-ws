# captcha-ws
Componente de captcha baseado na API do Visual Captcha(http://visualcaptcha.net/).
Atualmente existe somente uma versão não oficial de integração com Java, desenvolvido com Servlet. O objetivo deste projeto é desacoplar o fornecimento e comportamento do servidor de captcha de forma modularizada, a fim de que outras aplicações possam consumir o componente do serviço REST a partir do uso do componente modificado do VisualCaptcha.

#Para configurar o projeto, tenha:

* JDK 1.7 ou superior.
* JQuery 2.2.4 ou superior.
* Servidor de aplicação de sua preferência.

A estrutura do projeto ainda não foi adaptada para trabalhar com o Maven, com isso, as bibliotecas abaixo precisam ser adicionadas ao class path da aplicação.
Obs: As mesmas encontram-se na pasta WEB-INF/libs deste projeto.

* asm-3.1.jar
* gson-2.1-javadoc.jar
* gson-2.1-sources.jar
* gson-2.1.jar
* jersey-core-1.11.jar
* jersey-json-1.11.jar
* jersey-server-1.11.jar
* jersey-servlet-1.11.jar
* jsr311-api-1.1.1.jar


#Fluxo de trabalho:

* Cliente envia a requisição ao servidor para geração do captcha.
* Servidor processa a requisição e gera uma lista contendo cinco opções de captcha em imagens e um captcha de audio.
* Dentre as cinco opções de imagem, uma é eleita como captcha válido.
* As opções são serializadas pelo servidor e devolvidas para o cliente.
* O Visual Captcha recebe as informações, coloca o audio e imagem válidos no sessionStorage e os renderiza e monta o componente em tela.
* Usuário seleciona o captcha e clica no botão de validação (definido programaticamente pelo developer).
* Se o o captcha for válido, chama-se a callback de sucesso. Caso contrário, exibe alerta de opção inválida.


#TODOs:

* Adaptar o projeto para arquitetura Maven
* Melhorar o tratamento de rotas do componente cliente.
* Integrar feedback por meio de mensagens quando a opção selecionada for válida/inválida.

