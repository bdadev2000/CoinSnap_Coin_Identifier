package f7;

/* loaded from: classes3.dex */
public final class a {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final d f17685b;

    /* renamed from: c, reason: collision with root package name */
    public final b f17686c;

    public a(Object obj, d dVar, b bVar) {
        if (obj != null) {
            this.a = obj;
            this.f17685b = dVar;
            this.f17686c = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.a.equals(aVar.a) && this.f17685b.equals(aVar.f17685b)) {
            b bVar = aVar.f17686c;
            b bVar2 = this.f17686c;
            if (bVar2 == null) {
                if (bVar == null) {
                    return true;
                }
            } else if (bVar2.equals(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.f17685b.hashCode()) * 1000003;
        b bVar = this.f17686c;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ 0;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.f17685b + ", productData=" + this.f17686c + ", eventContext=null}";
    }
}
