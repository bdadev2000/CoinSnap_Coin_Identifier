package com.vungle.ads.internal.executor;

import U4.CallableC0313i;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class i {
    public /* synthetic */ i(G7.f fVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Callable<T> getWrappedCallableWithFallback(Callable<T> callable, F7.a aVar) {
        return new CallableC0313i(2, callable, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
    public static final Object m44getWrappedCallableWithFallback$lambda0(Callable callable, F7.a aVar) {
        G7.j.e(callable, "$command");
        G7.j.e(aVar, "$failFallback");
        try {
            return callable.call();
        } catch (OutOfMemoryError unused) {
            aVar.invoke();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j getWrappedRunnableWithFail(Runnable runnable, Runnable runnable2) {
        if (runnable instanceof com.vungle.ads.internal.task.l) {
            return new g(runnable, runnable2);
        }
        return new h(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }

    private i() {
    }
}
