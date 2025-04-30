package c7;

/* loaded from: classes3.dex */
public final class N0 {
    public static final M0 Companion = new M0(null);
    private final boolean enabled;
    private final int limit;
    private final int timeout;

    public /* synthetic */ N0(int i9, boolean z8, int i10, int i11, e8.g0 g0Var) {
        if (7 != (i9 & 7)) {
            e8.W.h(i9, 7, L0.INSTANCE.getDescriptor());
            throw null;
        }
        this.enabled = z8;
        this.limit = i10;
        this.timeout = i11;
    }

    public static /* synthetic */ N0 copy$default(N0 n02, boolean z8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z8 = n02.enabled;
        }
        if ((i11 & 2) != 0) {
            i9 = n02.limit;
        }
        if ((i11 & 4) != 0) {
            i10 = n02.timeout;
        }
        return n02.copy(z8, i9, i10);
    }

    public static final void write$Self(N0 n02, d8.b bVar, c8.g gVar) {
        G7.j.e(n02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.v(gVar, 0, n02.enabled);
        bVar.C(1, n02.limit, gVar);
        bVar.C(2, n02.timeout, gVar);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.limit;
    }

    public final int component3() {
        return this.timeout;
    }

    public final N0 copy(boolean z8, int i9, int i10) {
        return new N0(z8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        if (this.enabled == n02.enabled && this.limit == n02.limit && this.timeout == n02.timeout) {
            return true;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getTimeout() {
        return this.timeout;
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
        return Integer.hashCode(this.timeout) + ((Integer.hashCode(this.limit) + (r02 * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Session(enabled=");
        sb.append(this.enabled);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", timeout=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.timeout, ')');
    }

    public N0(boolean z8, int i9, int i10) {
        this.enabled = z8;
        this.limit = i9;
        this.timeout = i10;
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    public static /* synthetic */ void getLimit$annotations() {
    }

    public static /* synthetic */ void getTimeout$annotations() {
    }
}
