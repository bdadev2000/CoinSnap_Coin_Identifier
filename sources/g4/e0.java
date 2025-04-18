package g4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class e0 {
    public final m0.c a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18056b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18057c;

    public e0(Class cls, Class cls2, Class cls3, List list, h.c cVar) {
        this.a = cVar;
        if (!list.isEmpty()) {
            this.f18056b = list;
            this.f18057c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final g0 a(int i10, int i11, d3.g gVar, e4.m mVar, com.bumptech.glide.load.data.g gVar2) {
        m0.c cVar = this.a;
        Object d10 = cVar.d();
        com.bumptech.glide.c.l(d10);
        List list = (List) d10;
        try {
            List list2 = this.f18056b;
            int size = list2.size();
            g0 g0Var = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    g0Var = ((n) list2.get(i12)).a(i10, i11, gVar, mVar, gVar2);
                } catch (b0 e2) {
                    list.add(e2);
                }
                if (g0Var != null) {
                    break;
                }
            }
            if (g0Var != null) {
                return g0Var;
            }
            throw new b0(this.f18057c, new ArrayList(list));
        } finally {
            cVar.c(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f18056b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
