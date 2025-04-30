package com.applovin.impl;

import com.applovin.impl.InterfaceC0732o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class xj extends AbstractC0779y1 {

    /* renamed from: i, reason: collision with root package name */
    private final long f12267i;

    /* renamed from: j, reason: collision with root package name */
    private final long f12268j;

    /* renamed from: k, reason: collision with root package name */
    private final short f12269k;
    private int l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f12270n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f12271o;

    /* renamed from: p, reason: collision with root package name */
    private int f12272p;

    /* renamed from: q, reason: collision with root package name */
    private int f12273q;

    /* renamed from: r, reason: collision with root package name */
    private int f12274r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12275s;

    /* renamed from: t, reason: collision with root package name */
    private long f12276t;

    public xj() {
        this(150000L, 20000L, (short) 1024);
    }

    private int a(long j7) {
        return (int) ((j7 * this.b.f9378a) / 1000000);
    }

    private int b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f12269k);
        int i9 = this.l;
        return ((limit / i9) * i9) + i9;
    }

    private int c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f12269k) {
                int i9 = this.l;
                return (position / i9) * i9;
            }
        }
        return byteBuffer.limit();
    }

    private void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f12275s = true;
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c9 = c(byteBuffer);
        int position = c9 - byteBuffer.position();
        byte[] bArr = this.f12270n;
        int length = bArr.length;
        int i9 = this.f12273q;
        int i10 = length - i9;
        if (c9 < limit && position < i10) {
            a(bArr, i9);
            this.f12273q = 0;
            this.f12272p = 0;
            return;
        }
        int min = Math.min(position, i10);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f12270n, this.f12273q, min);
        int i11 = this.f12273q + min;
        this.f12273q = i11;
        byte[] bArr2 = this.f12270n;
        if (i11 == bArr2.length) {
            if (this.f12275s) {
                a(bArr2, this.f12274r);
                this.f12276t += (this.f12273q - (this.f12274r * 2)) / this.l;
            } else {
                this.f12276t += (i11 - this.f12274r) / this.l;
            }
            a(byteBuffer, this.f12270n, this.f12273q);
            this.f12273q = 0;
            this.f12272p = 2;
        }
        byteBuffer.limit(limit);
    }

    @Override // com.applovin.impl.AbstractC0779y1, com.applovin.impl.InterfaceC0732o1
    public boolean f() {
        return this.m;
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void g() {
        if (this.m) {
            this.l = this.b.f9380d;
            int a6 = a(this.f12267i) * this.l;
            if (this.f12270n.length != a6) {
                this.f12270n = new byte[a6];
            }
            int a9 = a(this.f12268j) * this.l;
            this.f12274r = a9;
            if (this.f12271o.length != a9) {
                this.f12271o = new byte[a9];
            }
        }
        this.f12272p = 0;
        this.f12276t = 0L;
        this.f12273q = 0;
        this.f12275s = false;
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void h() {
        int i9 = this.f12273q;
        if (i9 > 0) {
            a(this.f12270n, i9);
        }
        if (!this.f12275s) {
            this.f12276t += this.f12274r / this.l;
        }
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void i() {
        this.m = false;
        this.f12274r = 0;
        byte[] bArr = yp.f12455f;
        this.f12270n = bArr;
        this.f12271o = bArr;
    }

    public long j() {
        return this.f12276t;
    }

    public xj(long j7, long j9, short s5) {
        AbstractC0669a1.a(j9 <= j7);
        this.f12267i = j7;
        this.f12268j = j9;
        this.f12269k = s5;
        byte[] bArr = yp.f12455f;
        this.f12270n = bArr;
        this.f12271o = bArr;
    }

    private void a(byte[] bArr, int i9) {
        a(i9).put(bArr, 0, i9).flip();
        if (i9 > 0) {
            this.f12275s = true;
        }
    }

    private void f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f12270n.length));
        int b = b(byteBuffer);
        if (b == byteBuffer.position()) {
            this.f12272p = 1;
        } else {
            byteBuffer.limit(b);
            d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i9 = this.f12272p;
            if (i9 == 0) {
                f(byteBuffer);
            } else if (i9 == 1) {
                e(byteBuffer);
            } else if (i9 == 2) {
                g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public InterfaceC0732o1.a b(InterfaceC0732o1.a aVar) {
        if (aVar.f9379c == 2) {
            return this.m ? aVar : InterfaceC0732o1.a.f9377e;
        }
        throw new InterfaceC0732o1.b(aVar);
    }

    public void a(boolean z8) {
        this.m = z8;
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int min = Math.min(byteBuffer.remaining(), this.f12274r);
        int i10 = this.f12274r - min;
        System.arraycopy(bArr, i9 - i10, this.f12271o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f12271o, i10, min);
    }

    private void g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c9 = c(byteBuffer);
        byteBuffer.limit(c9);
        this.f12276t += byteBuffer.remaining() / this.l;
        a(byteBuffer, this.f12271o, this.f12274r);
        if (c9 < limit) {
            a(this.f12271o, this.f12274r);
            this.f12272p = 0;
            byteBuffer.limit(limit);
        }
    }
}
