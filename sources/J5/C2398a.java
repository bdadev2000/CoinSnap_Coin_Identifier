package j5;

import x0.AbstractC2914a;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2398a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21103a;
    public final String b;

    public C2398a(String str, String str2) {
        this.f21103a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2398a)) {
            return false;
        }
        C2398a c2398a = (C2398a) obj;
        if (this.f21103a.equals(c2398a.f21103a) && this.b.equals(c2398a.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21103a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f21103a);
        sb.append(", version=");
        return AbstractC2914a.h(sb, this.b, "}");
    }
}
