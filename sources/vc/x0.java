package vc;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class x0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        return Boolean.valueOf(aVar.Z());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String bool;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
            bool = AbstractJsonLexerKt.NULL;
        } else {
            bool = bool2.toString();
        }
        bVar.X(bool);
    }
}
