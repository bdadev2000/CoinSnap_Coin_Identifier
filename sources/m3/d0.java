package m3;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f21524e = Executors.newCachedThreadPool();
    public final LinkedHashSet a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f21525b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21526c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f21527d = null;

    public d0(j jVar) {
        a(new b0(jVar));
    }

    public final void a(b0 b0Var) {
        if (this.f21527d == null) {
            this.f21527d = b0Var;
            this.f21526c.post(new androidx.activity.d(this, 11));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public d0(Callable callable, boolean z10) {
        if (z10) {
            try {
                a((b0) callable.call());
                return;
            } catch (Throwable th2) {
                a(new b0(th2));
                return;
            }
        }
        f21524e.execute(new c0(this, callable));
    }
}
