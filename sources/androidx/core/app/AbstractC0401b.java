package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: androidx.core.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0401b {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i9) {
        activity.requestPermissions(strArr, i9);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
