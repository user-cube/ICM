# Basic Activity

## Remover botão flutuante
Apagar o código que se encontra na Main Activity.
```java
FloatingActionButton fab = (FloatingActionButton)
                                            findViewById(R.id.fab);
fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action",
                                      Snackbar.LENGTH_LONG)
                          .setAction("Action", null).show();
    }
});
```
E remover do XML
```xml
<android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        android:layout_margin="@dimen/fab_margin"
        app:srcCompat="@android:drawable/ic_dialog_email" />
```