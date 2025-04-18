package com.cooldev.gba.emulator.gameboy.local.storage;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AppOpenAdPrefUtils {
    public static final int $stable = 0;

    @NotNull
    public static final AppOpenAdPrefUtils INSTANCE = new AppOpenAdPrefUtils();

    private AppOpenAdPrefUtils() {
    }

    public final boolean getShowAppOpenAdOnResume(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getBoolean(AppAdSettingsKey.SHOW_APP_OPEN_AD_ON_RESUME.getKey(), false);
        } catch (Throwable th) {
            q.d(th);
            return false;
        }
    }

    public final void setShowAppOpenAdOnResume(@NotNull Context context, boolean z2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putBoolean(AppAdSettingsKey.SHOW_APP_OPEN_AD_ON_RESUME.getKey(), z2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }
}
