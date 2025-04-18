package ra;

/* loaded from: classes3.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24044b = new a();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f24044b;
    }

    @Override // ra.i
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // ra.i
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
