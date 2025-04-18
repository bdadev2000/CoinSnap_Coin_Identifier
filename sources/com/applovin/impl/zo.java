package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
final class zo extends z1 {

    /* renamed from: i, reason: collision with root package name */
    private int f28376i;

    /* renamed from: j, reason: collision with root package name */
    private int f28377j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28378k;

    /* renamed from: l, reason: collision with root package name */
    private int f28379l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f28380m = xp.f27965f;

    /* renamed from: n, reason: collision with root package name */
    private int f28381n;

    /* renamed from: o, reason: collision with root package name */
    private long f28382o;

    public void a(int i2, int i3) {
        this.f28376i = i2;
        this.f28377j = i3;
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        if (aVar.f25956c != 2) {
            throw new p1.b(aVar);
        }
        this.f28378k = true;
        return (this.f28376i == 0 && this.f28377j == 0) ? p1.a.e : aVar;
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.p1
    public boolean c() {
        return super.c() && this.f28381n == 0;
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.p1
    public ByteBuffer d() {
        int i2;
        if (super.c() && (i2 = this.f28381n) > 0) {
            a(i2).put(this.f28380m, 0, this.f28381n).flip();
            this.f28381n = 0;
        }
        return super.d();
    }

    @Override // com.applovin.impl.z1
    public void g() {
        if (this.f28378k) {
            this.f28378k = false;
            int i2 = this.f28377j;
            int i3 = this.f28253b.d;
            this.f28380m = new byte[i2 * i3];
            this.f28379l = this.f28376i * i3;
        }
        this.f28381n = 0;
    }

    @Override // com.applovin.impl.z1
    public void h() {
        if (this.f28378k) {
            if (this.f28381n > 0) {
                this.f28382o += r0 / this.f28253b.d;
            }
            this.f28381n = 0;
        }
    }

    @Override // com.applovin.impl.z1
    public void i() {
        this.f28380m = xp.f27965f;
    }

    public long j() {
        return this.f28382o;
    }

    public void k() {
        this.f28382o = 0L;
    }

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.f28379l);
        this.f28382o += min / this.f28253b.d;
        this.f28379l -= min;
        byteBuffer.position(position + min);
        if (this.f28379l > 0) {
            return;
        }
        int i3 = i2 - min;
        int length = (this.f28381n + i3) - this.f28380m.length;
        ByteBuffer a2 = a(length);
        int a3 = xp.a(length, 0, this.f28381n);
        a2.put(this.f28380m, 0, a3);
        int a4 = xp.a(length - a3, 0, i3);
        byteBuffer.limit(byteBuffer.position() + a4);
        a2.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i3 - a4;
        int i5 = this.f28381n - a3;
        this.f28381n = i5;
        byte[] bArr = this.f28380m;
        System.arraycopy(bArr, a3, bArr, 0, i5);
        byteBuffer.get(this.f28380m, this.f28381n, i4);
        this.f28381n += i4;
        a2.flip();
    }
}
