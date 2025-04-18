package com.cooldev.gba.emulator.gameboy.local.storage;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class GamePlayCounter {
    public static final int $stable = 0;

    @NotNull
    public static final GamePlayCounter INSTANCE = new GamePlayCounter();

    private GamePlayCounter() {
    }

    public final int getFreePlayCounter(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getInt(GamePlayCounterKey.FREE_PLAY_COUNTER.getKey(), 0);
        } catch (Throwable th) {
            q.d(th);
            Integer num = 0;
            return num.intValue();
        }
    }

    public final int getGamePlayCounter(@NotNull Context context) {
        a.s(context, "context");
        try {
            return context.getSharedPreferences(context.getPackageName(), 0).getInt(GamePlayCounterKey.GAME_PLAY_COUNTER.getKey(), 0);
        } catch (Throwable th) {
            q.d(th);
            Integer num = 0;
            return num.intValue();
        }
    }

    public final void setFreePlayCounter(@NotNull Context context, int i2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putInt(GamePlayCounterKey.FREE_PLAY_COUNTER.getKey(), i2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void setGamePlayCounter(@NotNull Context context, int i2) {
        a.s(context, "context");
        try {
            context.getSharedPreferences(context.getPackageName(), 0).edit().putInt(GamePlayCounterKey.GAME_PLAY_COUNTER.getKey(), i2).apply();
        } catch (Throwable th) {
            q.d(th);
        }
    }
}
