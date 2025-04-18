package ra;

/* loaded from: classes3.dex */
public final class l extends i {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24056b;

    public l(Object obj) {
        this.f24056b = obj;
    }

    @Override // ra.i
    public final Object a() {
        return this.f24056b;
    }

    @Override // ra.i
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f24056b.equals(((l) obj).f24056b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24056b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24056b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
