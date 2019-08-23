package de.cemcagras.rnmultivoice;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import de.cemcagras.rnmultivoice.RNMultivoiceThread;

public class RNMultivoiceModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNMultivoiceModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
        public String getName() {
        return "RNMultivoice";
    }

    @ReactMethod
    public void show(String message, int duration) {
        int n = 8; // Number of threads
        for (int i=0; i<8; i++)
        {
            RNMultivoiceThread thread = new RNMultivoiceThread(this.reactContext, i);
            thread.start();
        }
    }
}