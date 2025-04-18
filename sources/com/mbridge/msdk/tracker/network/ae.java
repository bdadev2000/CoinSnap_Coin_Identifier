package com.mbridge.msdk.tracker.network;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class ae {
    public static String a = "TrackManager_Volley";

    /* renamed from: b, reason: collision with root package name */
    private static final String f15416b = "com.mbridge.msdk.tracker.network.ae";

    /* loaded from: classes4.dex */
    public static class a {
        private final List<C0204a> a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15417b;

        /* renamed from: com.mbridge.msdk.tracker.network.ae$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0204a {
            public final String a;

            /* renamed from: b, reason: collision with root package name */
            public final long f15418b;

            /* renamed from: c, reason: collision with root package name */
            public final long f15419c;
        }

        public final void finalize() throws Throwable {
            long j3;
            if (!this.f15417b) {
                this.f15417b = true;
                if (this.a.size() == 0) {
                    j3 = 0;
                } else {
                    long j10 = this.a.get(0).f15419c;
                    List<C0204a> list = this.a;
                    j3 = list.get(list.size() - 1).f15419c - j10;
                }
                if (j3 > 0) {
                    long j11 = this.a.get(0).f15419c;
                    ae.b("(%-4d ms) %s", Long.valueOf(j3), "Request on the loose");
                    for (C0204a c0204a : this.a) {
                        long j12 = c0204a.f15419c;
                        ae.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(c0204a.f15418b), c0204a.a);
                        j11 = j12;
                    }
                }
                ae.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Object... objArr) {
        Log.d(a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 < stackTrace.length) {
                if (!stackTrace[i10].getClassName().equals(f15416b)) {
                    String className = stackTrace[i10].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    StringBuilder n10 = eb.j.n(substring.substring(substring.lastIndexOf(36) + 1), ".");
                    n10.append(stackTrace[i10].getMethodName());
                    str2 = n10.toString();
                    break;
                }
                i10++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void a(Throwable th2, String str, Object... objArr) {
        Log.e(a, d(str, objArr), th2);
    }
}
