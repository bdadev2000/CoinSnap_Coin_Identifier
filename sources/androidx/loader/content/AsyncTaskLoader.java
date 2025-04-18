package androidx.loader.content;

import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {

    /* renamed from: b, reason: collision with root package name */
    public volatile LoadTask f20252b;

    /* renamed from: c, reason: collision with root package name */
    public volatile LoadTask f20253c;

    /* loaded from: classes3.dex */
    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        public final CountDownLatch f20254h = new CountDownLatch(1);

        public LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final Object a(Object[] objArr) {
            try {
                return AsyncTaskLoader.this.d();
            } catch (OperationCanceledException e) {
                if (this.d.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void b(Object obj) {
            CountDownLatch countDownLatch = this.f20254h;
            try {
                AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
                asyncTaskLoader.f(obj);
                if (asyncTaskLoader.f20253c == this) {
                    if (asyncTaskLoader.f20256a) {
                        asyncTaskLoader.getClass();
                        asyncTaskLoader.getClass();
                    }
                    SystemClock.uptimeMillis();
                    asyncTaskLoader.f20253c = null;
                    asyncTaskLoader.c();
                }
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(Object obj) {
            try {
                AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
                if (asyncTaskLoader.f20252b != this) {
                    asyncTaskLoader.f(obj);
                    if (asyncTaskLoader.f20253c == this) {
                        if (asyncTaskLoader.f20256a) {
                            asyncTaskLoader.getClass();
                            asyncTaskLoader.getClass();
                        }
                        SystemClock.uptimeMillis();
                        asyncTaskLoader.f20253c = null;
                        asyncTaskLoader.c();
                    }
                } else {
                    asyncTaskLoader.getClass();
                    asyncTaskLoader.f20256a = false;
                    SystemClock.uptimeMillis();
                    asyncTaskLoader.f20252b = null;
                    asyncTaskLoader.a(obj);
                }
            } finally {
                this.f20254h.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsyncTaskLoader.this.c();
        }
    }

    public void b() {
    }

    public final void c() {
        if (this.f20253c != null || this.f20252b == null) {
            return;
        }
        this.f20252b.getClass();
        LoadTask loadTask = this.f20252b;
        if (loadTask.f20260c == ModernAsyncTask.Status.f20268a) {
            loadTask.f20260c = ModernAsyncTask.Status.f20269b;
            loadTask.f20258a.f20271a = null;
            throw null;
        }
        int ordinal = loadTask.f20260c.ordinal();
        if (ordinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (ordinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public abstract Object d();

    public final boolean e() {
        if (this.f20252b == null) {
            return false;
        }
        if (this.f20253c != null) {
            this.f20252b.getClass();
            this.f20252b = null;
            return false;
        }
        this.f20252b.getClass();
        LoadTask loadTask = this.f20252b;
        loadTask.d.set(true);
        boolean cancel = loadTask.f20259b.cancel(false);
        if (cancel) {
            this.f20253c = this.f20252b;
            b();
        }
        this.f20252b = null;
        return cancel;
    }

    public void f(Object obj) {
    }

    public final void g() {
        e();
        this.f20252b = new LoadTask();
        c();
    }
}
