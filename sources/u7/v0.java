package u7;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class v0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public final long f25656i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f25657j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f25658k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f25659l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25660m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f25661n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f25662o;

    /* renamed from: p, reason: collision with root package name */
    public int f25663p;

    /* renamed from: q, reason: collision with root package name */
    public int f25664q;

    /* renamed from: r, reason: collision with root package name */
    public int f25665r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25666s;

    /* renamed from: t, reason: collision with root package name */
    public long f25667t;

    public v0() {
        byte[] bArr = n9.h0.f22548f;
        this.f25661n = bArr;
        this.f25662o = bArr;
    }

    @Override // u7.b0
    public final n b(n nVar) {
        if (nVar.f25594c == 2) {
            if (!this.f25660m) {
                return n.f25592e;
            }
            return nVar;
        }
        throw new o(nVar);
    }

    @Override // u7.b0
    public final void c() {
        if (this.f25660m) {
            n nVar = this.f25542b;
            int i10 = nVar.f25595d;
            this.f25659l = i10;
            int i11 = nVar.a;
            int i12 = ((int) ((this.f25656i * i11) / 1000000)) * i10;
            if (this.f25661n.length != i12) {
                this.f25661n = new byte[i12];
            }
            int i13 = ((int) ((this.f25657j * i11) / 1000000)) * i10;
            this.f25665r = i13;
            if (this.f25662o.length != i13) {
                this.f25662o = new byte[i13];
            }
        }
        this.f25663p = 0;
        this.f25667t = 0L;
        this.f25664q = 0;
        this.f25666s = false;
    }

    @Override // u7.b0
    public final void d() {
        int i10 = this.f25664q;
        if (i10 > 0) {
            h(this.f25661n, i10);
        }
        if (!this.f25666s) {
            this.f25667t += this.f25665r / this.f25659l;
        }
    }

    @Override // u7.b0
    public final void e() {
        this.f25660m = false;
        this.f25665r = 0;
        byte[] bArr = n9.h0.f22548f;
        this.f25661n = bArr;
        this.f25662o = bArr;
    }

    public final int g(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f25658k) {
                int i10 = this.f25659l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void h(byte[] bArr, int i10) {
        f(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f25666s = true;
        }
    }

    public final void i(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f25665r);
        int i11 = this.f25665r - min;
        System.arraycopy(bArr, i10 - i11, this.f25662o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f25662o, i11, min);
    }

    @Override // u7.b0, u7.p
    public final boolean isActive() {
        return this.f25660m;
    }

    @Override // u7.p
    public final void queueInput(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f25547g.hasRemaining()) {
            int i10 = this.f25663p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int g10 = g(byteBuffer);
                        byteBuffer.limit(g10);
                        this.f25667t += byteBuffer.remaining() / this.f25659l;
                        i(byteBuffer, this.f25662o, this.f25665r);
                        if (g10 < limit) {
                            h(this.f25662o, this.f25665r);
                            this.f25663p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int g11 = g(byteBuffer);
                    int position2 = g11 - byteBuffer.position();
                    byte[] bArr = this.f25661n;
                    int length = bArr.length;
                    int i11 = this.f25664q;
                    int i12 = length - i11;
                    if (g11 < limit2 && position2 < i12) {
                        h(bArr, i11);
                        this.f25664q = 0;
                        this.f25663p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f25661n, this.f25664q, min);
                        int i13 = this.f25664q + min;
                        this.f25664q = i13;
                        byte[] bArr2 = this.f25661n;
                        if (i13 == bArr2.length) {
                            if (this.f25666s) {
                                h(bArr2, this.f25665r);
                                this.f25667t += (this.f25664q - (this.f25665r * 2)) / this.f25659l;
                            } else {
                                this.f25667t += (i13 - this.f25665r) / this.f25659l;
                            }
                            i(byteBuffer, this.f25661n, this.f25664q);
                            this.f25664q = 0;
                            this.f25663p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f25661n.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f25658k) {
                            int i14 = this.f25659l;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f25663p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    f(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f25666s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }
}
