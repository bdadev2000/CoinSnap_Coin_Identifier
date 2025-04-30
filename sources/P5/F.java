package p5;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final N f22261a;
    public final C2551b b;

    public F(N n2, C2551b c2551b) {
        this.f22261a = n2;
        this.b = c2551b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f9 = (F) obj;
        f9.getClass();
        if (G7.j.a(this.f22261a, f9.f22261a) && G7.j.a(this.b, f9.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f22261a.hashCode() + (EnumC2560k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC2560k.SESSION_START + ", sessionData=" + this.f22261a + ", applicationInfo=" + this.b + ')';
    }
}
