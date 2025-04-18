package gc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d0.h;

/* loaded from: classes3.dex */
public final class a {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18381b;

    public a(Context context, String str) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = h.createDeviceProtectedStorageContext(context);
        this.a = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        boolean z11 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z10 = z11;
        }
        this.f18381b = z10;
    }
}
