package Q7;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class V extends CancellationException {
    public final transient U b;

    public V(String str, Throwable th, U u8) {
        super(str);
        this.b = u8;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof V) {
                V v6 = (V) obj;
                if (!G7.j.a(v6.getMessage(), getMessage()) || !G7.j.a(v6.b, this.b) || !G7.j.a(v6.getCause(), getCause())) {
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
        int i9;
        String message = getMessage();
        G7.j.b(message);
        int hashCode = (this.b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i9 = cause.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.b;
    }
}
