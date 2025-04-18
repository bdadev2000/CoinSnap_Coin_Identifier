package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class ap extends y1 {

    /* renamed from: i, reason: collision with root package name */
    private int f3780i;

    /* renamed from: j, reason: collision with root package name */
    private int f3781j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3782k;

    /* renamed from: l, reason: collision with root package name */
    private int f3783l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f3784m = yp.f9257f;

    /* renamed from: n, reason: collision with root package name */
    private int f3785n;

    /* renamed from: o, reason: collision with root package name */
    private long f3786o;

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f3783l);
        this.f3786o += min / this.f9104b.f6450d;
        this.f3783l -= min;
        byteBuffer.position(position + min);
        if (this.f3783l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f3785n + i11) - this.f3784m.length;
        ByteBuffer a = a(length);
        int a10 = yp.a(length, 0, this.f3785n);
        a.put(this.f3784m, 0, a10);
        int a11 = yp.a(length - a10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + a11);
        a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - a11;
        int i13 = this.f3785n - a10;
        this.f3785n = i13;
        byte[] bArr = this.f3784m;
        System.arraycopy(bArr, a10, bArr, 0, i13);
        byteBuffer.get(this.f3784m, this.f3785n, i12);
        this.f3785n += i12;
        a.flip();
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) {
        if (aVar.f6449c == 2) {
            this.f3782k = true;
            if (this.f3780i == 0 && this.f3781j == 0) {
                return o1.a.f6447e;
            }
            return aVar;
        }
        throw new o1.b(aVar);
    }

    @Override // com.applovin.impl.y1, com.applovin.impl.o1
    public boolean c() {
        return super.c() && this.f3785n == 0;
    }

    @Override // com.applovin.impl.y1, com.applovin.impl.o1
    public ByteBuffer d() {
        int i10;
        if (super.c() && (i10 = this.f3785n) > 0) {
            a(i10).put(this.f3784m, 0, this.f3785n).flip();
            this.f3785n = 0;
        }
        return super.d();
    }

    @Override // com.applovin.impl.y1
    public void g() {
        if (this.f3782k) {
            this.f3782k = false;
            int i10 = this.f3781j;
            int i11 = this.f9104b.f6450d;
            this.f3784m = new byte[i10 * i11];
            this.f3783l = this.f3780i * i11;
        }
        this.f3785n = 0;
    }

    @Override // com.applovin.impl.y1
    public void h() {
        if (this.f3782k) {
            if (this.f3785n > 0) {
                this.f3786o += r0 / this.f9104b.f6450d;
            }
            this.f3785n = 0;
        }
    }

    @Override // com.applovin.impl.y1
    public void i() {
        this.f3784m = yp.f9257f;
    }

    public long j() {
        return this.f3786o;
    }

    public void k() {
        this.f3786o = 0L;
    }

    public void a(int i10, int i11) {
        this.f3780i = i10;
        this.f3781j = i11;
    }
}
