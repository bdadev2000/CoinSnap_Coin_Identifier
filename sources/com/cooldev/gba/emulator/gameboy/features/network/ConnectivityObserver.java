package com.cooldev.gba.emulator.gameboy.features.network;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import e1.h;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ConnectivityObserver {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public ConnectivityObserver(@NotNull Context context) {
        a.s(context, "context");
        this.context = context;
    }

    @NotNull
    public final h observe() {
        return a.l(new ConnectivityObserver$observe$1(this, null));
    }
}
