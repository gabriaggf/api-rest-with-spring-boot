# Configuração Completa do Cursor para Java Spring Boot

## 📋 Pré-requisitos

1. **Java JDK 17** instalado e configurado
2. **Maven** instalado e configurado
3. **Cursor** instalado

## 🚀 Instalação das Extensões

### Extensões Essenciais (instalar automaticamente):
- **Extension Pack for Java** - Pacote completo para desenvolvimento Java
- **Spring Boot Dashboard** - Gerenciamento de aplicações Spring Boot
- **Spring Initializr** - Criação de projetos Spring Boot
- **Maven for Java** - Suporte ao Maven
- **Debugger for Java** - Debug de aplicações Java
- **Test Runner for Java** - Execução de testes
- **Project Manager for Java** - Gerenciamento de projetos Java

### Como instalar:
1. Pressione `Ctrl+Shift+X` para abrir a aba de extensões
2. Procure por cada extensão e clique em "Install"
3. Reinicie o Cursor após a instalação

## ⚙️ Configurações Importantes

### 1. Configuração do Java
- **Java Home**: Configure o caminho para o JDK 17
- **Maven Home**: Configure o caminho para o Maven
- **Java Version**: 17

### 2. Configurações do Editor
- **Auto Save**: Habilitado (1 segundo)
- **Format on Save**: Habilitado
- **Organize Imports**: Habilitado
- **Tab Size**: 4 espaços

## 🛠️ Comandos Úteis

### Atalhos de Teclado:
- `Ctrl+Shift+P` - Paleta de comandos
- `Ctrl+Shift+O` - Navegar para símbolo
- `F12` - Ir para definição
- `Shift+F12` - Encontrar todas as referências
- `Ctrl+Space` - Sugestões de código
- `Ctrl+Shift+Space` - Sugestões de parâmetros

### Comandos Maven (via terminal):
```bash
# Limpar projeto
mvn clean

# Compilar
mvn compile

# Executar testes
mvn test

# Empacotar
mvn package

# Executar aplicação Spring Boot
mvn spring-boot:run

# Instalar no repositório local
mvn install
```

## 🎯 Snippets Disponíveis

### Digite estes prefixos para usar os snippets:

- **`sbcontroller`** - Cria um controller REST completo
- **`sbservice`** - Cria um service completo
- **`sbentity`** - Cria uma entidade JPA
- **`sbrepository`** - Cria um repository JPA

## 🔧 Configurações de Debug

### Configurações disponíveis:
1. **Debug Spring Boot App** - Debug da aplicação principal
2. **Debug Current File** - Debug do arquivo atual
3. **Attach to Process** - Conectar a um processo em execução

### Como usar:
1. Pressione `F5` para iniciar o debug
2. Selecione a configuração desejada
3. Configure breakpoints clicando na margem esquerda do editor

## 📁 Estrutura de Arquivos Criada

```
.vscode/
├── settings.json          # Configurações do editor
├── extensions.json        # Extensões recomendadas
├── tasks.json            # Tarefas Maven
├── launch.json           # Configurações de debug
└── java.code-snippets    # Snippets personalizados
```

## 🚨 Solução de Problemas

### Problema: Java não é reconhecido
**Solução**: Verifique se o JAVA_HOME está configurado corretamente

### Problema: Maven não funciona
**Solução**: Verifique se o Maven está no PATH do sistema

### Problema: Extensões não funcionam
**Solução**: Reinicie o Cursor após instalar as extensões

### Problema: Debug não funciona
**Solução**: Verifique se a classe principal está configurada corretamente no launch.json

## 📚 Recursos Adicionais

- **Spring Boot Documentation**: https://spring.io/projects/spring-boot
- **Java Documentation**: https://docs.oracle.com/en/java/
- **Maven Documentation**: https://maven.apache.org/guides/

## 🎉 Pronto!

Agora você tem uma configuração completa do Cursor para desenvolvimento Java Spring Boot. As extensões e configurações foram otimizadas para:

- ✅ Desenvolvimento Java eficiente
- ✅ Suporte completo ao Spring Boot
- ✅ Debug avançado
- ✅ Snippets úteis
- ✅ Formatação automática
- ✅ Organização de imports
- ✅ Integração com Maven

**Dica**: Use `Ctrl+Shift+P` e digite "Java: Reload Projects" se algo não estiver funcionando corretamente.
