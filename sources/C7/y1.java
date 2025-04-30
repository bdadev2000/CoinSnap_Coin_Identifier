package c7;

/* loaded from: classes3.dex */
public final class y1 {
    public static final x1 Companion = new x1(null);
    private final String eventId;
    private String sessionId;

    public /* synthetic */ y1(int i9, String str, String str2, e8.g0 g0Var) {
        if (1 != (i9 & 1)) {
            e8.W.h(i9, 1, w1.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = str;
        if ((i9 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ y1 copy$default(y1 y1Var, String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = y1Var.eventId;
        }
        if ((i9 & 2) != 0) {
            str2 = y1Var.sessionId;
        }
        return y1Var.copy(str, str2);
    }

    public static final void write$Self(y1 y1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(y1Var, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.k(gVar, 0, y1Var.eventId);
        if (bVar.o(gVar) || !G7.j.a(y1Var.sessionId, "")) {
            bVar.k(gVar, 1, y1Var.sessionId);
        }
    }

    public final String component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final y1 copy(String str, String str2) {
        G7.j.e(str, "eventId");
        G7.j.e(str2, "sessionId");
        return new y1(str, str2);
    }

    public boolean equals(Object obj) {
        if (obj == null || !y1.class.equals(obj.getClass())) {
            return false;
        }
        y1 y1Var = (y1) obj;
        if (!G7.j.a(this.eventId, y1Var.eventId) || !G7.j.a(this.sessionId, y1Var.sessionId)) {
            return false;
        }
        return true;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.eventId.hashCode() * 31);
    }

    public final void setSessionId(String str) {
        G7.j.e(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnclosedAd(eventId=");
        sb.append(this.eventId);
        sb.append(", sessionId=");
        return com.applovin.impl.L.k(sb, this.sessionId, ')');
    }

    public y1(String str, String str2) {
        G7.j.e(str, "eventId");
        G7.j.e(str2, "sessionId");
        this.eventId = str;
        this.sessionId = str2;
    }

    public /* synthetic */ y1(String str, String str2, int i9, G7.f fVar) {
        this(str, (i9 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }
}
