package kc;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20636b;

    public a(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.f20636b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && this.f20636b.equals(aVar.f20636b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f20636b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.a);
        sb2.append(", version=");
        return vd.e.h(sb2, this.f20636b, "}");
    }
}
