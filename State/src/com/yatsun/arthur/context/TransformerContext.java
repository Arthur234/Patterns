package com.yatsun.arthur.context;

import com.yatsun.arthur.state.TransformerState;

/**
 * Created by arthur on 03.07.18.
 */
public class TransformerContext implements TransformerState{
    private TransformerState state;

    public TransformerState getState() {
        return state;
    }

    public void setState(TransformerState state) {
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();
    }

}
