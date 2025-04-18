package androidx.work;

/* loaded from: classes.dex */
public final class t extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final Throwable f2235i;

    public t(Throwable th2) {
        this.f2235i = th2;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.f2235i.getMessage());
    }
}
