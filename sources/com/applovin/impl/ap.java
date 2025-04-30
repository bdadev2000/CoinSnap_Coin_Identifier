package com.applovin.impl;

import com.applovin.impl.InterfaceC0732o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class ap extends AbstractC0779y1 {

    /* renamed from: i, reason: collision with root package name */
    private int f6773i;

    /* renamed from: j, reason: collision with root package name */
    private int f6774j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6775k;
    private int l;
    private byte[] m = yp.f12455f;

    /* renamed from: n, reason: collision with root package name */
    private int f6776n;

    /* renamed from: o, reason: collision with root package name */
    private long f6777o;

    @Override // com.applovin.impl.InterfaceC0732o1
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        if (i9 == 0) {
            return;
        }
        int min = Math.min(i9, this.l);
        this.f6777o += min / this.b.f9380d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i10 = i9 - min;
        int length = (this.f6776n + i10) - this.m.length;
        ByteBuffer a6 = a(length);
        int a9 = yp.a(length, 0, this.f6776n);
        a6.put(this.m, 0, a9);
        int a10 = yp.a(length - a9, 0, i10);
        byteBuffer.limit(byteBuffer.position() + a10);
        a6.put(byteBuffer);
        byteBuffer.limit(limit);
        int i11 = i10 - a10;
        int i12 = this.f6776n - a9;
        this.f6776n = i12;
        byte[] bArr = this.m;
        System.arraycopy(bArr, a9, bArr, 0, i12);
        byteBuffer.get(this.m, this.f6776n, i11);
        this.f6776n += i11;
        a6.flip();
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public InterfaceC0732o1.a b(InterfaceC0732o1.a aVar) {
        if (aVar.f9379c == 2) {
            this.f6775k = true;
            if (this.f6773i == 0 && this.f6774j == 0) {
                return InterfaceC0732o1.a.f9377e;
            }
            return aVar;
        }
        throw new InterfaceC0732o1.b(aVar);
    }

    @Override // com.applovin.impl.AbstractC0779y1, com.applovin.impl.InterfaceC0732o1
    public boolean c() {
        if (super.c() && this.f6776n == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.AbstractC0779y1, com.applovin.impl.InterfaceC0732o1
    public ByteBuffer d() {
        int i9;
        if (super.c() && (i9 = this.f6776n) > 0) {
            a(i9).put(this.m, 0, this.f6776n).flip();
            this.f6776n = 0;
        }
        return super.d();
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void g() {
        if (this.f6775k) {
            this.f6775k = false;
            int i9 = this.f6774j;
            int i10 = this.b.f9380d;
            this.m = new byte[i9 * i10];
            this.l = this.f6773i * i10;
        }
        this.f6776n = 0;
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void h() {
        if (this.f6775k) {
            if (this.f6776n > 0) {
                this.f6777o += r0 / this.b.f9380d;
            }
            this.f6776n = 0;
        }
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void i() {
        this.m = yp.f12455f;
    }

    public long j() {
        return this.f6777o;
    }

    public void k() {
        this.f6777o = 0L;
    }

    public void a(int i9, int i10) {
        this.f6773i = i9;
        this.f6774j = i10;
    }
}
