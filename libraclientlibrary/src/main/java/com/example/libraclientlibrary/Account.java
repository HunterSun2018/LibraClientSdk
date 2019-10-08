package com.example.libraclientlibrary;

import android.content.Context;
import android.widget.Toast;

public class Account {
    public void msg(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
}
