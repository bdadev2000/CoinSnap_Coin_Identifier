package vc;

/* loaded from: classes3.dex */
public final class y0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        try {
            int T = aVar.T();
            if (T <= 255 && T >= -128) {
                return Byte.valueOf((byte) T);
            }
            StringBuilder m10 = a4.j.m("Lossy conversion from ", T, " to byte; at path ");
            m10.append(aVar.s(true));
            throw new com.google.gson.v(m10.toString());
        } catch (NumberFormatException e2) {
            throw new com.google.gson.v(e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.t();
        } else {
            bVar.U(r4.byteValue());
        }
    }
}
