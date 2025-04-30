package c7;

import java.util.Map;

/* renamed from: c7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0648q {
    public static final C0646p Companion = new C0646p(null);
    private final Map<String, C0634j> cacheableReplacements;
    private final Map<String, String> normalReplacements;

    public C0648q() {
        this((Map) null, (Map) (0 == true ? 1 : 0), 3, (G7.f) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0648q copy$default(C0648q c0648q, Map map, Map map2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            map = c0648q.normalReplacements;
        }
        if ((i9 & 2) != 0) {
            map2 = c0648q.cacheableReplacements;
        }
        return c0648q.copy(map, map2);
    }

    public static final void write$Self(C0648q c0648q, d8.b bVar, c8.g gVar) {
        G7.j.e(c0648q, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0648q.normalReplacements != null) {
            e8.k0 k0Var = e8.k0.f20172a;
            bVar.u(gVar, 0, new e8.F(k0Var, k0Var, 1), c0648q.normalReplacements);
        }
        if (bVar.o(gVar) || c0648q.cacheableReplacements != null) {
            bVar.u(gVar, 1, new e8.F(e8.k0.f20172a, C0630h.INSTANCE, 1), c0648q.cacheableReplacements);
        }
    }

    public final Map<String, String> component1() {
        return this.normalReplacements;
    }

    public final Map<String, C0634j> component2() {
        return this.cacheableReplacements;
    }

    public final C0648q copy(Map<String, String> map, Map<String, C0634j> map2) {
        return new C0648q(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0648q)) {
            return false;
        }
        C0648q c0648q = (C0648q) obj;
        if (G7.j.a(this.normalReplacements, c0648q.normalReplacements) && G7.j.a(this.cacheableReplacements, c0648q.cacheableReplacements)) {
            return true;
        }
        return false;
    }

    public final Map<String, C0634j> getCacheableReplacements() {
        return this.cacheableReplacements;
    }

    public final Map<String, String> getNormalReplacements() {
        return this.normalReplacements;
    }

    public int hashCode() {
        int hashCode;
        Map<String, String> map = this.normalReplacements;
        int i9 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i10 = hashCode * 31;
        Map<String, C0634j> map2 = this.cacheableReplacements;
        if (map2 != null) {
            i9 = map2.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
    }

    public /* synthetic */ C0648q(int i9, Map map, Map map2, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.normalReplacements = null;
        } else {
            this.normalReplacements = map;
        }
        if ((i9 & 2) == 0) {
            this.cacheableReplacements = null;
        } else {
            this.cacheableReplacements = map2;
        }
    }

    public C0648q(Map<String, String> map, Map<String, C0634j> map2) {
        this.normalReplacements = map;
        this.cacheableReplacements = map2;
    }

    public /* synthetic */ C0648q(Map map, Map map2, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : map, (i9 & 2) != 0 ? null : map2);
    }

    public static /* synthetic */ void getCacheableReplacements$annotations() {
    }

    public static /* synthetic */ void getNormalReplacements$annotations() {
    }
}
