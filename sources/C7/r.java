package c7;

import M0.C0219j;
import e8.C2228c;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r extends f8.A {
    public static final r INSTANCE = new r();

    private r() {
        super(C0219j.a(new C2228c(e8.k0.f20172a, 0)));
    }

    @Override // f8.A
    public f8.j transformDeserialize(f8.j jVar) {
        f8.v vVar;
        G7.j.e(jVar, "element");
        if (jVar instanceof f8.v) {
            vVar = (f8.v) jVar;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : vVar.b.entrySet()) {
                if (!G7.j.a((String) entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new f8.v(linkedHashMap);
        }
        C2.m.l(jVar, "JsonObject");
        throw null;
    }
}
