package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes.dex */
public class dT {

    @SuppressLint({"StaticFieldLeak"})
    private static Context zp;

    private static Configuration lMd(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void zp(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            zp = context.createConfigurationContext(lMd(context, str, str2));
        } catch (Throwable th) {
            tG.lMd(th.getMessage());
        }
        cz.zp(zp);
    }
}
