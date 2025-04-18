package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class f2 extends n5 {

    /* renamed from: j, reason: collision with root package name */
    private long f4576j;

    /* renamed from: k, reason: collision with root package name */
    private int f4577k;

    /* renamed from: l, reason: collision with root package name */
    private int f4578l;

    public f2() {
        super(2);
        this.f4578l = 32;
    }

    private boolean b(n5 n5Var) {
        ByteBuffer byteBuffer;
        if (!m()) {
            return true;
        }
        if (this.f4577k >= this.f4578l || n5Var.d() != d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = n5Var.f6351c;
        if (byteBuffer2 != null && (byteBuffer = this.f6351c) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                return false;
            }
        }
        return true;
    }

    public boolean a(n5 n5Var) {
        a1.a(!n5Var.h());
        a1.a(!n5Var.c());
        a1.a(!n5Var.e());
        if (!b(n5Var)) {
            return false;
        }
        int i10 = this.f4577k;
        this.f4577k = i10 + 1;
        if (i10 == 0) {
            this.f6353f = n5Var.f6353f;
            if (n5Var.f()) {
                e(1);
            }
        }
        if (n5Var.d()) {
            e(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = n5Var.f6351c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.f6351c.put(byteBuffer);
        }
        this.f4576j = n5Var.f6353f;
        return true;
    }

    public void i(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        this.f4578l = i10;
    }

    public long j() {
        return this.f6353f;
    }

    public long k() {
        return this.f4576j;
    }

    public int l() {
        return this.f4577k;
    }

    public boolean m() {
        return this.f4577k > 0;
    }

    @Override // com.applovin.impl.n5, com.applovin.impl.j2
    public void b() {
        super.b();
        this.f4577k = 0;
    }
}
