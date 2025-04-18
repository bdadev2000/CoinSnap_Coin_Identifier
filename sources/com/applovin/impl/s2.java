package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class s2 {

    /* renamed from: a, reason: collision with root package name */
    private long f26405a;

    /* renamed from: b, reason: collision with root package name */
    private long f26406b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26407c;

    public void a() {
        this.f26405a = 0L;
        this.f26406b = 0L;
        this.f26407c = false;
    }

    private long a(long j2) {
        return Math.max(0L, ((this.f26406b - 529) * 1000000) / j2) + this.f26405a;
    }

    public long a(f9 f9Var) {
        return a(f9Var.A);
    }

    public long a(f9 f9Var, p5 p5Var) {
        if (this.f26406b == 0) {
            this.f26405a = p5Var.f25964f;
        }
        if (this.f26407c) {
            return p5Var.f25964f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b1.a(p5Var.f25963c);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & UnsignedBytes.MAX_VALUE);
        }
        int d = tf.d(i2);
        if (d == -1) {
            this.f26407c = true;
            this.f26406b = 0L;
            this.f26405a = p5Var.f25964f;
            pc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return p5Var.f25964f;
        }
        long a2 = a(f9Var.A);
        this.f26406b += d;
        return a2;
    }
}
