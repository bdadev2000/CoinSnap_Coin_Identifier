package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0402c {
    public static boolean a(@NonNull Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static boolean b(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
