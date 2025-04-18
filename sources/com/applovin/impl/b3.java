package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class b3 extends y1 {

    /* renamed from: i, reason: collision with root package name */
    private int[] f3819i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f3820j;

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a1.a(this.f3820j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = a(((limit - position) / this.f9104b.f6450d) * this.f9105c.f6450d);
        while (position < limit) {
            for (int i10 : iArr) {
                a.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f9104b.f6450d;
        }
        byteBuffer.position(limit);
        a.flip();
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f3819i;
        if (iArr == null) {
            return o1.a.f6447e;
        }
        if (aVar.f6449c == 2) {
            if (aVar.f6448b != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int i11 = iArr[i10];
                if (i11 < aVar.f6448b) {
                    if (i11 != i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new o1.b(aVar);
                }
            }
            if (z10) {
                return new o1.a(aVar.a, iArr.length, 2);
            }
            return o1.a.f6447e;
        }
        throw new o1.b(aVar);
    }

    @Override // com.applovin.impl.y1
    public void g() {
        this.f3820j = this.f3819i;
    }

    @Override // com.applovin.impl.y1
    public void i() {
        this.f3820j = null;
        this.f3819i = null;
    }

    public void a(int[] iArr) {
        this.f3819i = iArr;
    }
}
