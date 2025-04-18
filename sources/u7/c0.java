package u7;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class c0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public int[] f25549i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f25550j;

    @Override // u7.b0
    public final n b(n nVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f25549i;
        if (iArr == null) {
            return n.f25592e;
        }
        if (nVar.f25594c == 2) {
            int length = iArr.length;
            int i10 = nVar.f25593b;
            if (i10 != length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new o(nVar);
                }
            }
            if (z10) {
                return new n(nVar.a, iArr.length, 2);
            }
            return n.f25592e;
        }
        throw new o(nVar);
    }

    @Override // u7.b0
    public final void c() {
        this.f25550j = this.f25549i;
    }

    @Override // u7.b0
    public final void e() {
        this.f25550j = null;
        this.f25549i = null;
    }

    @Override // u7.p
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.f25550j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer f10 = f(((limit - position) / this.f25542b.f25595d) * this.f25543c.f25595d);
        while (position < limit) {
            for (int i10 : iArr) {
                f10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f25542b.f25595d;
        }
        byteBuffer.position(limit);
        f10.flip();
    }
}
