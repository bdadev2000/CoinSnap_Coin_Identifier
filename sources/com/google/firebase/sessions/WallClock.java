package com.google.firebase.sessions;

import a1.c;
import android.os.SystemClock;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class WallClock implements TimeProvider {

    @NotNull
    public static final WallClock INSTANCE = new WallClock();
    private static final long US_PER_MILLIS = 1000;

    private WallClock() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * US_PER_MILLIS;
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* renamed from: elapsedRealtime-UwyO8pc */
    public long mo605elapsedRealtimeUwyO8pc() {
        int i2 = a1.a.d;
        return e.F(SystemClock.elapsedRealtime(), c.f63c);
    }
}
