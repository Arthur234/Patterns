package com.yatsun.arthur;

import com.yatsun.arthur.context.TransformerContext;
import com.yatsun.arthur.state.FireState;
import com.yatsun.arthur.state.MoveState;
import com.yatsun.arthur.state.TransformerState;

public class Main {

    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();

    }
}
