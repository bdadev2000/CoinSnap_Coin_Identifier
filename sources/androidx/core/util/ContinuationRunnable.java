package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
