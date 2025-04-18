package l6;

import com.bumptech.glide.e;
import com.facebook.appevents.g;
import j6.c;
import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final ni.a f21138b = new ni.a();

    /* renamed from: c, reason: collision with root package name */
    public static a f21139c;
    public final Thread.UncaughtExceptionHandler a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t5, Throwable e2) {
        Intrinsics.checkNotNullParameter(t5, "t");
        Intrinsics.checkNotNullParameter(e2, "e");
        boolean z10 = false;
        if (e2 != null) {
            Throwable th2 = null;
            Throwable th3 = e2;
            loop0: while (true) {
                if (th3 == null || th3 == th2) {
                    break;
                }
                StackTraceElement[] stackTrace = th3.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
                int length = stackTrace.length;
                int i10 = 0;
                while (i10 < length) {
                    StackTraceElement element = stackTrace[i10];
                    i10++;
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    if (g.v(element)) {
                        z10 = true;
                        break loop0;
                    }
                }
                th2 = th3;
                th3 = th3.getCause();
            }
        }
        if (z10) {
            e.w(e2);
            j6.a t10 = j6.a.CrashReport;
            Intrinsics.checkNotNullParameter(t10, "t");
            new c(e2, t10).c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t5, e2);
        }
    }
}
