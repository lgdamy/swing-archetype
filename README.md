# Archetype Swing
### Colocarei aqui um esqueleto que será meu ponto de partida com os próximos projetos em swing

- Para utilizar
  - Deve-se primeiro gravar o archetype no m2 local
  - `mvn install`
  - Depois deve-se is à pasta em que o projeto vai estar localizado (A pasta deve estar vazia)
  - `mvn archetype:generate -DarchetypeGroupId=com.damytec -DarchetypeArtifactId=swing-archetype`
  - A main do projeto, como descrita no manifest, está em com.damytec.nomedoprojeto.App.java
  
Como eu utilizei o UI Designer do Intellij para montar o esqueleto, talvez não seja possível executar ele manualmente em outra IDE.
Depois eu vou buscar um plugin do maven que transforma o form do Intellij em código em compile-time, tenho certeza que isso existe
