package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f5843a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5844c;

    public a(Handler handler, long j7, long j9) {
        this.f5843a = handler;
        this.b = j7;
        this.f5844c = j9;
    }

    public void a() {
        if (b() > 0) {
            this.f5843a.postDelayed(this, b());
        } else {
            this.f5843a.post(this);
        }
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.f5844c;
    }

    public void a(long j7) {
        if (j7 > 0) {
            this.f5843a.postDelayed(this, j7);
        } else {
            this.f5843a.post(this);
        }
    }
}
