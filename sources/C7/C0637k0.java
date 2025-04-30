package c7;

import e8.C2231f;

/* renamed from: c7.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0637k0 {
    public static final C0635j0 Companion = new C0635j0(null);
    private final String configExt;
    private final Boolean needRefresh;

    public C0637k0() {
        this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (G7.f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C0637k0 copy$default(C0637k0 c0637k0, Boolean bool, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bool = c0637k0.needRefresh;
        }
        if ((i9 & 2) != 0) {
            str = c0637k0.configExt;
        }
        return c0637k0.copy(bool, str);
    }

    public static final void write$Self(C0637k0 c0637k0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0637k0, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0637k0.needRefresh != null) {
            bVar.u(gVar, 0, C2231f.f20162a, c0637k0.needRefresh);
        }
        if (bVar.o(gVar) || c0637k0.configExt != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, c0637k0.configExt);
        }
    }

    public final Boolean component1() {
        return this.needRefresh;
    }

    public final String component2() {
        return this.configExt;
    }

    public final C0637k0 copy(Boolean bool, String str) {
        return new C0637k0(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0637k0)) {
            return false;
        }
        C0637k0 c0637k0 = (C0637k0) obj;
        if (G7.j.a(this.needRefresh, c0637k0.needRefresh) && G7.j.a(this.configExt, c0637k0.configExt)) {
            return true;
        }
        return false;
    }

    public final String getConfigExt() {
        return this.configExt;
    }

    public final Boolean getNeedRefresh() {
        return this.needRefresh;
    }

    public int hashCode() {
        int hashCode;
        Boolean bool = this.needRefresh;
        int i9 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.configExt;
        if (str != null) {
            i9 = str.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigExtension(needRefresh=");
        sb.append(this.needRefresh);
        sb.append(", configExt=");
        return com.applovin.impl.L.k(sb, this.configExt, ')');
    }

    public /* synthetic */ C0637k0(int i9, Boolean bool, String str, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.needRefresh = null;
        } else {
            this.needRefresh = bool;
        }
        if ((i9 & 2) == 0) {
            this.configExt = null;
        } else {
            this.configExt = str;
        }
    }

    public C0637k0(Boolean bool, String str) {
        this.needRefresh = bool;
        this.configExt = str;
    }

    public /* synthetic */ C0637k0(Boolean bool, String str, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : bool, (i9 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ void getConfigExt$annotations() {
    }

    public static /* synthetic */ void getNeedRefresh$annotations() {
    }
}
