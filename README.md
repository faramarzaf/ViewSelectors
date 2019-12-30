# ViewSelectors  

However, you can do more than that just a simple image, Android allow you to change the button’s image depends on different states like button is focused or button is pressed.  


`res/drawable/new_button.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/button_pressed_yellow"
          android:state_pressed="true" />
    <item android:drawable="@drawable/button_focused_orange"
          android:state_focused="true" />
    <item android:drawable="@drawable/button_normal_green" />
</selector>
```
For example in usage of your button:   
```xml

    <Button
        android:id="@+id/imageButtonSelector"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/new_button" />
```









