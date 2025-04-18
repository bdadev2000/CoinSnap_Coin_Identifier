package he;

import java.lang.Thread;

/* loaded from: classes4.dex */
public final class z implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        a0.f19026e.a(2, "EXCEPTION:", "In the NoOpExceptionHandler, probably while destroying.", "Thread:", thread, "Error:", th2);
    }
}
