package c7;

/* renamed from: c7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0642n {
    public static final C0640m Companion = new C0640m(null);
    private final C0628g adMarkup;
    private final String placementReferenceId;

    public C0642n() {
        this((String) null, (C0628g) (0 == true ? 1 : 0), 3, (G7.f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C0642n copy$default(C0642n c0642n, String str, C0628g c0628g, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c0642n.placementReferenceId;
        }
        if ((i9 & 2) != 0) {
            c0628g = c0642n.adMarkup;
        }
        return c0642n.copy(str, c0628g);
    }

    public static final void write$Self(C0642n c0642n, d8.b bVar, c8.g gVar) {
        G7.j.e(c0642n, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0642n.placementReferenceId != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, c0642n.placementReferenceId);
        }
        if (bVar.o(gVar) || c0642n.adMarkup != null) {
            bVar.u(gVar, 1, C0624e.INSTANCE, c0642n.adMarkup);
        }
    }

    public final String component1() {
        return this.placementReferenceId;
    }

    public final C0628g component2() {
        return this.adMarkup;
    }

    public final C0642n copy(String str, C0628g c0628g) {
        return new C0642n(str, c0628g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0642n)) {
            return false;
        }
        C0642n c0642n = (C0642n) obj;
        if (G7.j.a(this.placementReferenceId, c0642n.placementReferenceId) && G7.j.a(this.adMarkup, c0642n.adMarkup)) {
            return true;
        }
        return false;
    }

    public final C0628g getAdMarkup() {
        return this.adMarkup;
    }

    public final String getPlacementReferenceId() {
        return this.placementReferenceId;
    }

    public int hashCode() {
        int hashCode;
        String str = this.placementReferenceId;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        C0628g c0628g = this.adMarkup;
        if (c0628g != null) {
            i9 = c0628g.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
    }

    public /* synthetic */ C0642n(int i9, String str, C0628g c0628g, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.placementReferenceId = null;
        } else {
            this.placementReferenceId = str;
        }
        if ((i9 & 2) == 0) {
            this.adMarkup = null;
        } else {
            this.adMarkup = c0628g;
        }
    }

    public C0642n(String str, C0628g c0628g) {
        this.placementReferenceId = str;
        this.adMarkup = c0628g;
    }

    public /* synthetic */ C0642n(String str, C0628g c0628g, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : c0628g);
    }

    public static /* synthetic */ void getAdMarkup$annotations() {
    }

    public static /* synthetic */ void getPlacementReferenceId$annotations() {
    }
}
