package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
