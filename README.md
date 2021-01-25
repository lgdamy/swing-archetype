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

`EDIT:` Agora o archetype ja tem embutido o javac2 em um plugin do ant dentro do maven, o lado negativo é que o código fica com 1.7M de código proprietário da Jetbrains, como o projeto não está monetizado, não há necessidade de preocupação. Porém haverá a necessidade de comprar/produzir uma ferramenta com funcionalidade parecida com o javac2 futuramente. Se alguém já fez isso e gostaria de dividir comigo, eu seria infinitamente grato :wink:
