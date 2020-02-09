# Hello Toast

## Funcionamento do Android Studio

<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/img/1e1372ceb5ca59bb.png">

Em `res/layout/` encontramos todos os layouts das nossas páginas android.<br>
Em `res/drawable/` encontramos todos os contéudos relacionados com imagens.<br>
Em `res/values/` encontramos todos os valores que extraímos e usamos nos nossos layouts.<br>


## Ferramenta de autoconnect
Permite que sejam criadas constraints de forma automática.

## Atributos

O painel de atributos permite criar os vários atributos bem como gerir constraints.
<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/img/21fa69f6d1d39dbc.png">

A imagem acima explicita o funcionamento dos controlos de contraints. O números que se encontram dos lados indicam o tamanho das margens.
* `layout_height`- É o atributo que aparece na parte de cima e na parte debaixo do quadrado.
* `layout_width` - É o atributo que aparece nos lados do quadrado.

Estes valores num `Constraint Layout` pode assumir 1 de 3 valores:
* `match_constraint`expande o elemento para preencher a view de acordo com a altura do e largura do parente.
* `wrap_content`  a configuração reduz as dimensões do elemento de modo a que seja grande o suficiente para incluir o conteúdo. Se não tiver conteúdo ficará invisível.
* Atribuir um valor fixo para que se ajuste ao tamanho do ecrã do dispositivo usando dp (density-independent pixels).
