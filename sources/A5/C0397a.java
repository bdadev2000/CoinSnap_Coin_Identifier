package a5;

import android.util.Log;
import java.util.Locale;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0397a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0397a f4073c;

    /* renamed from: a, reason: collision with root package name */
    public final C0398b f4074a;
    public boolean b = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [a5.b, java.lang.Object] */
    public C0397a() {
        C0398b c0398b;
        synchronized (C0398b.class) {
            try {
                if (C0398b.b == null) {
                    C0398b.b = new Object();
                }
                c0398b = C0398b.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4074a = c0398b;
    }

    public static C0397a d() {
        if (f4073c == null) {
            synchronized (C0397a.class) {
                try {
                    if (f4073c == null) {
                        f4073c = new C0397a();
                    }
                } finally {
                }
            }
        }
        return f4073c;
    }

    public final void a(String str) {
        if (this.b) {
            this.f4074a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f4074a.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f4074a.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f4074a.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    public final void f(String str) {
        if (this.b) {
            this.f4074a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f4074a.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
