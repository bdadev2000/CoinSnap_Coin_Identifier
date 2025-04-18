package org.koin.core.time;

import a1.a;
import a1.b;
import a1.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.koin.mp.KoinPlatformTimeTools;
import w0.h;

/* loaded from: classes3.dex */
public final class Timer {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final double NANO_TO_MILLI = 1000000.0d;
    private long end;
    private final long start = e.F(KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds(), c.f62b);
    private long time;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final Timer start() {
            return new Timer();
        }
    }

    public Timer() {
        int i2 = a.d;
        this.end = 0L;
        this.time = 0L;
    }

    /* renamed from: getEnd-UwyO8pc, reason: not valid java name */
    public final long m816getEndUwyO8pc() {
        return this.end;
    }

    /* renamed from: getStart-UwyO8pc, reason: not valid java name */
    public final long m817getStartUwyO8pc() {
        return this.start;
    }

    public final double getTimeInMillis() {
        return a.g(this.time, c.f63c);
    }

    public final double getTimeInNanos() {
        return a.g(this.time, c.f62b);
    }

    public final double getTimeInSeconds() {
        return a.g(this.time, c.d);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [w0.j, w0.h] */
    /* JADX WARN: Type inference failed for: r0v18, types: [w0.j, w0.h] */
    public final void stop() {
        long j2 = this.end;
        int i2 = a.d;
        if (j2 == 0) {
            long F = e.F(KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds(), c.f62b);
            this.end = F;
            long j3 = ((-(this.start >> 1)) << 1) + (((int) r4) & 1);
            int i3 = b.f61a;
            if (a.f(F)) {
                if (!(!a.f(j3)) && (F ^ j3) < 0) {
                    throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                }
            } else if (a.f(j3)) {
                F = j3;
            } else {
                int i4 = ((int) F) & 1;
                if (i4 == (((int) j3) & 1)) {
                    long j4 = (F >> 1) + (j3 >> 1);
                    if (i4 == 0) {
                        if (!new h(-4611686018426999999L, 4611686018426999999L).b(j4)) {
                            F = e.k(j4 / 1000000);
                        }
                        F = j4 << 1;
                    } else if (new h(-4611686018426L, 4611686018426L).b(j4)) {
                        j4 *= 1000000;
                        F = j4 << 1;
                    } else {
                        F = e.k(p0.a.B(j4, -4611686018427387903L, 4611686018427387903L));
                    }
                } else {
                    F = i4 == 1 ? a.a(F >> 1, j3 >> 1) : a.a(j3 >> 1, F >> 1);
                }
            }
            this.time = F;
        }
    }
}
