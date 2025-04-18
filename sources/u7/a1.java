package u7;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class a1 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public int f25529i;

    /* renamed from: j, reason: collision with root package name */
    public int f25530j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25531k;

    /* renamed from: l, reason: collision with root package name */
    public int f25532l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f25533m = n9.h0.f22548f;

    /* renamed from: n, reason: collision with root package name */
    public int f25534n;

    /* renamed from: o, reason: collision with root package name */
    public long f25535o;

    @Override // u7.b0
    public final n b(n nVar) {
        if (nVar.f25594c == 2) {
            this.f25531k = true;
            if (this.f25529i == 0 && this.f25530j == 0) {
                return n.f25592e;
            }
            return nVar;
        }
        throw new o(nVar);
    }

    @Override // u7.b0
    public final void c() {
        if (this.f25531k) {
            this.f25531k = false;
            int i10 = this.f25530j;
            int i11 = this.f25542b.f25595d;
            this.f25533m = new byte[i10 * i11];
            this.f25532l = this.f25529i * i11;
        }
        this.f25534n = 0;
    }

    @Override // u7.b0
    public final void d() {
        if (this.f25531k) {
            if (this.f25534n > 0) {
                this.f25535o += r0 / this.f25542b.f25595d;
            }
            this.f25534n = 0;
        }
    }

    @Override // u7.b0
    public final void e() {
        this.f25533m = n9.h0.f22548f;
    }

    @Override // u7.b0, u7.p
    public final ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f25534n) > 0) {
            f(i10).put(this.f25533m, 0, this.f25534n).flip();
            this.f25534n = 0;
        }
        return super.getOutput();
    }

    @Override // u7.b0, u7.p
    public final boolean isEnded() {
        return super.isEnded() && this.f25534n == 0;
    }

    @Override // u7.p
    public final void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f25532l);
        this.f25535o += min / this.f25542b.f25595d;
        this.f25532l -= min;
        byteBuffer.position(position + min);
        if (this.f25532l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f25534n + i11) - this.f25533m.length;
        ByteBuffer f10 = f(length);
        int h10 = n9.h0.h(length, 0, this.f25534n);
        f10.put(this.f25533m, 0, h10);
        int h11 = n9.h0.h(length - h10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h11);
        f10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h11;
        int i13 = this.f25534n - h10;
        this.f25534n = i13;
        byte[] bArr = this.f25533m;
        System.arraycopy(bArr, h10, bArr, 0, i13);
        byteBuffer.get(this.f25533m, this.f25534n, i12);
        this.f25534n += i12;
        f10.flip();
    }
}
