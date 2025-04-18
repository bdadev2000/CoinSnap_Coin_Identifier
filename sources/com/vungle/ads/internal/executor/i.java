package com.vungle.ads.internal.executor;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    private i() {
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Callable<T> getWrappedCallableWithFallback(Callable<T> callable, Function0<Unit> function0) {
        return new m3.f(6, callable, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
    public static final Object m23getWrappedCallableWithFallback$lambda0(Callable command, Function0 failFallback) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(failFallback, "$failFallback");
        try {
            return command.call();
        } catch (OutOfMemoryError unused) {
            failFallback.invoke();
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
}
