package de.cemcagras.rnmultivoice;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;

public class RNMultivoiceThread extends Thread {

    private ReactApplicationContext context;
    private int threadIndex;

    RNMultivoiceThread(ReactApplicationContext context, int threadIndex) {
        this.context = context;
        this.threadIndex = threadIndex;
    }

    @Override
    public void run() {
        try {
            Toast.makeText(this.context, "threadIndex: " + this.threadIndex, 1000).show();
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println ("Exception is caught.");
        }
    }
}