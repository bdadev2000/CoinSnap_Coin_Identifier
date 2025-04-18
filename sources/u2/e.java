package u2;

/* loaded from: classes.dex */
public final class e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25447b;

    public e(String str, int i10) {
        this.a = str;
        this.f25447b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f25447b != eVar.f25447b) {
            return false;
        }
        return this.a.equals(eVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f25447b;
    }
}
