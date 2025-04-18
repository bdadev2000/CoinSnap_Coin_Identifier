package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {
    private Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3158b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3159c;

    public a(Handler handler, long j3, long j10) {
        this.a = handler;
        this.f3158b = j3;
        this.f3159c = j10;
    }

    public void a() {
        if (b() > 0) {
            this.a.postDelayed(this, b());
        } else {
            this.a.post(this);
        }
    }

    public long b() {
        return this.f3158b;
    }

    public long c() {
        return this.f3159c;
    }

    public void a(long j3) {
        if (j3 > 0) {
            this.a.postDelayed(this, j3);
        } else {
            this.a.post(this);
        }
    }
}
