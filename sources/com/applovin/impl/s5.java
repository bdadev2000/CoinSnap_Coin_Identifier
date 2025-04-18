package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public class s5 implements r4 {

    /* renamed from: b, reason: collision with root package name */
    private final long f7447b = C.TIME_UNSET;
    private final long a = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7448c = false;

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar) {
        nhVar.u();
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b(nh nhVar) {
        nhVar.b();
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean c(nh nhVar) {
        if (!this.f7448c) {
            nhVar.B();
            return true;
        }
        if (b() && nhVar.y()) {
            a(nhVar, -this.a);
            return true;
        }
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean d(nh nhVar) {
        if (!this.f7448c) {
            nhVar.w();
            return true;
        }
        if (a() && nhVar.y()) {
            a(nhVar, this.f7447b);
            return true;
        }
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean e(nh nhVar) {
        nhVar.D();
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, int i10, long j3) {
        nhVar.a(i10, j3);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b(nh nhVar, boolean z10) {
        nhVar.a(z10);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, int i10) {
        nhVar.a(i10);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b() {
        return !this.f7448c || this.a > 0;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, boolean z10) {
        nhVar.b(z10);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a() {
        return !this.f7448c || this.f7447b > 0;
    }

    private static void a(nh nhVar, long j3) {
        long currentPosition = nhVar.getCurrentPosition() + j3;
        long duration = nhVar.getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        nhVar.a(Math.max(currentPosition, 0L));
    }
}
