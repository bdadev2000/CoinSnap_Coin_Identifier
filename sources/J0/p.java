package j0;

import Q7.n0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.vungle.ads.L;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements i {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final F1.i f20990c;

    /* renamed from: d, reason: collision with root package name */
    public final R3.e f20991d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20992f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f20993g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f20994h;

    /* renamed from: i, reason: collision with root package name */
    public ThreadPoolExecutor f20995i;

    /* renamed from: j, reason: collision with root package name */
    public z2.i f20996j;

    public p(Context context, F1.i iVar) {
        R3.e eVar = q.f20997d;
        this.f20992f = new Object();
        C2.m.h(context, "Context cannot be null");
        this.b = context.getApplicationContext();
        this.f20990c = iVar;
        this.f20991d = eVar;
    }

    public final void a() {
        synchronized (this.f20992f) {
            try {
                this.f20996j = null;
                Handler handler = this.f20993g;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f20993g = null;
                ThreadPoolExecutor threadPoolExecutor = this.f20995i;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f20994h = null;
                this.f20995i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j0.i
    public final void b(z2.i iVar) {
        synchronized (this.f20992f) {
            this.f20996j = iVar;
        }
        c();
    }

    public final void c() {
        synchronized (this.f20992f) {
            try {
                if (this.f20996j == null) {
                    return;
                }
                if (this.f20994h == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2380a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f20995i = threadPoolExecutor;
                    this.f20994h = threadPoolExecutor;
                }
                this.f20994h.execute(new L(this, 7));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Q.g d() {
        try {
            R3.e eVar = this.f20991d;
            Context context = this.b;
            F1.i iVar = this.f20990c;
            eVar.getClass();
            B3.g a6 = Q.b.a(context, iVar);
            int i9 = a6.f285c;
            if (i9 == 0) {
                Q.g[] gVarArr = (Q.g[]) a6.f286d;
                if (gVarArr != null && gVarArr.length != 0) {
                    return gVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(n0.f(i9, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }
}
