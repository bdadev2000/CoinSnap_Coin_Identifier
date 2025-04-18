package b1;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class i1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient h1 f22330a;

    public i1(String str, Throwable th, h1 h1Var) {
        super(str);
        this.f22330a = h1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i1) {
                i1 i1Var = (i1) obj;
                if (!p0.a.g(i1Var.getMessage(), getMessage()) || !p0.a.g(i1Var.f22330a, this.f22330a) || !p0.a.g(i1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        p0.a.p(message);
        int hashCode = (this.f22330a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f22330a;
    }
}
