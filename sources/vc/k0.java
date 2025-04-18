package vc;

import java.net.URL;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class k0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
        } else {
            String Z = aVar.Z();
            if (!Z.equals(AbstractJsonLexerKt.NULL)) {
                return new URL(Z);
            }
        }
        return null;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String externalForm;
        URL url = (URL) obj;
        if (url == null) {
            externalForm = null;
        } else {
            externalForm = url.toExternalForm();
        }
        bVar.X(externalForm);
    }
}
