package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0410k {
    public static int a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i9, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i9, str2);
    }

    @NonNull
    public static String b(@NonNull Context context) {
        return context.getOpPackageName();
    }

    @Nullable
    public static AppOpsManager c(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
