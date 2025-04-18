package com.applovin.impl;

/* loaded from: classes.dex */
public final class yk implements bd {
    private final j3 a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9236b;

    /* renamed from: c, reason: collision with root package name */
    private long f9237c;

    /* renamed from: d, reason: collision with root package name */
    private long f9238d;

    /* renamed from: f, reason: collision with root package name */
    private mh f9239f = mh.f6271d;

    public yk(j3 j3Var) {
        this.a = j3Var;
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        return this.f9239f;
    }

    public void b() {
        if (!this.f9236b) {
            this.f9238d = this.a.c();
            this.f9236b = true;
        }
    }

    public void c() {
        if (this.f9236b) {
            a(p());
            this.f9236b = false;
        }
    }

    @Override // com.applovin.impl.bd
    public long p() {
        long a;
        long j3 = this.f9237c;
        if (this.f9236b) {
            long c10 = this.a.c() - this.f9238d;
            mh mhVar = this.f9239f;
            if (mhVar.a == 1.0f) {
                a = r2.a(c10);
            } else {
                a = mhVar.a(c10);
            }
            return j3 + a;
        }
        return j3;
    }

    public void a(long j3) {
        this.f9237c = j3;
        if (this.f9236b) {
            this.f9238d = this.a.c();
        }
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        if (this.f9236b) {
            a(p());
        }
        this.f9239f = mhVar;
    }
}
