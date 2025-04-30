package h3;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2318a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20582a;
    public final d b;

    /* renamed from: c, reason: collision with root package name */
    public final b f20583c;

    public C2318a(Object obj, d dVar, b bVar) {
        if (obj != null) {
            this.f20582a = obj;
            this.b = dVar;
            this.f20583c = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2318a)) {
            return false;
        }
        C2318a c2318a = (C2318a) obj;
        c2318a.getClass();
        if (this.f20582a.equals(c2318a.f20582a) && this.b.equals(c2318a.b)) {
            b bVar = c2318a.f20583c;
            b bVar2 = this.f20583c;
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
        int hashCode2 = ((((1000003 * 1000003) ^ this.f20582a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        b bVar = this.f20583c;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return (hashCode2 ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f20582a + ", priority=" + this.b + ", productData=" + this.f20583c + ", eventContext=null}";
    }
}
