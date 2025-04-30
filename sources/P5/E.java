package p5;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f22258a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22259c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22260d;

    public E(String str, String str2, int i9, long j7) {
        G7.j.e(str, "sessionId");
        G7.j.e(str2, "firstSessionId");
        this.f22258a = str;
        this.b = str2;
        this.f22259c = i9;
        this.f22260d = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        if (G7.j.a(this.f22258a, e4.f22258a) && G7.j.a(this.b, e4.b) && this.f22259c == e4.f22259c && this.f22260d == e4.f22260d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22260d) + ((Integer.hashCode(this.f22259c) + AbstractC2914a.b(this.f22258a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f22258a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.f22259c + ", sessionStartTimestampUs=" + this.f22260d + ')';
    }
}
