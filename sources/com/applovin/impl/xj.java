package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class xj extends y1 {

    /* renamed from: i, reason: collision with root package name */
    private final long f9047i;

    /* renamed from: j, reason: collision with root package name */
    private final long f9048j;

    /* renamed from: k, reason: collision with root package name */
    private final short f9049k;

    /* renamed from: l, reason: collision with root package name */
    private int f9050l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9051m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f9052n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f9053o;

    /* renamed from: p, reason: collision with root package name */
    private int f9054p;

    /* renamed from: q, reason: collision with root package name */
    private int f9055q;

    /* renamed from: r, reason: collision with root package name */
    private int f9056r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9057s;

    /* renamed from: t, reason: collision with root package name */
    private long f9058t;

    public xj() {
        this(150000L, 20000L, (short) 1024);
    }

    private int a(long j3) {
        return (int) ((j3 * this.f9104b.a) / 1000000);
    }

    private int b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f9049k);
        int i10 = this.f9050l;
        return ((limit / i10) * i10) + i10;
    }

    private int c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f9049k) {
                int i10 = this.f9050l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    private void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f9057s = true;
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c10 = c(byteBuffer);
        int position = c10 - byteBuffer.position();
        byte[] bArr = this.f9052n;
        int length = bArr.length;
        int i10 = this.f9055q;
        int i11 = length - i10;
        if (c10 < limit && position < i11) {
            a(bArr, i10);
            this.f9055q = 0;
            this.f9054p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f9052n, this.f9055q, min);
        int i12 = this.f9055q + min;
        this.f9055q = i12;
        byte[] bArr2 = this.f9052n;
        if (i12 == bArr2.length) {
            if (this.f9057s) {
                a(bArr2, this.f9056r);
                this.f9058t += (this.f9055q - (this.f9056r * 2)) / this.f9050l;
            } else {
                this.f9058t += (i12 - this.f9056r) / this.f9050l;
            }
            a(byteBuffer, this.f9052n, this.f9055q);
            this.f9055q = 0;
            this.f9054p = 2;
        }
        byteBuffer.limit(limit);
    }

    @Override // com.applovin.impl.y1, com.applovin.impl.o1
    public boolean f() {
        return this.f9051m;
    }

    @Override // com.applovin.impl.y1
    public void g() {
        if (this.f9051m) {
            this.f9050l = this.f9104b.f6450d;
            int a = a(this.f9047i) * this.f9050l;
            if (this.f9052n.length != a) {
                this.f9052n = new byte[a];
            }
            int a10 = a(this.f9048j) * this.f9050l;
            this.f9056r = a10;
            if (this.f9053o.length != a10) {
                this.f9053o = new byte[a10];
            }
        }
        this.f9054p = 0;
        this.f9058t = 0L;
        this.f9055q = 0;
        this.f9057s = false;
    }

    @Override // com.applovin.impl.y1
    public void h() {
        int i10 = this.f9055q;
        if (i10 > 0) {
            a(this.f9052n, i10);
        }
        if (!this.f9057s) {
            this.f9058t += this.f9056r / this.f9050l;
        }
    }

    @Override // com.applovin.impl.y1
    public void i() {
        this.f9051m = false;
        this.f9056r = 0;
        byte[] bArr = yp.f9257f;
        this.f9052n = bArr;
        this.f9053o = bArr;
    }

    public long j() {
        return this.f9058t;
    }

    public xj(long j3, long j10, short s5) {
        a1.a(j10 <= j3);
        this.f9047i = j3;
        this.f9048j = j10;
        this.f9049k = s5;
        byte[] bArr = yp.f9257f;
        this.f9052n = bArr;
        this.f9053o = bArr;
    }

    private void a(byte[] bArr, int i10) {
        a(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f9057s = true;
        }
    }

    private void f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f9052n.length));
        int b3 = b(byteBuffer);
        if (b3 == byteBuffer.position()) {
            this.f9054p = 1;
        } else {
            byteBuffer.limit(b3);
            d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i10 = this.f9054p;
            if (i10 == 0) {
                f(byteBuffer);
            } else if (i10 == 1) {
                e(byteBuffer);
            } else if (i10 == 2) {
                g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) {
        if (aVar.f6449c == 2) {
            return this.f9051m ? aVar : o1.a.f6447e;
        }
        throw new o1.b(aVar);
    }

    public void a(boolean z10) {
        this.f9051m = z10;
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f9056r);
        int i11 = this.f9056r - min;
        System.arraycopy(bArr, i10 - i11, this.f9053o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f9053o, i11, min);
    }

    private void g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c10 = c(byteBuffer);
        byteBuffer.limit(c10);
        this.f9058t += byteBuffer.remaining() / this.f9050l;
        a(byteBuffer, this.f9053o, this.f9056r);
        if (c10 < limit) {
            a(this.f9053o, this.f9056r);
            this.f9054p = 0;
            byteBuffer.limit(limit);
        }
    }
}
