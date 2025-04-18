package com.cooldev.gba.emulator.gameboy.features.network;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ConnectivityObserverSingleton {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static ConnectivityObserver connectivityObserver;

    @NotNull
    public static final ConnectivityObserverSingleton INSTANCE = new ConnectivityObserverSingleton();
    public static final int $stable = 8;

    private ConnectivityObserverSingleton() {
    }

    @NotNull
    public final ConnectivityObserver getInstance(@NotNull Context context) {
        a.s(context, "context");
        if (connectivityObserver == null) {
            connectivityObserver = new ConnectivityObserver(context);
        }
        ConnectivityObserver connectivityObserver2 = connectivityObserver;
        a.p(connectivityObserver2);
        return connectivityObserver2;
    }
}
