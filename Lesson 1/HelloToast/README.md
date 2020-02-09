# Funcionamento do Android Studio

<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/img/1e1372ceb5ca59bb.png">

Em `res/layout/` encontramos todos os layouts das nossas páginas android.<br>
Em `res/drawable/` encontramos todos os contéudos relacionados com imagens.<br>
Em `res/values/` encontramos todos os valores que extraímos e usamos nos nossos layouts.<br>


# Ferramenta de autoconnect
Permite que sejam criadas constraints de forma automática.

# Atributos

O painel de atributos permite criar os vários atributos bem como gerir constraints.
<img src="https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/img/21fa69f6d1d39dbc.png">

A imagem acima explicita o funcionamento dos controlos de contraints. O números que se encontram dos lados indicam o tamanho das margens.
* `layout_height`- É o atributo que aparece na parte de cima e na parte debaixo do quadrado.
* `layout_width` - É o atributo que aparece nos lados do quadrado.

Estes valores num `Constraint Layout` pode assumir 1 de 3 valores:
* `match_constraint`expande o elemento para preencher a view de acordo com a altura do e largura do parente.
* `wrap_content`  a configuração reduz as dimensões do elemento de modo a que seja grande o suficiente para incluir o conteúdo. Se não tiver conteúdo ficará invisível.
* Atribuir um valor fixo para que se ajuste ao tamanho do ecrã do dispositivo usando dp (density-independent pixels).

## Color primary

É a cor primária do tema, uma das pré-definidas das cores base do tema que podemos encontrar no `colors.xml`. É usada na barra da APP e obtida usando cores de outros elementes da UI para criar uma UI uniforme.

# Benefícios do Constraint Layout

É a habilidade de alinhar de outra forma os elementos com constraint são relativos a outros elementos.

# Extrair Strings

Em vez de usar elementos hardcoded é de melhor prática usar recursos string que representam as strings do nosso sistema. Ter as strings num ficheiro separado torna-as mais fáceis de gerir especialmente quando são usadas mais do que uma vez.<br>
Além do que foi anteriormente dito, recursos string são obrigatórios para traduzir e localizar a aplicação porque são necessários para criar um ficheiro fonte para cada linguaguem.

# Atributo onClick e handles de cada botão

Um click handles é um método que é invocado quando o utilizador clica ou faz taç num elemento UI clicável. Em Android Studio podemos especificar o nome do método no campo `onClick` na tab de Design, no painel de Atributos. Pode também ser adicionado via XML adicionando a propriedade `android:onClick`.

# Toast 

* Fornece uma forma simples de mostrar uma pequena mensagem numa janela pop-up. 
* Apenas preenche a quantidade de espaço necessário para a mensagem.
* A `Activity` atual permanece visível e interativa.
* Um Toast pode ser útil para testar a interatividade nas nossas APPs.

## Duração
* `Toast.LENGTH_LONG` - 3.5 segundos
* `Toast.LENGTH_SHORT` - 2 segundos

# Sumário 

View, ViewGroup, and layouts:

* All UI elements are subclasses of the View class and therefore inherit many properties of the View superclass.
* View elements can be grouped inside a ViewGroup, which acts as a container. The relationship is parent-child, in which the parent is a ViewGroup, and the child is a View or another ViewGroup.
* The onCreate() method is used to inflate the layout, which means to set the content view of the screen to the XML layout. You can also use it to get references to other UI elements in the layout.
* A View, like a string, is a resource that can have an id. The findViewById call takes the ID of a view as its parameter and returns the View.

Using the layout editor:

* Click the Design tab to manipulate elements and the layout, and the Text tab to edit the XML code for the layout.
* In the Design tab, the Palettes pane shows UI elements that you can use in your app's layout, and the Component tree pane shows the view hierarchy of UI elements.
* The design and blueprint panes of the layout editor show the UI elements in the layout.
* The Attributes tab displays the Attributes pane for setting properties for a UI element.
* Constraint handle: Click a constraint handle, shown as a circle on each side of an element, and then drag to another constraint handle or to parent boundary to create a constraint. The constraint is represented by the zigzag line.
* Resizing handle: You can drag the square resizing handles to resize the element. While dragging, the handle changes to an angled corner.
* When enabled, the Autoconnect tool automatically creates two or more constraints for a UI element to the parent layout. After you drag the element to the layout, it creates constraints based on the element's position.
* You can remove constraints from an element by selecting the element and hovering your pointer over it to show the Clear Constraints click the specific handle that sets the constraint. [IMAGEINFO]: remove_constraints_button.png button. Click this button to remove all constraints on the selected element. To clear a single constraint, click the specific handle that sets the constraint.
* The Attributes pane offers access to all of the XML attributes you can assign to a UI element. It also includes a square sizing panel called the view inspector at the top. The symbols inside the square represent the height and width settings.

Setting layout width and height:
The layout_width and layout_height attributes change as you change the height and width size controls in the view inspector. These attributes can take one of three values for a ConstraintLayout:

* The match_constraint setting expands the view to fill its parent by width or height—up to a margin, if one is set.
* The wrap_content setting shrinks the view dimensions so the view is just big enough to enclose its content. If there is no content, the view becomes invisible.
* Use a fixed number of dp (density-independent pixels) to specify a fixed size, adjusted for the screen size of the device.

Extracting string resources:
Instead of hard-coding strings, it is a best practice to use string resources, which represent the strings. Follow these steps:

1. Click once on the hardcoded string to extract, press Alt-Enter (Option-Enter on the Mac), and choose Extract string resources from the popup menu.
Set the Resource name.
2. Click OK. This creates a string resource in the values/res/string.xml file, and 3. the string in your code is replaced with a reference to the resource: @string/button_label_toast

Handling clicks:
* A click handler is a method that is invoked when the user clicks or taps on a UI element.
* Specify a click handler for a UI element such as a Button by entering its name in the onClick field in the Design tab's Attributes pane, or in the XML editor by adding the android:onClick property to a UI element such as a Button.
* Create the click handler in the main Activity using the View parameter. Example: public void showToast(View view) {/...}.
* You can find information on all Button properties in the Button class documentation, and all the TextView properties in the TextView class documentation.

Displaying Toast messages:

A Toast provides a way to show a simple message in a small popup window. It fills only the amount of space required for the message. To create an instance of a Toast, follow these steps:

1. Call the makeText() factory method on the Toast class.
2. Supply the context of the app Activity and the message to display (such as a string resource).
3. Supply the duration of the display, for example Toast.LENGTH_SHORT for a short period. The duration can be either Toast.LENGTH_LONG or Toast.LENGTH_SHORT.
4. Show the Toast by calling show().