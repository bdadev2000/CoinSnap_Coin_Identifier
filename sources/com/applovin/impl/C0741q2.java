package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0741q2 {

    /* renamed from: a, reason: collision with root package name */
    private long f10128a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10129c;

    private long a(long j7) {
        return Math.max(0L, ((this.b - 529) * 1000000) / j7) + this.f10128a;
    }

    public long a(d9 d9Var) {
        return a(d9Var.f7195A);
    }

    public void a() {
        this.f10128a = 0L;
        this.b = 0L;
        this.f10129c = false;
    }

    public long a(d9 d9Var, n5 n5Var) {
        if (this.b == 0) {
            this.f10128a = n5Var.f9275f;
        }
        if (this.f10129c) {
            return n5Var.f9275f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0669a1.a(n5Var.f9273c);
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i9 = (i9 << 8) | (byteBuffer.get(i10) & 255);
        }
        int d2 = of.d(i9);
        if (d2 == -1) {
            this.f10129c = true;
            this.b = 0L;
            this.f10128a = n5Var.f9275f;
            kc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return n5Var.f9275f;
        }
        long a6 = a(d9Var.f7195A);
        this.b += d2;
        return a6;
    }
}
