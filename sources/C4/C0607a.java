package c4;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0607a extends c {
    public static final C0607a b = new Object();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // c4.c
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // c4.c
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
