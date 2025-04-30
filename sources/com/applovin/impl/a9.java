package com.applovin.impl;

import com.applovin.impl.InterfaceC0732o1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a9 extends AbstractC0779y1 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f6594i = Float.floatToIntBits(Float.NaN);

    @Override // com.applovin.impl.InterfaceC0732o1
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer a6;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.b.f9379c;
        if (i10 == 536870912) {
            a6 = a((i9 / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), a6);
                position += 3;
            }
        } else if (i10 == 805306368) {
            a6 = a(i9);
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), a6);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a6.flip();
    }

    @Override // com.applovin.impl.AbstractC0779y1
    public InterfaceC0732o1.a b(InterfaceC0732o1.a aVar) {
        int i9 = aVar.f9379c;
        if (yp.f(i9)) {
            if (i9 != 4) {
                return new InterfaceC0732o1.a(aVar.f9378a, aVar.b, 4);
            }
            return InterfaceC0732o1.a.f9377e;
        }
        throw new InterfaceC0732o1.b(aVar);
    }

    private static void a(int i9, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i9 * 4.656612875245797E-10d));
        if (floatToIntBits == f6594i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
