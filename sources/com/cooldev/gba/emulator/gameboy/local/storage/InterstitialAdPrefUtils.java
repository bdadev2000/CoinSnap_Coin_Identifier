package com.cooldev.gba.emulator.gameboy.local.storage;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class InterstitialAdPrefUtils {
    public static final int $stable = 0;

    @NotNull
    public static final InterstitialAdPrefUtils INSTANCE = new InterstitialAdPrefUtils();

    private InterstitialAdPrefUtils() {
    }

    public final int getClickCount(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getInt(AdsPrefKey.CLICK_COUNT.getKey(), 1);
        } catch (Throwable th) {
            q.d(th);
            Integer num = 1;
            return num.intValue();
        }
    }

    public final int getCountShowInterstitialAds(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getInt(AdsPrefKey.COUNT_SHOW_ADS.getKey(), 0);
        } catch (Throwable th) {
            q.d(th);
            Integer num = 0;
            return num.intValue();
        }
    }

    public final long getLastAdTimeShowAds(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getLong(AdsPrefKey.LAST_AD_TIME.getKey(), 0L);
        } catch (Throwable th) {
            q.d(th);
            Long l2 = 0L;
            return l2.longValue();
        }
    }

    public final void setClickCount(@NotNull Context context, int i2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putInt(AdsPrefKey.CLICK_COUNT.getKey(), i2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setCountShowInterstitialAds(@NotNull Context context, int i2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putInt(AdsPrefKey.COUNT_SHOW_ADS.getKey(), i2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setLastTimeShowAds(@NotNull Context context, long j2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putLong(AdsPrefKey.LAST_AD_TIME.getKey(), j2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }
}
