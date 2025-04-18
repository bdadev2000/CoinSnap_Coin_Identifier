package yg;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class x extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final a f28288c = new a(3);
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public final l f28289b;

    public x(a0 a0Var, Type type, Type type2) {
        a0Var.getClass();
        Set set = zg.b.a;
        this.a = a0Var.a(type, set, null);
        this.f28289b = a0Var.a(type2, set, null);
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        w wVar = new w();
        pVar.g();
        while (pVar.p()) {
            q qVar = (q) pVar;
            if (qVar.p()) {
                qVar.f28257l = qVar.a0();
                qVar.f28254i = 11;
            }
            Object fromJson = this.a.fromJson(pVar);
            Object fromJson2 = this.f28289b.fromJson(pVar);
            Object put = wVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new androidx.fragment.app.z("Map key '" + fromJson + "' has multiple values at path " + pVar.z() + ": " + put + " and " + fromJson2);
            }
        }
        pVar.k();
        return wVar;
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        sVar.g();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int q10 = sVar.q();
                if (q10 != 5 && q10 != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
                sVar.f28265g = true;
                this.a.toJson(sVar, entry.getKey());
                this.f28289b.toJson(sVar, entry.getValue());
            } else {
                throw new androidx.fragment.app.z("Map key is null at " + sVar.z());
            }
        }
        sVar.j();
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + "=" + this.f28289b + ")";
    }
}
