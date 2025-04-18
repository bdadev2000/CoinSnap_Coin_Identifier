package com.cooldev.gba.emulator.gameboy.features.app;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AppLifecycleObserver implements DefaultLifecycleObserver {

    @NotNull
    private final a block;
    private int numStarted;

    @NotNull
    private final a onResume;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Nullable
    private static final String LOG_TAG = g0.a(AppLifecycleObserver.class).c();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public AppLifecycleObserver(@NotNull a aVar, @NotNull a aVar2) {
        p0.a.s(aVar, "onResume");
        p0.a.s(aVar2, "block");
        this.onResume = aVar;
        this.block = aVar2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
        e.v(LifecycleKt.a(lifecycleOwner.getLifecycle()), null, 0, new AppLifecycleObserver$onStart$1(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
        int i2 = this.numStarted - 1;
        this.numStarted = i2;
        if (i2 == 0) {
            Log.d(LOG_TAG, "App went to background");
        }
    }
}
