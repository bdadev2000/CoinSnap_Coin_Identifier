package c7;

import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public final class P {
    public static final O Companion = new O(null);
    private final String status;

    public /* synthetic */ P(int i9, String str, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.status = str;
        } else {
            e8.W.h(i9, 1, N.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ P copy$default(P p2, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = p2.status;
        }
        return p2.copy(str);
    }

    public static final void write$Self(P p2, d8.b bVar, c8.g gVar) {
        G7.j.e(p2, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.k(gVar, 0, p2.status);
    }

    public final String component1() {
        return this.status;
    }

    public final P copy(String str) {
        G7.j.e(str, NotificationCompat.CATEGORY_STATUS);
        return new P(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof P) && G7.j.a(this.status, ((P) obj).status)) {
            return true;
        }
        return false;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return com.applovin.impl.L.k(new StringBuilder("CCPA(status="), this.status, ')');
    }

    public P(String str) {
        G7.j.e(str, NotificationCompat.CATEGORY_STATUS);
        this.status = str;
    }
}
