package vc;

import java.util.BitSet;

/* loaded from: classes3.dex */
public final class t0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.d();
        int b02 = aVar.b0();
        int i10 = 0;
        while (b02 != 2) {
            int b3 = t.h.b(b02);
            if (b3 != 5 && b3 != 6) {
                if (b3 == 7) {
                    z10 = aVar.w();
                } else {
                    throw new com.google.gson.v("Invalid bitset value type: " + vd.e.l(b02) + "; at path " + aVar.s(false));
                }
            } else {
                int T = aVar.T();
                if (T == 0) {
                    z10 = false;
                } else if (T == 1) {
                    z10 = true;
                } else {
                    StringBuilder m10 = a4.j.m("Invalid bitset value ", T, ", expected 0 or 1; at path ");
                    m10.append(aVar.s(true));
                    throw new com.google.gson.v(m10.toString());
                }
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            b02 = aVar.b0();
        }
        aVar.p();
        return bitSet;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.g();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.U(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.p();
    }
}
