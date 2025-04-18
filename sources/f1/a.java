package f1;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient e1.i f30450a;

    public a(e1.i iVar) {
        super("Flow was aborted, no more elements needed");
        this.f30450a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
