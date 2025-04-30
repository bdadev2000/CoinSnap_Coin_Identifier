package U7;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class a extends CancellationException {
    public final transient Object b;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.b = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
