package h7;

/* loaded from: classes3.dex */
public final class o extends z {
    public final y a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18848b;

    public o(y yVar, a aVar) {
        this.a = yVar;
        this.f18848b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        y yVar = this.a;
        if (yVar != null ? yVar.equals(((o) zVar).a) : ((o) zVar).a == null) {
            a aVar = this.f18848b;
            if (aVar == null) {
                if (((o) zVar).f18848b == null) {
                    return true;
                }
            } else if (aVar.equals(((o) zVar).f18848b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        y yVar = this.a;
        if (yVar == null) {
            hashCode = 0;
        } else {
            hashCode = yVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        a aVar = this.f18848b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.f18848b + "}";
    }
}
