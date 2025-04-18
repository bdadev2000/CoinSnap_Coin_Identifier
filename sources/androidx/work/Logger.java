package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static Logger f21879a;

    /* loaded from: classes2.dex */
    public static class LogcatLogger extends Logger {

        /* renamed from: b, reason: collision with root package name */
        public final int f21880b;

        public LogcatLogger(int i2) {
            this.f21880b = i2;
        }

        @Override // androidx.work.Logger
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f21880b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f21880b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f21880b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public final void f(String str, Throwable... thArr) {
            if (this.f21880b <= 2) {
                if (thArr.length >= 1) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.", thArr[0]);
                } else {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
            }
        }

        @Override // androidx.work.Logger
        public final void g(String str, String str2, Throwable... thArr) {
            if (this.f21880b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized Logger c() {
        Logger logger;
        synchronized (Logger.class) {
            try {
                if (f21879a == null) {
                    f21879a = new LogcatLogger(3);
                }
                logger = f21879a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return logger;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);
}
