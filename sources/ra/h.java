package ra;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final h.c f24053b;

    /* renamed from: c, reason: collision with root package name */
    public h.c f24054c;

    public h(String str) {
        h.c cVar = new h.c();
        this.f24053b = cVar;
        this.f24054c = cVar;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.a);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        h.c cVar = (h.c) this.f24053b.f18525f;
        String str = "";
        while (cVar != null) {
            Object obj = cVar.f18524d;
            sb2.append(str);
            Object obj2 = cVar.f18523c;
            if (((String) obj2) != null) {
                sb2.append((String) obj2);
                sb2.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            cVar = (h.c) cVar.f18525f;
            str = ", ";
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
