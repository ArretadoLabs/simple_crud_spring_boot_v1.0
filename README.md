# Projeto - exemplo simples de CRUD usando Spring boot

## **Inicializando o projeto**
### Through of link https://start.spring.io/ we can generate all files and folders with dependencies necessary for project.

> ![image](https://github.com/ArretadoLabs/simple_crud_spring_boot_v1.0/assets/165390931/befb54a6-00a5-42e2-9c81-72f222b56e2e)

### The using link of website https://start.spring.io/ for generate specifically dependencies:
> ![image](https://github.com/ArretadoLabs/simple_crud_spring_boot_v1.0/assets/165390931/9ccaba6f-e3cc-4b5a-84e4-c77345a36a5d)


- Spring Web
- Spring H2
- Spring Lombok
- Spring JPA


Information about author, date and version
Author: Francisco Gomes
Date: 13/05/2024
Version: 1.0

**Tools and languages used in project**
- IDE: ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
  - Version: 2023.3.4 (Community Edition)
- Language Programmin: ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
  - Version Language: 17
- Framework: ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
  - Version: 3.3.0

### Architecture project:
> ![image](https://github.com/ArretadoLabs/simple_crud_spring_boot_v1.0/assets/165390931/4a954095-3e47-4878-b41b-57485f0c6822)

```
|- main/java/com.example.CRUDApplication          # Route with folders of model, controller and repo
|- CrudApplication                                # File main is execute/running
|- controller/BookController                      # Folder with class code of controller book 
|- model/Book                                     # Folder with class code of model book
|- repo/BookRepo                                  # Folder with interface code link of BookRepo
```

