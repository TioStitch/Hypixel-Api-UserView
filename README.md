# HYPIXEL API - USER VIEW
> Desenvolvida para testes.

![image](https://staticassets.hypixel.net/news/5cfe76f01f26c.new%20game%20Skyblock.png)

- Eu me deparei com a dúvida em entender o básico sobre os protocolos **(HTTP/HTTPS/TCP/IP)** entre outros. Então eu pensei, vou tentar algo com a API do **Hypixel Sky Block**, e ai está.

**Funcionamento do Código**
- o código funciona fazendo requisições do tipo **(GET)** para a API.
- Devemos abrir um stream com a conexão e fazer sua leitura, eu usei **BufferedReader** para a leitura.
- O objetivo é obtermos um **JSON** utilizando a API **(GSON)** do Google, criamos uma classe para representar.
- A classe de representação precisa ter Fields para tratar este JSON.
- Após todos os processos, temos muitas ideias do que fazer!
