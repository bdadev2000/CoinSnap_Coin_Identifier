package fc;

/* loaded from: classes3.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17778b;

    /* renamed from: c, reason: collision with root package name */
    public final f f17779c;

    public b(String str, long j3, f fVar) {
        this.a = str;
        this.f17778b = j3;
        this.f17779c = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.a;
        if (str != null ? str.equals(bVar.a) : bVar.a == null) {
            if (this.f17778b == bVar.f17778b) {
                f fVar = bVar.f17779c;
                f fVar2 = this.f17779c;
                if (fVar2 == null) {
                    if (fVar == null) {
                        return true;
                    }
                } else if (fVar2.equals(fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.f17778b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        f fVar = this.f17779c;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.f17778b + ", responseCode=" + this.f17779c + "}";
    }
}
