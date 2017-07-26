package com.github.ivanzotov.RNPhoneCall;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RNPhoneCallModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNPhoneCallModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNPhoneCall";
    }

    @ReactMethod
    public void phoneCall(String number) {
        String url = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(url));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.reactContext.startActivity(intent);
    }
}
