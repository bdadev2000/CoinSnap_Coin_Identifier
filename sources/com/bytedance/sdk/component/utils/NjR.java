package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes.dex */
public class NjR {

    @SuppressLint({"StaticFieldLeak"})
    private static Context YFl;

    private static Configuration Sg(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void YFl(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            YFl = context.createConfigurationContext(Sg(context, str, str2));
        } catch (Throwable th2) {
            YoT.Sg(th2.getMessage());
        }
        qO.YFl(YFl);
    }
}
