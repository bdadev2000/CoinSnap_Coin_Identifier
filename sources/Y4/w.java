package Y4;

import a5.C0397a;
import android.content.Context;
import android.content.SharedPreferences;
import g4.C2296f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final C0397a f3813c = C0397a.d();

    /* renamed from: d, reason: collision with root package name */
    public static w f3814d;

    /* renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f3815a;
    public final ExecutorService b;

    public w(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            C2296f.c();
            C2296f c9 = C2296f.c();
            c9.a();
            return c9.f20433a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized w b() {
        w wVar;
        synchronized (w.class) {
            try {
                if (f3814d == null) {
                    f3814d = new w(Executors.newSingleThreadExecutor());
                }
                wVar = f3814d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public final synchronized void c(Context context) {
        if (this.f3815a == null && context != null) {
            this.b.execute(new A4.d(7, this, context));
        }
    }

    public final void d(long j7, String str) {
        if (this.f3815a == null) {
            c(a());
            if (this.f3815a == null) {
                return;
            }
        }
        this.f3815a.edit().putLong(str, j7).apply();
    }

    public final void e(String str, double d2) {
        if (this.f3815a == null) {
            c(a());
            if (this.f3815a == null) {
                return;
            }
        }
        this.f3815a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.f3815a == null) {
            c(a());
            if (this.f3815a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f3815a.edit().remove(str).apply();
        } else {
            this.f3815a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z8) {
        if (this.f3815a == null) {
            c(a());
            if (this.f3815a == null) {
                return;
            }
        }
        this.f3815a.edit().putBoolean(str, z8).apply();
    }
}
