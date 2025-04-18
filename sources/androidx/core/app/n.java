package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class n {
    public static int a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i10, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i10, str2);
    }

    @NonNull
    public static String b(@NonNull Context context) {
        String opPackageName;
        opPackageName = context.getOpPackageName();
        return opPackageName;
    }

    @Nullable
    public static AppOpsManager c(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
