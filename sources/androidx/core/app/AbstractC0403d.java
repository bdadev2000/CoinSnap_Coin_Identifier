package androidx.core.app;

import android.app.Activity;

/* renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0403d {
    public static boolean a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
