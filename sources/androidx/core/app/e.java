package androidx.core.app;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class e {
    public static boolean a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
