package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28859b;

    public /* synthetic */ i(Runnable runnable, int i2) {
        this.f28858a = i2;
        this.f28859b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$1;
        int i2 = this.f28858a;
        Runnable runnable = this.f28859b;
        switch (i2) {
            case 0:
                lambda$submit$1 = LimitedConcurrencyExecutorService.lambda$submit$1(runnable);
                return lambda$submit$1;
            default:
                return PausableExecutorServiceImpl.lambda$submit$1(runnable);
        }
    }
}
