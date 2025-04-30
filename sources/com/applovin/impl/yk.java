package com.applovin.impl;

/* loaded from: classes.dex */
public final class yk implements bd {

    /* renamed from: a, reason: collision with root package name */
    private final j3 f12433a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private long f12434c;

    /* renamed from: d, reason: collision with root package name */
    private long f12435d;

    /* renamed from: f, reason: collision with root package name */
    private mh f12436f = mh.f9206d;

    public yk(j3 j3Var) {
        this.f12433a = j3Var;
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        return this.f12436f;
    }

    public void b() {
        if (!this.b) {
            this.f12435d = this.f12433a.c();
            this.b = true;
        }
    }

    public void c() {
        if (this.b) {
            a(p());
            this.b = false;
        }
    }

    @Override // com.applovin.impl.bd
    public long p() {
        long a6;
        long j7 = this.f12434c;
        if (this.b) {
            long c9 = this.f12433a.c() - this.f12435d;
            mh mhVar = this.f12436f;
            if (mhVar.f9208a == 1.0f) {
                a6 = AbstractC0744r2.a(c9);
            } else {
                a6 = mhVar.a(c9);
            }
            return j7 + a6;
        }
        return j7;
    }

    public void a(long j7) {
        this.f12434c = j7;
        if (this.b) {
            this.f12435d = this.f12433a.c();
        }
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        if (this.b) {
            a(p());
        }
        this.f12436f = mhVar;
    }
}
