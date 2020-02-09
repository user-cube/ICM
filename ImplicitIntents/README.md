# Implicit Intents

```java
 public void openWebsite(View view) {
        String url = mWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url); //encode and parse to URI Object
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
    }
```
O construtor `Intent` aqui usado é diferente do construtor usado utilizado anteriormente para criar explicitamente uma nova Intent.<br>
Neste construtor especificamos uma ação e os dados para essa ação. As ações são definidas por uma class Intent e podem ser incluídas em ACTION_VIEW (para ver certos dados), ACTION_EDIT (para editar os valores dos dados) ou ACTION_DIAL (para ligar um certo número de telemóvel).

## Geo Search Query
```java
Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
```

## ShareCompat.IntentBuilder
| Método | Descrição                   |
---------|-----------------------------|
| from() | Activity que lança a Intent |
| setType() | MIME Type do item que vai ser partilhado |
| setChooserTitle() | Título que aparece no seletor da APP |
| setText() | Texto que vai ser partilhado |
| startChooser() | Mostra o seletor da app e envia a Intent |


