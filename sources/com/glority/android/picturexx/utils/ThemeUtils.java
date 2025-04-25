package com.glority.android.picturexx.utils;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ThemeUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/utils/ThemeUtils;", "", "<init>", "()V", "changeTheme", "", "themeType", "", "context", "Landroid/content/Context;", "setApplicationTheme", "isDarkModeSuitable", "", "isSuitableBrand", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ThemeUtils {
    public static final int $stable = 0;
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    private ThemeUtils() {
    }

    public final void changeTheme(int themeType, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (themeType == -100) {
            themeType = 1;
        }
        setApplicationTheme(themeType, context);
        AppCompatDelegate.setDefaultNightMode(themeType);
    }

    public final void setApplicationTheme(int themeType, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
        if (Build.VERSION.SDK_INT >= 31) {
            if (themeType == 1) {
                uiModeManager.setApplicationNightMode(1);
            } else if (themeType == 2) {
                uiModeManager.setApplicationNightMode(2);
            } else {
                uiModeManager.setApplicationNightMode(0);
            }
        }
    }

    public final boolean isDarkModeSuitable() {
        return Build.VERSION.SDK_INT >= 29 && isSuitableBrand();
    }

    public final boolean isSuitableBrand() {
        return (StringsKt.equals(Build.BRAND, "Xiaomi", true) || StringsKt.equals(Build.BRAND, "Redmi", true)) ? false : true;
    }
}
