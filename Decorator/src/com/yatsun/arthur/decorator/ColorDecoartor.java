package com.yatsun.arthur.decorator;

import com.yatsun.arthur.objects.Component;

/**
 * Created by arthur on 29.06.18.
 */
public class ColorDecoartor extends Decorator {

    public ColorDecoartor(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("///add colors");
    }
}
