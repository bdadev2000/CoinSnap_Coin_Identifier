package com.mbridge.msdk.tracker.network;

import android.util.Log;
import java.util.List;
import java.util.Locale;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static String f18159a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.tracker.network.ae";

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0192a> f18160a;
        private boolean b;

        /* renamed from: com.mbridge.msdk.tracker.network.ae$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0192a {

            /* renamed from: a, reason: collision with root package name */
            public final String f18161a;
            public final long b;

            /* renamed from: c, reason: collision with root package name */
            public final long f18162c;
        }

        public final void finalize() throws Throwable {
            long j7;
            if (!this.b) {
                this.b = true;
                if (this.f18160a.size() == 0) {
                    j7 = 0;
                } else {
                    long j9 = this.f18160a.get(0).f18162c;
                    List<C0192a> list = this.f18160a;
                    j7 = list.get(list.size() - 1).f18162c - j9;
                }
                if (j7 > 0) {
                    long j10 = this.f18160a.get(0).f18162c;
                    ae.b("(%-4d ms) %s", Long.valueOf(j7), "Request on the loose");
                    for (C0192a c0192a : this.f18160a) {
                        long j11 = c0192a.f18162c;
                        ae.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0192a.b), c0192a.f18161a);
                        j10 = j11;
                    }
                }
                ae.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Object... objArr) {
        Log.d(f18159a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f18159a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i9 = 2;
        while (true) {
            if (i9 < stackTrace.length) {
                if (!stackTrace[i9].getClassName().equals(b)) {
                    String className = stackTrace[i9].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    StringBuilder c9 = AbstractC2965e.c(substring.substring(substring.lastIndexOf(36) + 1), ".");
                    c9.append(stackTrace[i9].getMethodName());
                    str2 = c9.toString();
                    break;
                }
                i9++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return AbstractC2914a.h(sb, ": ", str);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f18159a, d(str, objArr), th);
    }
}
