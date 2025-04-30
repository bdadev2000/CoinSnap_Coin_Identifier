package v1;

import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: v1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2836B {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f23458e = Executors.newCachedThreadPool(new H1.d());

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23459a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f23460c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile z f23461d = null;

    public C2836B(i iVar) {
        d(new z(iVar));
    }

    public final synchronized void a(x xVar) {
        Throwable th;
        try {
            z zVar = this.f23461d;
            if (zVar != null && (th = zVar.b) != null) {
                xVar.onResult(th);
            }
            this.b.add(xVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(x xVar) {
        Object obj;
        try {
            z zVar = this.f23461d;
            if (zVar != null && (obj = zVar.f23601a) != null) {
                xVar.onResult(obj);
            }
            this.f23459a.add(xVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        z zVar = this.f23461d;
        if (zVar == null) {
            return;
        }
        Object obj = zVar.f23601a;
        if (obj != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f23459a).iterator();
                while (it.hasNext()) {
                    ((x) it.next()).onResult(obj);
                }
            }
            return;
        }
        Throwable th = zVar.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                H1.c.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((x) it2.next()).onResult(th);
            }
        }
    }

    public final void d(z zVar) {
        if (this.f23461d == null) {
            this.f23461d = zVar;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c();
                return;
            } else {
                this.f23460c.post(new L(this, 11));
                return;
            }
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [v1.A, java.util.concurrent.FutureTask, java.lang.Runnable] */
    public C2836B(Callable callable, boolean z8) {
        if (z8) {
            try {
                d((z) callable.call());
                return;
            } catch (Throwable th) {
                d(new z(th));
                return;
            }
        }
        ExecutorService executorService = f23458e;
        ?? futureTask = new FutureTask(callable);
        futureTask.b = this;
        executorService.execute(futureTask);
    }
}
