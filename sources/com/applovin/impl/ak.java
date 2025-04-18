package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ak extends z1 {

    /* renamed from: i, reason: collision with root package name */
    private final long f22902i;

    /* renamed from: j, reason: collision with root package name */
    private final long f22903j;

    /* renamed from: k, reason: collision with root package name */
    private final short f22904k;

    /* renamed from: l, reason: collision with root package name */
    private int f22905l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22906m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f22907n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f22908o;

    /* renamed from: p, reason: collision with root package name */
    private int f22909p;

    /* renamed from: q, reason: collision with root package name */
    private int f22910q;

    /* renamed from: r, reason: collision with root package name */
    private int f22911r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22912s;

    /* renamed from: t, reason: collision with root package name */
    private long f22913t;

    public ak() {
        this(150000L, 20000L, (short) 1024);
    }

    private int b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f22904k);
        int i2 = this.f22905l;
        return ((limit / i2) * i2) + i2;
    }

    private int c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f22904k) {
                int i2 = this.f22905l;
                return (position / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    private void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f22912s = true;
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c2 = c(byteBuffer);
        int position = c2 - byteBuffer.position();
        byte[] bArr = this.f22907n;
        int length = bArr.length;
        int i2 = this.f22910q;
        int i3 = length - i2;
        if (c2 < limit && position < i3) {
            a(bArr, i2);
            this.f22910q = 0;
            this.f22909p = 0;
            return;
        }
        int min = Math.min(position, i3);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f22907n, this.f22910q, min);
        int i4 = this.f22910q + min;
        this.f22910q = i4;
        byte[] bArr2 = this.f22907n;
        if (i4 == bArr2.length) {
            if (this.f22912s) {
                a(bArr2, this.f22911r);
                this.f22913t += (this.f22910q - (this.f22911r * 2)) / this.f22905l;
            } else {
                this.f22913t += (i4 - this.f22911r) / this.f22905l;
            }
            a(byteBuffer, this.f22907n, this.f22910q);
            this.f22910q = 0;
            this.f22909p = 2;
        }
        byteBuffer.limit(limit);
    }

    public void a(boolean z2) {
        this.f22906m = z2;
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.p1
    public boolean f() {
        return this.f22906m;
    }

    @Override // com.applovin.impl.z1
    public void g() {
        if (this.f22906m) {
            this.f22905l = this.f28253b.d;
            int a2 = a(this.f22902i) * this.f22905l;
            if (this.f22907n.length != a2) {
                this.f22907n = new byte[a2];
            }
            int a3 = a(this.f22903j) * this.f22905l;
            this.f22911r = a3;
            if (this.f22908o.length != a3) {
                this.f22908o = new byte[a3];
            }
        }
        this.f22909p = 0;
        this.f22913t = 0L;
        this.f22910q = 0;
        this.f22912s = false;
    }

    @Override // com.applovin.impl.z1
    public void h() {
        int i2 = this.f22910q;
        if (i2 > 0) {
            a(this.f22907n, i2);
        }
        if (this.f22912s) {
            return;
        }
        this.f22913t += this.f22911r / this.f22905l;
    }

    @Override // com.applovin.impl.z1
    public void i() {
        this.f22906m = false;
        this.f22911r = 0;
        byte[] bArr = xp.f27965f;
        this.f22907n = bArr;
        this.f22908o = bArr;
    }

    public long j() {
        return this.f22913t;
    }

    public ak(long j2, long j3, short s2) {
        b1.a(j3 <= j2);
        this.f22902i = j2;
        this.f22903j = j3;
        this.f22904k = s2;
        byte[] bArr = xp.f27965f;
        this.f22907n = bArr;
        this.f22908o = bArr;
    }

    private int a(long j2) {
        return (int) ((j2 * this.f28253b.f25954a) / 1000000);
    }

    private void f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f22907n.length));
        int b2 = b(byteBuffer);
        if (b2 == byteBuffer.position()) {
            this.f22909p = 1;
        } else {
            byteBuffer.limit(b2);
            d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void a(byte[] bArr, int i2) {
        a(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.f22912s = true;
        }
    }

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i2 = this.f22909p;
            if (i2 == 0) {
                f(byteBuffer);
            } else if (i2 == 1) {
                e(byteBuffer);
            } else if (i2 == 2) {
                g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        if (aVar.f25956c == 2) {
            return this.f22906m ? aVar : p1.a.e;
        }
        throw new p1.b(aVar);
    }

    private void g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c2 = c(byteBuffer);
        byteBuffer.limit(c2);
        this.f22913t += byteBuffer.remaining() / this.f22905l;
        a(byteBuffer, this.f22908o, this.f22911r);
        if (c2 < limit) {
            a(this.f22908o, this.f22911r);
            this.f22909p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.f22911r);
        int i3 = this.f22911r - min;
        System.arraycopy(bArr, i2 - i3, this.f22908o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f22908o, i3, min);
    }
}
