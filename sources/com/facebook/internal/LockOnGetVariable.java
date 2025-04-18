package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class LockOnGetVariable<T> {

    @Nullable
    private CountDownLatch initLatch;

    @Nullable
    private T storedValue;

    public LockOnGetVariable(T t2) {
        this.storedValue = t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final Void m529_init_$lambda0(LockOnGetVariable lockOnGetVariable, Callable callable) {
        p0.a.s(lockOnGetVariable, "this$0");
        p0.a.s(callable, "$callable");
        try {
            lockOnGetVariable.storedValue = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = lockOnGetVariable.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void waitOnInit() {
        CountDownLatch countDownLatch = this.initLatch;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    @Nullable
    public final T getValue() {
        waitOnInit();
        return this.storedValue;
    }

    public LockOnGetVariable(@NotNull final Callable<T> callable) {
        p0.a.s(callable, "callable");
        this.initLatch = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m529_init_$lambda0;
                m529_init_$lambda0 = LockOnGetVariable.m529_init_$lambda0(LockOnGetVariable.this, callable);
                return m529_init_$lambda0;
            }
        }));
    }
}
