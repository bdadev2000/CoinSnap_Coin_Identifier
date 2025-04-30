package com.vungle.ads.internal.executor;

import com.vungle.ads.F0;
import com.vungle.ads.internal.util.v;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l extends ThreadPoolExecutor {
    public static final i Companion = new i(null);
    private static final String TAG = "VungleThreadPool";

    public l(int i9, int i10, long j7, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i9, i10, j7, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a() {
        m47submit$lambda1();
    }

    public static /* synthetic */ void b() {
        m46execute$lambda0();
    }

    public static /* synthetic */ void c() {
        m48submit$lambda2();
    }

    /* renamed from: execute$lambda-0 */
    public static final void m46execute$lambda0() {
        new F0("execute error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* renamed from: submit$lambda-1 */
    public static final void m47submit$lambda1() {
        new F0("submit error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* renamed from: submit$lambda-2 */
    public static final void m48submit$lambda2() {
        new F0("submit error with error").logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j wrappedRunnableWithFail;
        G7.j.e(runnable, "command");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(runnable, new C2.b(18));
            super.execute(wrappedRunnableWithFail);
        } catch (Exception e4) {
            v.Companion.e(TAG, "execute error: " + e4);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        j wrappedRunnableWithFail;
        G7.j.e(runnable, "task");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(runnable, new C2.b(19));
            Future<?> submit = super.submit(wrappedRunnableWithFail);
            G7.j.d(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (Exception e4) {
            v.Companion.e(TAG, "submit error: " + e4);
            return new c(null);
        }
    }

    public final void execute(Runnable runnable, Runnable runnable2) {
        j wrappedRunnableWithFail;
        G7.j.e(runnable, "command");
        G7.j.e(runnable2, "fail");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(runnable, runnable2);
            super.execute(wrappedRunnableWithFail);
        } catch (Exception e4) {
            v.Companion.e(TAG, "execute error with fail: " + e4);
            runnable2.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t9) {
        j wrappedRunnableWithFail;
        G7.j.e(runnable, "task");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(runnable, new C2.b(17));
            Future<T> submit = super.submit((Runnable) wrappedRunnableWithFail, (j) t9);
            G7.j.d(submit, "{\n            super.subm…     }, result)\n        }");
            return submit;
        } catch (Exception e4) {
            v.Companion.e(TAG, "submit error with result: " + e4);
            return new c(null);
        }
    }

    public final Future<?> submit(Runnable runnable, Runnable runnable2) {
        j wrappedRunnableWithFail;
        G7.j.e(runnable, "task");
        G7.j.e(runnable2, "fail");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(runnable, runnable2);
            Future<?> submit = super.submit(wrappedRunnableWithFail);
            G7.j.d(submit, "{\n            super.subm…il(task, fail))\n        }");
            return submit;
        } catch (Exception e4) {
            v.Companion.e(TAG, "submit error with fail: " + e4);
            runnable2.run();
            return new c(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        Callable<T> wrappedCallableWithFallback;
        G7.j.e(callable, "task");
        try {
            wrappedCallableWithFallback = Companion.getWrappedCallableWithFallback(callable, k.INSTANCE);
            Future<T> submit = super.submit(wrappedCallableWithFallback);
            G7.j.d(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (Exception e4) {
            v.Companion.e(TAG, "submit callable: " + e4);
            return new c(null);
        }
    }
}
