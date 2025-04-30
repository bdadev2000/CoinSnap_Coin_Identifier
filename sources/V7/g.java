package V7;

/* loaded from: classes3.dex */
public final class g extends RuntimeException {
    public final transient w7.k b;

    public g(w7.k kVar) {
        this.b = kVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.b.toString();
    }
}
