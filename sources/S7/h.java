package S7;

/* loaded from: classes3.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2841a;

    public h(Throwable th) {
        this.f2841a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (G7.j.a(this.f2841a, ((h) obj).f2841a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2841a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // S7.i
    public final String toString() {
        return "Closed(" + this.f2841a + ')';
    }
}
