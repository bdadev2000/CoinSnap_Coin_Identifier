package g1;

/* loaded from: classes2.dex */
public final class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient h0.l f30613a;

    public h(h0.l lVar) {
        this.f30613a = lVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f30613a.toString();
    }
}
