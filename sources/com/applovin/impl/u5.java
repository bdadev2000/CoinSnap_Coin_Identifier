package com.applovin.impl;

/* loaded from: classes2.dex */
public class u5 implements t4 {

    /* renamed from: b, reason: collision with root package name */
    private final long f27277b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    private final long f27276a = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27278c = false;

    @Override // com.applovin.impl.t4
    public boolean a() {
        return !this.f27278c || this.f27277b > 0;
    }

    @Override // com.applovin.impl.t4
    public boolean b() {
        return !this.f27278c || this.f27276a > 0;
    }

    @Override // com.applovin.impl.t4
    public boolean c(qh qhVar) {
        if (!this.f27278c) {
            qhVar.B();
            return true;
        }
        if (!b() || !qhVar.y()) {
            return true;
        }
        a(qhVar, -this.f27276a);
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean d(qh qhVar) {
        if (!this.f27278c) {
            qhVar.w();
            return true;
        }
        if (!a() || !qhVar.y()) {
            return true;
        }
        a(qhVar, this.f27277b);
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean e(qh qhVar) {
        qhVar.D();
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean a(qh qhVar) {
        qhVar.u();
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean b(qh qhVar) {
        qhVar.b();
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean a(qh qhVar, int i2, long j2) {
        qhVar.a(i2, j2);
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean b(qh qhVar, boolean z2) {
        qhVar.a(z2);
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean a(qh qhVar, int i2) {
        qhVar.a(i2);
        return true;
    }

    @Override // com.applovin.impl.t4
    public boolean a(qh qhVar, boolean z2) {
        qhVar.b(z2);
        return true;
    }

    private static void a(qh qhVar, long j2) {
        long currentPosition = qhVar.getCurrentPosition() + j2;
        long duration = qhVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        qhVar.a(Math.max(currentPosition, 0L));
    }
}
