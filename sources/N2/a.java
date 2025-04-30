package N2;

import G7.j;
import L2.b;
import R3.e;
import com.facebook.appevents.g;
import com.facebook.appevents.i;
import com.facebook.appevents.n;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {
    public static final e b = new e(7);

    /* renamed from: c, reason: collision with root package name */
    public static a f2093c;

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f2094a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2094a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        j.e(thread, "t");
        j.e(th, "e");
        Throwable th2 = null;
        Throwable th3 = th;
        loop0: while (true) {
            if (th3 == null || th3 == th2) {
                break;
            }
            StackTraceElement[] stackTrace = th3.getStackTrace();
            j.d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i9 = 0;
            while (i9 < length) {
                StackTraceElement stackTraceElement = stackTrace[i9];
                i9++;
                j.d(stackTraceElement, "element");
                if (n.j(stackTraceElement)) {
                    g.h(th);
                    i.c(th, b.f1712f).b();
                    break loop0;
                }
            }
            th2 = th3;
            th3 = th3.getCause();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2094a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
