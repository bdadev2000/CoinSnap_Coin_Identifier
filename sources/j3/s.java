package j3;

/* loaded from: classes.dex */
public final class s extends E {

    /* renamed from: a, reason: collision with root package name */
    public final D f21084a;

    public s(r rVar) {
        this.f21084a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        D d2 = this.f21084a;
        s sVar = (s) ((E) obj);
        if (d2 == null) {
            if (sVar.f21084a == null) {
                return true;
            }
            return false;
        }
        return d2.equals(sVar.f21084a);
    }

    public final int hashCode() {
        int hashCode;
        D d2 = this.f21084a;
        if (d2 == null) {
            hashCode = 0;
        } else {
            hashCode = d2.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21084a + "}";
    }
}
