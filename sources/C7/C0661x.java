package c7;

import e8.C2231f;

/* renamed from: c7.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0661x {
    public static final C0659w Companion = new C0659w(null);
    private final String extraVast;
    private final Boolean isEnabled;

    public C0661x() {
        this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (G7.f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C0661x copy$default(C0661x c0661x, Boolean bool, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bool = c0661x.isEnabled;
        }
        if ((i9 & 2) != 0) {
            str = c0661x.extraVast;
        }
        return c0661x.copy(bool, str);
    }

    public static final void write$Self(C0661x c0661x, d8.b bVar, c8.g gVar) {
        G7.j.e(c0661x, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0661x.isEnabled != null) {
            bVar.u(gVar, 0, C2231f.f20162a, c0661x.isEnabled);
        }
        if (bVar.o(gVar) || c0661x.extraVast != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, c0661x.extraVast);
        }
    }

    public final Boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.extraVast;
    }

    public final C0661x copy(Boolean bool, String str) {
        return new C0661x(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0661x)) {
            return false;
        }
        C0661x c0661x = (C0661x) obj;
        if (G7.j.a(this.isEnabled, c0661x.isEnabled) && G7.j.a(this.extraVast, c0661x.extraVast)) {
            return true;
        }
        return false;
    }

    public final String getExtraVast() {
        return this.extraVast;
    }

    public int hashCode() {
        int hashCode;
        Boolean bool = this.isEnabled;
        int i9 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.extraVast;
        if (str != null) {
            i9 = str.hashCode();
        }
        return i10 + i9;
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewabilityInfo(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", extraVast=");
        return com.applovin.impl.L.k(sb, this.extraVast, ')');
    }

    public /* synthetic */ C0661x(int i9, Boolean bool, String str, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
        if ((i9 & 2) == 0) {
            this.extraVast = null;
        } else {
            this.extraVast = str;
        }
    }

    public C0661x(Boolean bool, String str) {
        this.isEnabled = bool;
        this.extraVast = str;
    }

    public /* synthetic */ C0661x(Boolean bool, String str, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : bool, (i9 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ void getExtraVast$annotations() {
    }

    public static /* synthetic */ void isEnabled$annotations() {
    }
}
