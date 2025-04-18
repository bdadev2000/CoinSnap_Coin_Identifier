package com.safedk.android.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.Context;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public class DexBridge {
    private static final String TAG = "DexBridge";

    public static String generateString(String content) {
        return content;
    }

    public static Context getContext() {
        return SafeDK.getInstance().l();
    }

    public static void appClassOnCreateBefore(Application app) {
        Logger.d("SafeDKApplication", "onCreate");
        SafeDK.a(app.getApplicationContext());
        SafeDK.a(app);
    }

    public static void providerOnCreateBefore(ContentProvider provider) {
        Logger.d(TAG, "Content Provider: onCreate (not active)");
    }
}
