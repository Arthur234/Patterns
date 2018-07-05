package com.yatsun.arthur;

import com.yatsun.arthur.decorator.BorderDecorator;
import com.yatsun.arthur.decorator.ColorDecoartor;
import com.yatsun.arthur.objects.Component;
import com.yatsun.arthur.objects.TextView;
import com.yatsun.arthur.objects.Window;

/*
* Другое название - Wrapper
* Расширение функционала объекта без дочерних классов(альтернатива наследованию)
* Более гибкий способ добавить новые функции к любому существующему объекту
* Возможность включения и исключения нового повеления для любого объекта в любое время(в отличии от статического способа с помощью наследования)
* Когда нельзя создать дочерний класс, но нужно добавить новое поведение, которое может быть не связанно по смысла(в наследовании желательно поддерживать связь "яыляется")
* Декораторы могут вкладываться друг в друга
*/
public class Main {

    private static Component window;
    private static Component textView;

    public static void main(String[] args) {

        boolean showBorder = true;

        Component window = new Window();
        window.draw();

        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        Component wrappedDecorator = new ColorDecoartor(new BorderDecorator(new Window()));
        wrappedDecorator.draw();

        // условие, если мы не знаем каким образом объект будет отрисовываться

        if(!showBorder){
            window = new Window();
            textView = new TextView();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        }

        window.draw();
        textView.draw();

    }
}
