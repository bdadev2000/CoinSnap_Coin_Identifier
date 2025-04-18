package vc;

/* loaded from: classes3.dex */
public final class z0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        try {
            int T = aVar.T();
            if (T <= 65535 && T >= -32768) {
                return Short.valueOf((short) T);
            }
            StringBuilder m10 = a4.j.m("Lossy conversion from ", T, " to short; at path ");
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
            bVar.U(r4.shortValue());
        }
    }
}
