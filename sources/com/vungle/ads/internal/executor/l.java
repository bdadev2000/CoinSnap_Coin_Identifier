package com.vungle.ads.internal.executor;

import com.applovin.impl.sdk.g0;
import com.vungle.ads.d2;
import com.vungle.ads.internal.util.v;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends ThreadPoolExecutor {
    public static final i Companion = new i(null);
    private static final String TAG = "VungleThreadPool";

    public l(int i10, int i11, long j3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i10, i11, j3, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m25execute$lambda0() {
        new d2("execute error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m26submit$lambda1() {
        new d2("submit error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m27submit$lambda2() {
        new d2("submit error with error").logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        j wrappedRunnableWithFail;
        Intrinsics.checkNotNullParameter(command, "command");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(command, new g0(19));
            super.execute(wrappedRunnableWithFail);
        } catch (Exception e2) {
            v.Companion.e(TAG, "execute error: " + e2);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        j wrappedRunnableWithFail;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(task, new g0(21));
            Future<?> submit = super.submit(wrappedRunnableWithFail);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (Exception e2) {
            v.Companion.e(TAG, "submit error: " + e2);
            return new c(null);
        }
    }

    public final void execute(Runnable command, Runnable fail) {
        j wrappedRunnableWithFail;
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(command, fail);
            super.execute(wrappedRunnableWithFail);
        } catch (Exception e2) {
            v.Companion.e(TAG, "execute error with fail: " + e2);
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T t5) {
        j wrappedRunnableWithFail;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(task, new g0(20));
            Future<T> submit = super.submit((Runnable) wrappedRunnableWithFail, (j) t5);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…     }, result)\n        }");
            return submit;
        } catch (Exception e2) {
            v.Companion.e(TAG, "submit error with result: " + e2);
            return new c(null);
        }
    }

    public final Future<?> submit(Runnable task, Runnable fail) {
        j wrappedRunnableWithFail;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            wrappedRunnableWithFail = Companion.getWrappedRunnableWithFail(task, fail);
            Future<?> submit = super.submit(wrappedRunnableWithFail);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…il(task, fail))\n        }");
            return submit;
        } catch (Exception e2) {
            v.Companion.e(TAG, "submit error with fail: " + e2);
            fail.run();
            return new c(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        Callable<T> wrappedCallableWithFallback;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            wrappedCallableWithFallback = Companion.getWrappedCallableWithFallback(task, k.INSTANCE);
            Future<T> submit = super.submit(wrappedCallableWithFallback);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (Exception e2) {
            v.Companion.e(TAG, "submit callable: " + e2);
            return new c(null);
        }
    }
}
