package c7;

/* renamed from: c7.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0647p0 {
    public static final C0645o0 Companion = new C0645o0(null);
    private final int refreshTime;

    public C0647p0(int i9) {
        this.refreshTime = i9;
    }

    public static /* synthetic */ C0647p0 copy$default(C0647p0 c0647p0, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = c0647p0.refreshTime;
        }
        return c0647p0.copy(i9);
    }

    public static final void write$Self(C0647p0 c0647p0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0647p0, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.C(0, c0647p0.refreshTime, gVar);
    }

    public final int component1() {
        return this.refreshTime;
    }

    public final C0647p0 copy(int i9) {
        return new C0647p0(i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0647p0) && this.refreshTime == ((C0647p0) obj).refreshTime) {
            return true;
        }
        return false;
    }

    public final int getRefreshTime() {
        return this.refreshTime;
    }

    public int hashCode() {
        return Integer.hashCode(this.refreshTime);
    }

    public String toString() {
        return com.mbridge.msdk.foundation.entity.o.l(new StringBuilder("ConfigSettings(refreshTime="), this.refreshTime, ')');
    }

    public /* synthetic */ C0647p0(int i9, int i10, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.refreshTime = i10;
        } else {
            e8.W.h(i9, 1, C0643n0.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ void getRefreshTime$annotations() {
    }
}
