package c4;

/* loaded from: classes2.dex */
public final class d extends c {
    private static final long serialVersionUID = 0;
    public final Object b;

    public d(Object obj) {
        this.b = obj;
    }

    @Override // c4.c
    public final Object a() {
        return this.b;
    }

    @Override // c4.c
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.b.equals(((d) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
