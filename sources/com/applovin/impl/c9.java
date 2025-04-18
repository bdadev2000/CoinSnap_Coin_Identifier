package com.applovin.impl;

import com.applovin.impl.p1;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class c9 extends z1 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f23239i = Float.floatToIntBits(Float.NaN);

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer a2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f28253b.f25956c;
        if (i3 == 536870912) {
            a2 = a((i2 / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 24), a2);
                position += 3;
            }
        } else if (i3 == 805306368) {
            a2 = a(i2);
            while (position < limit) {
                a((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UnsignedBytes.MAX_VALUE) << 24), a2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a2.flip();
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        int i2 = aVar.f25956c;
        if (xp.f(i2)) {
            return i2 != 4 ? new p1.a(aVar.f25954a, aVar.f25955b, 4) : p1.a.e;
        }
        throw new p1.b(aVar);
    }

    private static void a(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == f23239i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
