package c7;

import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class D {
    public static final C Companion = new C(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    public /* synthetic */ D(int i9, String str, String str2, String str3, e8.g0 g0Var) {
        if (7 != (i9 & 7)) {
            e8.W.h(i9, 7, B.INSTANCE.getDescriptor());
            throw null;
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ D copy$default(D d2, String str, String str2, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = d2.bundle;
        }
        if ((i9 & 2) != 0) {
            str2 = d2.ver;
        }
        if ((i9 & 4) != 0) {
            str3 = d2.appId;
        }
        return d2.copy(str, str2, str3);
    }

    public static final void write$Self(D d2, d8.b bVar, c8.g gVar) {
        G7.j.e(d2, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.k(gVar, 0, d2.bundle);
        bVar.k(gVar, 1, d2.ver);
        bVar.k(gVar, 2, d2.appId);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final D copy(String str, String str2, String str3) {
        G7.j.e(str, "bundle");
        G7.j.e(str2, "ver");
        G7.j.e(str3, "appId");
        return new D(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d2 = (D) obj;
        if (G7.j.a(this.bundle, d2.bundle) && G7.j.a(this.ver, d2.ver) && G7.j.a(this.appId, d2.appId)) {
            return true;
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.appId.hashCode() + AbstractC2914a.b(this.bundle.hashCode() * 31, 31, this.ver);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppNode(bundle=");
        sb.append(this.bundle);
        sb.append(", ver=");
        sb.append(this.ver);
        sb.append(", appId=");
        return com.applovin.impl.L.k(sb, this.appId, ')');
    }

    public D(String str, String str2, String str3) {
        G7.j.e(str, "bundle");
        G7.j.e(str2, "ver");
        G7.j.e(str3, "appId");
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ void getAppId$annotations() {
    }
}
