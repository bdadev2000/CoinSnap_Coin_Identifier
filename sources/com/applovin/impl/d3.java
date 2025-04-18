package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class d3 extends z1 {

    /* renamed from: i, reason: collision with root package name */
    private int[] f23401i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f23402j;

    public void a(int[] iArr) {
        this.f23401i = iArr;
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        int[] iArr = this.f23401i;
        if (iArr == null) {
            return p1.a.e;
        }
        if (aVar.f25956c != 2) {
            throw new p1.b(aVar);
        }
        boolean z2 = aVar.f25955b != iArr.length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= aVar.f25955b) {
                throw new p1.b(aVar);
            }
            z2 |= i3 != i2;
            i2++;
        }
        return z2 ? new p1.a(aVar.f25954a, iArr.length, 2) : p1.a.e;
    }

    @Override // com.applovin.impl.z1
    public void g() {
        this.f23402j = this.f23401i;
    }

    @Override // com.applovin.impl.z1
    public void i() {
        this.f23402j = null;
        this.f23401i = null;
    }

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) b1.a(this.f23402j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a2 = a(((limit - position) / this.f28253b.d) * this.f28254c.d);
        while (position < limit) {
            for (int i2 : iArr) {
                a2.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f28253b.d;
        }
        byteBuffer.position(limit);
        a2.flip();
    }
}
