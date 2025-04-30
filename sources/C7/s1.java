package c7;

/* loaded from: classes3.dex */
public final class s1 {
    public static final r1 Companion = new r1(null);
    private final String sdkUserAgent;

    public s1() {
        this((String) null, 1, (G7.f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ s1 copy$default(s1 s1Var, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = s1Var.sdkUserAgent;
        }
        return s1Var.copy(str);
    }

    public static final void write$Self(s1 s1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(s1Var, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || s1Var.sdkUserAgent != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, s1Var.sdkUserAgent);
        }
    }

    public final String component1() {
        return this.sdkUserAgent;
    }

    public final s1 copy(String str) {
        return new s1(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s1) && G7.j.a(this.sdkUserAgent, ((s1) obj).sdkUserAgent)) {
            return true;
        }
        return false;
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return com.applovin.impl.L.k(new StringBuilder("RtbRequest(sdkUserAgent="), this.sdkUserAgent, ')');
    }

    public /* synthetic */ s1(int i9, String str, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public s1(String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ s1(String str, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
