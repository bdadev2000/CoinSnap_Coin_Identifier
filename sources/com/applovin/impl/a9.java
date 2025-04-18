package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
final class a9 extends y1 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f3611i = Float.floatToIntBits(Float.NaN);

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f9104b.f6449c;
        if (i11 == 536870912) {
            a = a((i10 / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24), a);
                position += 3;
            }
        } else if (i11 == 805306368) {
            a = a(i10);
            while (position < limit) {
                a((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24), a);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    @Override // com.applovin.impl.y1
    public o1.a b(o1.a aVar) {
        int i10 = aVar.f6449c;
        if (yp.f(i10)) {
            if (i10 != 4) {
                return new o1.a(aVar.a, aVar.f6448b, 4);
            }
            return o1.a.f6447e;
        }
        throw new o1.b(aVar);
    }

    private static void a(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f3611i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
