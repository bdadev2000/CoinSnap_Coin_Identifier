package j3;

/* loaded from: classes.dex */
public final class o extends z {

    /* renamed from: a, reason: collision with root package name */
    public final y f21080a = y.b;
    public final AbstractC2386a b;

    public o(m mVar) {
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        y yVar = this.f21080a;
        if (yVar != null ? yVar.equals(((o) zVar).f21080a) : ((o) zVar).f21080a == null) {
            AbstractC2386a abstractC2386a = this.b;
            if (abstractC2386a == null) {
                if (((o) zVar).b == null) {
                    return true;
                }
            } else if (abstractC2386a.equals(((o) zVar).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        y yVar = this.f21080a;
        if (yVar == null) {
            hashCode = 0;
        } else {
            hashCode = yVar.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        AbstractC2386a abstractC2386a = this.b;
        if (abstractC2386a != null) {
            i9 = abstractC2386a.hashCode();
        }
        return i9 ^ i10;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f21080a + ", androidClientInfo=" + this.b + "}";
    }
}
