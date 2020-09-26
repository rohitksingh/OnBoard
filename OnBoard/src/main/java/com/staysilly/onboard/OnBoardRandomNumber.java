package com.staysilly.onboard;

import java.util.Random;

public class OnBoardRandomNumber {

    public int getOnBoardRandomNumber(){
        return new Random().nextInt(10000);
    }

}
