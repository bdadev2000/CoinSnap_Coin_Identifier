package com.cooldev.gba.emulator.gameboy.local.storage;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RewardAdCounter {
    public static final int $stable = 0;

    @NotNull
    public static final RewardAdCounter INSTANCE = new RewardAdCounter();

    private RewardAdCounter() {
    }

    public final int getRewardAdCounter(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getInt(RewardAdCounterKey.REWARD_ADS_COUNTER.getKey(), 0);
        } catch (Throwable th) {
            q.d(th);
            Integer num = 0;
            return num.intValue();
        }
    }

    public final void setRewardAdCounter(@NotNull Context context, int i2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putInt(RewardAdCounterKey.REWARD_ADS_COUNTER.getKey(), i2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }
}
