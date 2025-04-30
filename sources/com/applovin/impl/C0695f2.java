package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0695f2 extends n5 {

    /* renamed from: j, reason: collision with root package name */
    private long f7530j;

    /* renamed from: k, reason: collision with root package name */
    private int f7531k;
    private int l;

    public C0695f2() {
        super(2);
        this.l = 32;
    }

    private boolean b(n5 n5Var) {
        ByteBuffer byteBuffer;
        if (!m()) {
            return true;
        }
        if (this.f7531k >= this.l || n5Var.d() != d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = n5Var.f9273c;
        if (byteBuffer2 != null && (byteBuffer = this.f9273c) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                return false;
            }
        }
        return true;
    }

    public boolean a(n5 n5Var) {
        AbstractC0669a1.a(!n5Var.h());
        AbstractC0669a1.a(!n5Var.c());
        AbstractC0669a1.a(!n5Var.e());
        if (!b(n5Var)) {
            return false;
        }
        int i9 = this.f7531k;
        this.f7531k = i9 + 1;
        if (i9 == 0) {
            this.f9275f = n5Var.f9275f;
            if (n5Var.f()) {
                e(1);
            }
        }
        if (n5Var.d()) {
            e(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = n5Var.f9273c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.f9273c.put(byteBuffer);
        }
        this.f7530j = n5Var.f9275f;
        return true;
    }

    public void i(int i9) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        this.l = i9;
    }

    public long j() {
        return this.f9275f;
    }

    public long k() {
        return this.f7530j;
    }

    public int l() {
        return this.f7531k;
    }

    public boolean m() {
        if (this.f7531k > 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.n5, com.applovin.impl.AbstractC0713j2
    public void b() {
        super.b();
        this.f7531k = 0;
    }
}
