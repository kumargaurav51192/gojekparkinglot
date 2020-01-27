package com.gojek.parkinglot.Engine;

import com.gojek.parkinglot.Constants.Constants;

public class RequestEngine implements AbstractEngine {

    @Override
    public void execute(String input){

        int level = 1;
        String[] inputs = input.split(" ");
        String key = inputs[0];
        switch (key) {
            case Constants.CREATE_PARKING_LOT:
                try {
                    int capacity = Integer.parseInt(inputs[1]);

                } catch (NumberFormatException e) {

                }
                break;
        }

    }
}
