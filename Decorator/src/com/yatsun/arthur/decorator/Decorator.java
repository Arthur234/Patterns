package com.yatsun.arthur.decorator;

import com.yatsun.arthur.objects.Component;

/**
 * Created by arthur on 29.06.18.
 */
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public abstract void afterDraw();


    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
