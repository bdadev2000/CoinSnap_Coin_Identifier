package c7;

/* renamed from: c7.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0652s0 {
    public static final C0650r0 Companion = new C0650r0(null);
    private final String collectFilter;
    private final boolean enabled;
    private final int maxSendAmount;

    public /* synthetic */ C0652s0(int i9, boolean z8, int i10, String str, e8.g0 g0Var) {
        if (6 != (i9 & 6)) {
            e8.W.h(i9, 6, C0649q0.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i9 & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z8;
        }
        this.maxSendAmount = i10;
        this.collectFilter = str;
    }

    public static /* synthetic */ C0652s0 copy$default(C0652s0 c0652s0, boolean z8, int i9, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = c0652s0.enabled;
        }
        if ((i10 & 2) != 0) {
            i9 = c0652s0.maxSendAmount;
        }
        if ((i10 & 4) != 0) {
            str = c0652s0.collectFilter;
        }
        return c0652s0.copy(z8, i9, str);
    }

    public static final void write$Self(C0652s0 c0652s0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0652s0, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0652s0.enabled) {
            bVar.v(gVar, 0, c0652s0.enabled);
        }
        bVar.C(1, c0652s0.maxSendAmount, gVar);
        bVar.k(gVar, 2, c0652s0.collectFilter);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.maxSendAmount;
    }

    public final String component3() {
        return this.collectFilter;
    }

    public final C0652s0 copy(boolean z8, int i9, String str) {
        G7.j.e(str, "collectFilter");
        return new C0652s0(z8, i9, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0652s0)) {
            return false;
        }
        C0652s0 c0652s0 = (C0652s0) obj;
        if (this.enabled == c0652s0.enabled && this.maxSendAmount == c0652s0.maxSendAmount && G7.j.a(this.collectFilter, c0652s0.collectFilter)) {
            return true;
        }
        return false;
    }

    public final String getCollectFilter() {
        return this.collectFilter;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxSendAmount() {
        return this.maxSendAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z8 = this.enabled;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return this.collectFilter.hashCode() + ((Integer.hashCode(this.maxSendAmount) + (r02 * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CrashReportSettings(enabled=");
        sb.append(this.enabled);
        sb.append(", maxSendAmount=");
        sb.append(this.maxSendAmount);
        sb.append(", collectFilter=");
        return com.applovin.impl.L.k(sb, this.collectFilter, ')');
    }

    public C0652s0(boolean z8, int i9, String str) {
        G7.j.e(str, "collectFilter");
        this.enabled = z8;
        this.maxSendAmount = i9;
        this.collectFilter = str;
    }

    public /* synthetic */ C0652s0(boolean z8, int i9, String str, int i10, G7.f fVar) {
        this((i10 & 1) != 0 ? false : z8, i9, str);
    }

    public static /* synthetic */ void getCollectFilter$annotations() {
    }

    public static /* synthetic */ void getMaxSendAmount$annotations() {
    }
}
