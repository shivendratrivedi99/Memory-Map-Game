package com.singularity.memorymap;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.TextView;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    private int mainMoves=0;
    /** Show a toast from the web page */
    @JavascriptInterface
    public void display(String toast) {

        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();

    }
}