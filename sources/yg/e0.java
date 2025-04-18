package yg;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class e0 extends l {
    public final a0 a;

    /* renamed from: b, reason: collision with root package name */
    public final l f28230b;

    /* renamed from: c, reason: collision with root package name */
    public final l f28231c;

    /* renamed from: d, reason: collision with root package name */
    public final l f28232d;

    /* renamed from: e, reason: collision with root package name */
    public final l f28233e;

    /* renamed from: f, reason: collision with root package name */
    public final l f28234f;

    public e0(a0 a0Var) {
        this.a = a0Var;
        a0Var.getClass();
        Set set = zg.b.a;
        this.f28230b = a0Var.a(List.class, set, null);
        this.f28231c = a0Var.a(Map.class, set, null);
        this.f28232d = a0Var.a(String.class, set, null);
        this.f28233e = a0Var.a(Double.class, set, null);
        this.f28234f = a0Var.a(Boolean.class, set, null);
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        int b3 = t.h.b(pVar.u());
        if (b3 != 0) {
            if (b3 != 2) {
                if (b3 != 5) {
                    if (b3 != 6) {
                        if (b3 != 7) {
                            if (b3 == 8) {
                                pVar.s();
                                return null;
                            }
                            throw new IllegalStateException("Expected a value but was " + vd.e.k(pVar.u()) + " at path " + pVar.z());
                        }
                        return this.f28234f.fromJson(pVar);
                    }
                    return this.f28233e.fromJson(pVar);
                }
                return this.f28232d.fromJson(pVar);
            }
            return this.f28231c.fromJson(pVar);
        }
        return this.f28230b.fromJson(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L7;
     */
    @Override // yg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void toJson(yg.s r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.g()
            r5.j()
            goto L2e
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = zg.b.a
            r2 = 0
            yg.a0 r3 = r4.a
            yg.l r0 = r3.a(r0, r1, r2)
            r0.toJson(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.e0.toJson(yg.s, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
