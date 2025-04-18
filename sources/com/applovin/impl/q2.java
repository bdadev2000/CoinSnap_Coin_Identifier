package com.applovin.impl;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
final class q2 {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f7070b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7071c;

    private long a(long j3) {
        return Math.max(0L, ((this.f7070b - 529) * 1000000) / j3) + this.a;
    }

    public long a(d9 d9Var) {
        return a(d9Var.A);
    }

    public void a() {
        this.a = 0L;
        this.f7070b = 0L;
        this.f7071c = false;
    }

    public long a(d9 d9Var, n5 n5Var) {
        if (this.f7070b == 0) {
            this.a = n5Var.f6353f;
        }
        if (this.f7071c) {
            return n5Var.f6353f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a1.a(n5Var.f6351c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & UByte.MAX_VALUE);
        }
        int d10 = of.d(i10);
        if (d10 == -1) {
            this.f7071c = true;
            this.f7070b = 0L;
            this.a = n5Var.f6353f;
            kc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return n5Var.f6353f;
        }
        long a = a(d9Var.A);
        this.f7070b += d10;
        return a;
    }
}
