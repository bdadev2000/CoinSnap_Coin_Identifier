package p5;

/* renamed from: p5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2563n {

    /* renamed from: a, reason: collision with root package name */
    public final String f22352a;

    public C2563n(String str) {
        this.f22352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2563n) && G7.j.a(this.f22352a, ((C2563n) obj).f22352a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22352a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return com.applovin.impl.L.k(new StringBuilder("FirebaseSessionsData(sessionId="), this.f22352a, ')');
    }
}
