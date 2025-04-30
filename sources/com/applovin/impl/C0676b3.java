package com.applovin.impl;

import com.applovin.impl.InterfaceC0732o1;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0676b3 extends AbstractC0779y1 {

    /* renamed from: i, reason: collision with root package name */
    private int[] f6803i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f6804j;

    @Override // com.applovin.impl.InterfaceC0732o1
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC0669a1.a(this.f6804j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a6 = a(((limit - position) / this.b.f9380d) * this.f12309c.f9380d);
        while (position < limit) {
            for (int i9 : iArr) {
                a6.putShort(byteBuffer.getShort((i9 * 2) + position));
            }
            position += this.b.f9380d;
        }
        byteBuffer.position(limit);
        a6.flip();
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public InterfaceC0732o1.a b(InterfaceC0732o1.a aVar) {
        boolean z8;
        boolean z9;
        int[] iArr = this.f6803i;
        if (iArr == null) {
            return InterfaceC0732o1.a.f9377e;
        }
        if (aVar.f9379c == 2) {
            if (aVar.b != iArr.length) {
                z8 = true;
            } else {
                z8 = false;
            }
            for (int i9 = 0; i9 < iArr.length; i9++) {
                int i10 = iArr[i9];
                if (i10 < aVar.b) {
                    if (i10 != i9) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z8 |= z9;
                } else {
                    throw new InterfaceC0732o1.b(aVar);
                }
            }
            if (z8) {
                return new InterfaceC0732o1.a(aVar.f9378a, iArr.length, 2);
            }
            return InterfaceC0732o1.a.f9377e;
        }
        throw new InterfaceC0732o1.b(aVar);
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void g() {
        this.f6804j = this.f6803i;
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public void i() {
        this.f6804j = null;
        this.f6803i = null;
    }

    public void a(int[] iArr) {
        this.f6803i = iArr;
    }
}
