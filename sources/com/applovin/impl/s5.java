package com.applovin.impl;

/* loaded from: classes.dex */
public class s5 implements r4 {
    private final long b = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: a, reason: collision with root package name */
    private final long f10571a = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10572c = false;

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
        if (!this.f10572c) {
            nhVar.B();
            return true;
        }
        if (b() && nhVar.y()) {
            a(nhVar, -this.f10571a);
            return true;
        }
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean d(nh nhVar) {
        if (!this.f10572c) {
            nhVar.w();
            return true;
        }
        if (a() && nhVar.y()) {
            a(nhVar, this.b);
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
    public boolean a(nh nhVar, int i9, long j7) {
        nhVar.a(i9, j7);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b(nh nhVar, boolean z8) {
        nhVar.a(z8);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, int i9) {
        nhVar.a(i9);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean b() {
        return !this.f10572c || this.f10571a > 0;
    }

    @Override // com.applovin.impl.r4
    public boolean a(nh nhVar, boolean z8) {
        nhVar.b(z8);
        return true;
    }

    @Override // com.applovin.impl.r4
    public boolean a() {
        return !this.f10572c || this.b > 0;
    }

    private static void a(nh nhVar, long j7) {
        long currentPosition = nhVar.getCurrentPosition() + j7;
        long duration = nhVar.getDuration();
        if (duration != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        nhVar.a(Math.max(currentPosition, 0L));
    }
}
