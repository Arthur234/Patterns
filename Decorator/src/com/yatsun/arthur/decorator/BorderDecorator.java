package com.yatsun.arthur.decorator;

import com.yatsun.arthur.objects.Component;

/**
 * Created by arthur on 29.06.18.
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("//add borders");
    }
}
