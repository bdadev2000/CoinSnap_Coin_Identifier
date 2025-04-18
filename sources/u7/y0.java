package u7;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class y0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f25712i = Float.floatToIntBits(Float.NaN);

    @Override // u7.b0
    public final n b(n nVar) {
        boolean z10;
        int i10 = nVar.f25594c;
        if (i10 != 536870912 && i10 != 805306368 && i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i10 != 4) {
                return new n(nVar.a, nVar.f25593b, 4);
            }
            return n.f25592e;
        }
        throw new o(nVar);
    }

    @Override // u7.p
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer f10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f25542b.f25594c;
        int i12 = f25712i;
        if (i11 != 536870912) {
            if (i11 == 805306368) {
                f10 = f(i10);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i12) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    f10.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            f10 = f((i10 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i12) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                f10.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        f10.flip();
    }
}
