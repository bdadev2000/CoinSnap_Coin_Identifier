package vc;

import java.net.URI;
import java.net.URISyntaxException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class l0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
        } else {
            try {
                String Z = aVar.Z();
                if (!Z.equals(AbstractJsonLexerKt.NULL)) {
                    return new URI(Z);
                }
            } catch (URISyntaxException e2) {
                throw new com.google.gson.q(e2);
            }
        }
        return null;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        bVar.X(aSCIIString);
    }
}
