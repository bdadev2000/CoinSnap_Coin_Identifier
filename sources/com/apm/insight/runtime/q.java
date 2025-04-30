package com.apm.insight.runtime;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static long f6062a = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static long f6063a = -1;

        public static long a() {
            if (q.f6062a == -1) {
                long unused = q.f6062a = 1000 / b();
            }
            return q.f6062a;
        }

        public static long b() {
            return a(100L);
        }

        public static long a(long j7) {
            long j9 = f6063a;
            if (j9 > 0) {
                return j9;
            }
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf > 0) {
                j7 = sysconf;
            }
            f6063a = j7;
            return j7;
        }

        private static long a(String str, long j7) {
            try {
                int i9 = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField("os").get(null), Integer.valueOf(i9))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j7;
            }
        }
    }
}
