package vc;

/* loaded from: classes3.dex */
public final class c0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        String Z = aVar.Z();
        if (Z.length() == 1) {
            return Character.valueOf(Z.charAt(0));
        }
        StringBuilder o10 = a4.j.o("Expecting character, got: ", Z, "; at ");
        o10.append(aVar.s(true));
        throw new com.google.gson.v(o10.toString());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String valueOf;
        Character ch2 = (Character) obj;
        if (ch2 == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch2);
        }
        bVar.X(valueOf);
    }
}
