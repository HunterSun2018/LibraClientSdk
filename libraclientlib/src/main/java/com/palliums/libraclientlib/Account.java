package com.palliums.libraclientlib;

import android.content.Context;
import android.widget.Toast;

public class Account {

    static {
        System.loadLibrary("android");
    }

    public void msg(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }

    public native String sayHello(String greeting);
}