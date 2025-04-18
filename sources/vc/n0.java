package vc;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class n0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        String Z = aVar.Z();
        try {
            return UUID.fromString(Z);
        } catch (IllegalArgumentException e2) {
            StringBuilder o10 = a4.j.o("Failed parsing '", Z, "' as UUID; at path ");
            o10.append(aVar.s(true));
            throw new com.google.gson.v(o10.toString(), e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        bVar.X(uuid);
    }
}
