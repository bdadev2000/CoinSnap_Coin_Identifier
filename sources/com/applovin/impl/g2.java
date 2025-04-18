package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class g2 extends p5 {

    /* renamed from: j, reason: collision with root package name */
    private long f24048j;

    /* renamed from: k, reason: collision with root package name */
    private int f24049k;

    /* renamed from: l, reason: collision with root package name */
    private int f24050l;

    public g2() {
        super(2);
        this.f24050l = 32;
    }

    private boolean b(p5 p5Var) {
        ByteBuffer byteBuffer;
        if (!m()) {
            return true;
        }
        if (this.f24049k >= this.f24050l || p5Var.d() != d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = p5Var.f25963c;
        if (byteBuffer2 != null && (byteBuffer = this.f25963c) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                return false;
            }
        }
        return true;
    }

    public boolean a(p5 p5Var) {
        b1.a(!p5Var.h());
        b1.a(!p5Var.c());
        b1.a(!p5Var.e());
        if (!b(p5Var)) {
            return false;
        }
        int i2 = this.f24049k;
        this.f24049k = i2 + 1;
        if (i2 == 0) {
            this.f25964f = p5Var.f25964f;
            if (p5Var.f()) {
                e(1);
            }
        }
        if (p5Var.d()) {
            e(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = p5Var.f25963c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.f25963c.put(byteBuffer);
        }
        this.f24048j = p5Var.f25964f;
        return true;
    }

    public void i(int i2) {
        b1.a(i2 > 0);
        this.f24050l = i2;
    }

    public long j() {
        return this.f25964f;
    }

    public long k() {
        return this.f24048j;
    }

    public int l() {
        return this.f24049k;
    }

    public boolean m() {
        return this.f24049k > 0;
    }

    @Override // com.applovin.impl.p5, com.applovin.impl.l2
    public void b() {
        super.b();
        this.f24049k = 0;
    }
}
