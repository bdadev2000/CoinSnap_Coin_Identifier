package w4;

/* renamed from: w4.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2891m0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2893n0 f23918a;
    public final C2897p0 b;

    /* renamed from: c, reason: collision with root package name */
    public final C2895o0 f23919c;

    public C2891m0(C2893n0 c2893n0, C2897p0 c2897p0, C2895o0 c2895o0) {
        this.f23918a = c2893n0;
        this.b = c2897p0;
        this.f23919c = c2895o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2891m0)) {
            return false;
        }
        C2891m0 c2891m0 = (C2891m0) obj;
        if (this.f23918a.equals(c2891m0.f23918a) && this.b.equals(c2891m0.b) && this.f23919c.equals(c2891m0.f23919c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23918a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23919c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f23918a + ", osData=" + this.b + ", deviceData=" + this.f23919c + "}";
    }
}
