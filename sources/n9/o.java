package n9;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public abstract class o {
    public static final Object a = new Object();

    public static String a(String str, Throwable th2) {
        boolean z10;
        String replace;
        synchronized (a) {
            try {
                if (th2 == null) {
                    replace = null;
                } else {
                    Throwable th3 = th2;
                    while (true) {
                        if (th3 != null) {
                            if (th3 instanceof UnknownHostException) {
                                z10 = true;
                                break;
                            }
                            th3 = th3.getCause();
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        replace = "UnknownHostException (no network)";
                    } else {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder n10 = eb.j.n(str, "\n  ");
            n10.append(replace.replace("\n", "\n  "));
            n10.append('\n');
            return n10.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            Log.i(str, str2);
        }
    }

    public static void f(String str, String str2) {
        synchronized (a) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }
}
