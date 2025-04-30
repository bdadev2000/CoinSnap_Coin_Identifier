package c7;

import e8.C2231f;

/* renamed from: c7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0634j {
    public static final C0632i Companion = new C0632i(null);
    private final String extension;
    private final Boolean required;
    private final String url;

    public C0634j() {
        this((String) null, (String) null, (Boolean) null, 7, (G7.f) null);
    }

    public static /* synthetic */ C0634j copy$default(C0634j c0634j, String str, String str2, Boolean bool, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c0634j.url;
        }
        if ((i9 & 2) != 0) {
            str2 = c0634j.extension;
        }
        if ((i9 & 4) != 0) {
            bool = c0634j.required;
        }
        return c0634j.copy(str, str2, bool);
    }

    public static final void write$Self(C0634j c0634j, d8.b bVar, c8.g gVar) {
        G7.j.e(c0634j, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0634j.url != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, c0634j.url);
        }
        if (bVar.o(gVar) || c0634j.extension != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, c0634j.extension);
        }
        if (bVar.o(gVar) || c0634j.required != null) {
            bVar.u(gVar, 2, C2231f.f20162a, c0634j.required);
        }
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.extension;
    }

    public final Boolean component3() {
        return this.required;
    }

    public final C0634j copy(String str, String str2, Boolean bool) {
        return new C0634j(str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0634j)) {
            return false;
        }
        C0634j c0634j = (C0634j) obj;
        if (G7.j.a(this.url, c0634j.url) && G7.j.a(this.extension, c0634j.extension) && G7.j.a(this.required, c0634j.required)) {
            return true;
        }
        return false;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.url;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.extension;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Boolean bool = this.required;
        if (bool != null) {
            i9 = bool.hashCode();
        }
        return i11 + i9;
    }

    public String toString() {
        return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", required=" + this.required + ')';
    }

    public /* synthetic */ C0634j(int i9, String str, String str2, Boolean bool, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i9 & 2) == 0) {
            this.extension = null;
        } else {
            this.extension = str2;
        }
        if ((i9 & 4) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
    }

    public C0634j(String str, String str2, Boolean bool) {
        this.url = str;
        this.extension = str2;
        this.required = bool;
    }

    public /* synthetic */ C0634j(String str, String str2, Boolean bool, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : bool);
    }
}
