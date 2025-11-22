# MNextStep - Cloud

## 👥 Integrantes

- **Felipe Ulson Sora** – RM555462 – [@felipesora](https://github.com/felipesora)
- **Augusto Lope Lyra** – RM558209 – [@lopeslyra10](https://github.com/lopeslyra10)
- **Vinicius Ribeiro Nery Costa** – RM559165 – [@ViniciusRibeiroNery](https://github.com/ViniciusRibeiroNery)

## 📌 Sumário

- [📝 Descrição da Solução](#-descrição-da-solução)
- [🗄️ Modelagem do Banco de Dados](#️-modelagem-do-banco-de-dados)
- [🚀 Como Rodar o Projeto NextStep Completo](#-como-rodar-o-projeto-NexyStep-completo)
- [☁️ Detalhes do Projeto em Cloud](#️-detalhes-do-projeto-em-cloud)
- [🚀 Como Fazer o Deploy em Cloud (Azure)](#️-como-fazer-o-deploy-em-cloud-azure)
- [📹 Demonstração em Vídeo](#-demonstração-em-vídeo)

## 📝 Descrição da Solução

O **Next Step** é uma plataforma que ajuda pessoas a descobrirem qual área da tecnologia combina mais com elas e como avançar em sua carreira. 
A partir das informações que o usuário fornece, o sistema indica uma trilha de aprendizado personalizada, com conteúdos como cursos, artigos e desafios. 
Além disso, o usuário pode acompanhar seu progresso e interagir com outros aprendizes pelo aplicativo, tornando sua jornada mais clara, organizada e motivadora.


### O sistema permite:

-🎯**Identificar a área de tecnologia** ideal para cada usuário, com base em seus interesses e habilidades;
-📚**Recomendar trilhas de aprendizado personalizadas**, contendo cursos, artigos, desafios e outros conteúdos;
-📈 **Acompanhar o progresso do usuário** em sua jornada de aprendizado, tornando a evolução mais clara e organizada;
-🤝 **Promover interação entre aprendizes**, permitindo troca de experiências e motivação;
-🔍 **Centralizar e gerenciar trilhas e conteúdos** por meio de um painel para administradores;
-⭐ **Receber avaliações dos usuários**, ajudando a melhorar continuamente as trilhas disponíveis;
-💡 **Oferecer orientação profissional guiada por inteligência**, trazendo clareza para quem busca crescer ou iniciar na área de tecnologia.

### Estrutura da Solução

O projeto foi dividido em múltiplos módulos para facilitar **escalabilidade e integração**, cada um com responsabilidades específicas:

-⚙️**Backend REST em Java (Spring Boot)** – responsável por gerenciar as entidades de usuários, perfis profissionais, recomendações e trilhas de aprendizado, oferecendo endpoints seguros para análise de dados e retorno das sugestões personalizadas. Utiliza Spring Security com JWT para autenticação e autorização, garantindo acesso seguro às funcionalidades.
-🖥️**Backend MVC em Java (Spring MVC)** – disponibiliza uma plataforma web administrativa completa, permitindo cadastro, edição, listagem e exclusão de trilhas, cursos, artigos, desafios e demais conteúdos. Possui controle de permissões via Spring Security, diferenciando administradores de usuários comuns, garantindo gestão adequada do ecossistema de aprendizado.
-🧩**Backend REST em .NET (ASP.NET Core)** – atua como módulo complementar, focado na análise de habilidades, interesses e metas cadastradas pelos usuários, além de integrar-se a modelos de IA para gerar recomendações de trajetória profissional. Esse backend também centraliza informações de progresso e interações sociais dentro da plataforma.
-📱**Frontend Mobile (React Native/Expo)** – consome as APIs Java e .NET para oferecer ao usuário final funcionalidades como visualização de trilhas recomendadas, acompanhamento de progresso, interação com conteúdos, edição de perfil e comunicação com outros aprendizes. Inclui telas amigáveis e responsivas para toda a jornada do NextStep.
-🗄️**Banco de Dados Oracle** – utilizado pelos backends Java e .NET, com criação automática de tabelas, armazenando dados de usuários, trilhas, conteúdos, recomendações, progresso e interações. Garante integridade e consistência entre os módulos do sistema.
-☁️**Cloud (Azure)** – responsável pela hospedagem do Backend MVC Java e do banco de dados PostgreSQL utilizado por parte dos serviços, através do Azure App Service e Azure Database for PostgreSQL. Essa infraestrutura em nuvem garante alta disponibilidade, escalabilidade, segurança e acessibilidade global ao sistema NextStep.

---

## 🚀 Como Rodar o Projeto NextStep Completo

Para utilizar o **NextStep** de forma completa, é necessário rodar simultaneamente três módulos:

1. **⚙️ Backend API REST em Java (Spring Boot)** – responsável por fornecer os endpoints REST que gerenciam usuários, trilhas de aprendizado, conteúdos e recomendações.
2. **🧩 Backend API REST em .NET (ASP.NET Core)** – oferece funcionalidades complementares, como análise de habilidades, geração de recomendações e processamento de dados do perfil profissional.
3. **📱 Frontend Mobile (React Native/Expo)** – aplicativo mobile que consome ambas as APIs e permite ao usuário acessar trilhas recomendadas, acompanhar seu progresso e interagir com conteúdos e outros aprendizes.

   > O Backend MVC em Java (Spring MVC) pode ser executado separadamente. Ele permite:
   >
   >📝 Login e cadastro de usuários;
   >📚 Cadastro, listagem, edição e exclusão de trilhas de aprendizado;
   >🧠 Gerenciamento de conteúdos como cursos, artigos, desafios e podcasts;
   >👤 Administração de perfis e permissões de usuários.

### 🛠️ Passo a Passo

### ☁️ Deploy em Cloud (Azure)

É possível executar o **NextStep MVC Java** diretamente na nuvem, utilizando **Azure App Service** e **Azure Database for PostgreSQL**.

- O passo a passo completo para realizar o deploy está descrito no repositório:  
  👉 [NextStep Cloud](https://github.com/felipesora/nextstep-cloud.git)

---

## ☁️ Detalhes do Projeto em Cloud

O **NextStep Cloud** é a versão do projeto **MVC Java** implantada na nuvem utilizando os serviços da **Microsoft Azure**.

O objetivo foi tornar a aplicação acessível de forma **remota**, **automatizada** e **escalável**, garantindo **alta disponibilidade**, **integração contínua** e **entrega automatizada**.

### 🛠️ Tecnologias e Serviços Utilizados

O deploy em cloud utilizou os seguintes recursos principais:

- **Azure App Service** – hospedagem do projeto **Spring MVC Java**, permitindo escalabilidade automática e gerenciamento simplificado.
- **Azure Database for PostgreSQL** – banco de dados relacional totalmente gerenciado na nuvem.
- **Azure DevOps** – plataforma completa utilizada tanto para **gestão ágil do projeto (Boards e Backlogs)** quanto para **automação CI/CD (Repos e Pipelines)**.
- **Azure Repos** – repositório Git que armazena o código-fonte do projeto e integra com os pipelines de CI/CD.
- **Azure Pipelines** – responsável por executar o processo de build (CI) e deploy (CD) de forma automatizada no **App Service**.
- **Java 17** – versão utilizada na aplicação.
- **Maven** – build e gerenciamento de dependências.

### 🧩 Componentes da Arquitetura Cloud

| **Nome do Componente**    | **Tipo**                                    | **Descrição Funcional**                                      | **Tecnologia / Ferramenta**       |
| ------------------------- | ------------------------------------------- | ------------------------------------------------------------ | --------------------------------- |
| **Repositório de Código** | SCM (Source Code Management)                | Onde o código-fonte está versionado                          | **GitHub**                        |
| **Pipeline CI**           | Orquestrador de CI (Continuous Integration) | Compila o projeto e executa testes automáticos a cada commit | **Azure DevOps Pipelines**        |
| **Pipeline CD**           | Orquestrador de CD (Continuous Delivery)    | Realiza o deploy automático da aplicação na nuvem            | **Azure DevOps Pipelines**        |
| **Banco de Dados**        | PaaS (Platform as a Service)                | Armazena os dados da aplicação de forma gerenciada           | **Azure Database for PostgreSQL** |
| **Web App**               | App Service                                 | Local onde a aplicação roda e é disponibilizada publicamente | **Azure Web App**                 |
| **Gestão Ágil**           | Project Management                          | Organização de Sprints, tarefas e backlog do time            | **Azure Boards (DevOps)**         |


### 📐 Desenho da Arquitetura em Cloud

![Desenho da arquitetura](!!!!COLOCAR ANTES DE ENVIAR!!!!)

### ⚙️ Estrutura do Deploy e Automação (CI/CD)

- O **desenvolvedor** envia o código para o **Azure Repos**, onde o repositório Git centraliza a versão mais recente do projeto.

- O **pipeline de CI (Continuous Integration)** é acionado automaticamente a cada commit, realizando **build**, **testes** e **validações do código**.

- Após a validação, o **pipeline de CD (Continuous Delivery)** realiza o **deploy automático** da aplicação no **Azure App Service**, tornando a nova versão disponível imediatamente.

- As **variáveis de ambiente** (URL do banco, usuário e senha) são configuradas diretamente no App Service, garantindo **segurança e portabilidade**.

- O **banco de dados Oracle local** foi substituído por um **PostgreSQL na Azure**, configurado com acesso remoto e segurança em nível de conexão.

### 🧩 Gestão Ágil com Azure DevOps

Além da automação de deploy, o **Azure DevOps** também foi utilizado para a gestão do projeto:

- O **Azure Boards** organizou as Sprints, tarefas e histórias de usuário seguindo o modelo **Ágil/Scrum**.

- O **Backlog** permitiu priorizar demandas e acompanhar o progresso de cada integrante da equipe.

- Essa integração entre **gestão ágil** e **CI/CD** garantiu um fluxo contínuo de desenvolvimento, testes e entrega de novas versões.

**Link do Azure Boards:**
👉 [Azure Boards - NextStep_Cloud](https://dev.azure.com/RM559165/NextStep_Cloud))

### 📝 Funcionalidades Disponíveis na Nuvem

Na versão em cloud, o sistema mantém todas as funcionalidades do **MVC Java**:

-✅ Login e cadastro de usuários

-🎯 Cadastro, edição, listagem e exclusão de trilhas de aprendizado
-📚 Cadastro, edição e organização de conteúdos (cursos, artigos, desafios, podcasts)
-🤖 Geração e exibição de recomendações personalizadas
-📊 Visualização de progresso, histórico de aprendizado e status das trilhas

### 🌐 Acesso ao Sistema

Após o deploy, a aplicação ficou acessível por meio de uma **URL pública gerada pelo App Service**, permitindo que qualquer usuário autenticado consiga utilizar o sistema remotamente.

### 📊 Benefícios da Arquitetura em Cloud

-🌍 Acesso remoto ao sistema e às trilhas de aprendizado de qualquer lugar
-⚙️ Automação com CI/CD para facilitar atualizações contínuas dos serviços do NextStep
-📈 Escalabilidade automática para suportar o crescimento de usuários e conteúdos
-🔒 Segurança e gerenciamento simplificados, garantindo proteção dos dados e autenticação confiável
-⚡ Alto desempenho com banco de dados otimizado para consultas de trilhas, perfis e recomendações

> ⚠️ O uso combinado de **Azure DevOps**, **Repos**, **Pi** e **App Service** proporcionou uma experiência completa de **integração e entrega contínua (CI/CD)**, simulando o ciclo real de deploy de uma aplicação corporativa em um ambiente de **Cloud Computing**.

---

## ☁️ Como Fazer o Deploy em Cloud (Azure)

O **NextStep Cloud** pode ser implantado na **Microsoft Azure** de duas formas:

1️ **Automatizada**, via **CI/CD com Azure DevOps**.

   > 💡 **Importante**: É necessário a **criação prévia do banco de dados** via **Azure CLI**.

### 1️⃣ Clonar o Repositório

Clone o projeto disponível no GitHub:

```bash
git clone https://github.com/felipesora/nextstep-cloud.git
cd nextstep-cloud
```

### 2️⃣ Preparar o Ambiente

- Instale o **Azure CLI**, caso ainda não tenha.
- Faça login na sua conta Azure:

```bash
az login
```

- Confirme se o login foi realizado corretamente:

```bash
az account show
```

### 3️⃣ Criar o Banco de Dados na Azure

1. Criar um **Resource Group**:

```bash
az group create --name NextStepRG --location brazilsouth
```

2. Criar um **servidor PostgreSQL**:

```bash
az postgres flexible-server create --resource-group NextStepRG --name nextstepdbserver --location brazilsouth --admin-user adminuser --admin-password "NextStep123!" --tier Burstable --sku-name standard_b1ms --storage-size 32 --version 15 --public-access All
```

3. Criar um **banco de dados** dentro do servidor:

```bash
az postgres flexible-server db create --resource-group NextStepRG --server-name nextstepdbserver --database-name nextstep
```

4. Obter a **URL do servidor**:

```bash
az postgres flexible-server show --resource-group NextStepRG --name nextstepdbserver --query "fullyQualifiedDomainName"
```

5. Conectar no banco via **pgAdmin4** (ou psql), usando a URL, usuário e senha.
   - Abra o banco `nextstep`
   - Execute o script SQL disponível no repositório: `script_bd.sql`

### 🚀 Opção 1 – Deploy Automatizado (CI/CD via Azure DevOps)

O processo de deploy automatizado utiliza o **Azure DevOps** para integração e entrega contínua **(CI/CD)**.
Essa abordagem é ideal para times que desejam manter **automatização**, **versionamento** e **rastreabilidade** durante o ciclo de desenvolvimento.

#### 🔧 Etapas do Web App

1. Criar um **App Service Plan**:

```bash
az appservice plan create --name NextStepPlan --resource-group NextStepRG --sku B1 --is-linux
```

2. Criar o **App Service com JDK 17**:

```bash
az webapp create --resource-group NextStepRG --plan NextStepPlan --name nextstep-app --runtime "JAVA:17-java17"
```

3. Configurar as **variáveis de ambiente do App Service**:

```bash
az webapp config appsettings set --resource-group NextStepRG --name nextstep-app --settings DB_URL="jdbc:postgresql://nextstepdbserver.postgres.database.azure.com:5432/nextstep" DB_USER="adminuser" DB_PASSWORD="NextStep123!"
```

#### 🔧 Etapas do Pipeline

1- **Azure Repos**
O desenvolvedor envia o código para o repositório Git hospedado no **Azure Repos**.

2- **Pipeline de CI (Continuous Integration)**
      - É acionado automaticamente a cada *commit* ou *pull request*;
      - Executa o **build** do projeto com **Maven**;
      - Valida o código e gera o arquivo `.jar` da aplicação.

3- **Pipeline de CD (Continuous Delivery)**
      - Após o CI ser concluído com sucesso, o CD realiza o **deploy automático** no **Azure Web App**;
      - As variáveis de ambiente e credenciais do banco de dados são configuradas no App Service;
      - O novo build é disponibilizado automaticamente na URL pública.

4- **Azure Boards**
      - Gerencia as **Sprints**, **tarefas** e **backlog**, integrando o fluxo de trabalho ágil ao pipeline CI/CD.

> 💡 **Vantagens**: automação completa, integração com controle de versão, histórico de builds e deploys e rastreabilidade entre código e tarefas do projeto.

### ⚙️ Opção 2 – Deploy Manual via Azure CLI

Para ambientes de teste ou aprendizado, é possível realizar o deploy manualmente via **Azure CLI**.

#### 1️⃣ Conferir a Versão do JDK

Antes de gerar o build, é importante garantir que o projeto esteja rodando com o **JDK 17** (necessário para o deploy no App Service).

No **IntelliJ IDEA**:

1. Vá em `File > Project Structure > Project`.
2. Em **Project SDK**, selecione o **Java 17** (se não aparecer, adicione manualmente).
3. Certifique-se de que o **Project language level** também esteja configurado para `17 - Sealed types, always-strict floating-point semantics`.

⚠️ Caso o JDK 21 ou outra versão esteja como padrão, altere para **17** para evitar erros de compatibilidade no build e no deploy.

#### 2️⃣ Criar o App Service

1. Configurar variáveis de ambiente na **máquina local**:

Antes de gerar o .jar, defina as mesmas variáveis de ambiente do App Service na sua máquina:
```bash
DB_URL = "jdbc:postgresql://nextstepdbserver.postgres.database.azure.com:5432/nextstep"
DB_USER = "adminuser"
DB_PASSWORD = "NextStep123!"
```
> 🔄 Reinicie o computador para que as alterações entrem em vigor.

2. Gerar o `.jar` do projeto:

```bash
mvn clean package
```

3. Criar um **App Service Plan**:

```bash
az appservice plan create --name NextStepPlan --resource-group NextStepRG --sku B1 --is-linux
```

4. Criar o **App Service com JDK 17**:

```bash
az webapp create --resource-group NextStepRG --plan NextStepPlan --name nextstep-app --runtime "JAVA:17-java17"
```

5. Configurar as **variáveis de ambiente do App Service**:

```bash
az webapp config appsettings set --resource-group NextStepRG --name nextstep-app --settings DB_URL="jdbc:postgresql://nextstepdbserver.postgres.database.azure.com:5432/nextstep" DB_USER="adminuser" DB_PASSWORD="NextStep123!"
```

5. Fazer o **deploy da aplicação**:

```bash
az webapp deploy --resource-group NextStepRG --name NextStep-app --src-path target/nextstep-backend-java-0.0.1-SNAPSHOT.jar --type jar
```

### 🌐 Acessar a Aplicação

Após o deploy, a aplicação estará disponível publicamente em uma URL gerada pelo **App Service**, no formato:

```bash
https://nextstep-app.azurewebsites.net
```

> ⚠️ Lembre-se: o banco de dados **PostgreSQL** precisa estar ativo e com as tabelas criadas (via script SQL) antes de rodar a aplicação em cloud.

---

## 📹 Demonstração em Vídeo

Para visualizar o **NextStep MVC Java** em funcionamento na **Azure**, assista aos vídeos abaixo — cada um demonstra um método diferente de deploy:

### ⚙️ Opção 1 – Deploy Manual via Azure CLI

🎥 [Deploy Manual via Azure CLI](https://www.youtube.com/watch?v=BvK2NWAhHi4)

Neste vídeo, é mostrado o **passo a passo completo de criação e configuração na nuvem**, incluindo:

- Como **criar o banco de dados PostgreSQL** na Azure
- Configuração do **App Service** e variáveis de ambiente
- Deploy do projeto Java para o App Service
- Testes das principais funcionalidades:
  -Login e cadastro de usuários (administradores e comuns)
  -Cadastro, edição, listagem e exclusão de trilhas de aprendizado
  -Cadastro, listagem e exclusão de conteúdos (cursos, artigos, desafios, podcasts)
  -Navegação pelas telas do sistema diretamente pelo navegador, demonstrando que a plataforma está hospedada e funcionando na nuvem

### 🚀 Opção 2 – Deploy Automatizado via CI/CD (Azure DevOps)

🎥 [Deploy Automatizado via CI/CD (Azure DevOps)](https://www.youtube.com/watch?v=uoyx_WaY07k)

Este vídeo apresenta o processo de **integração e entrega contínua (CI/CD)** configurado no **Azure DevOps**, com:

- Como **criar o banco de dados PostgreSQL** na Azure
- Configuração do **App Service** e variáveis de ambiente
- Envio de código para o **Azure Repos**
- Execução automática do **pipeline de build (CI)**
- **Publicação automatizada** no **App Service (CD)**
- Testes das principais funcionalidades:
  -Login e cadastro de usuários (administradores e comuns)
  -Cadastro, edição, listagem e exclusão de trilhas de aprendizado
  -Cadastro, listagem e exclusão de conteúdos (cursos, artigos, desafios, podcasts)
  -Navegação pelas telas do sistema diretamente pelo navegador, demonstrando que a plataforma está hospedada e funcionando na nuvem



> ⚠️ **Importante**: para acompanhar os vídeos e testar o projeto, o **banco PostgreSQL** e o **App Service** precisam estar **ativos e configurados previamente**, conforme o passo a passo da seção de deploy.
