package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28857c;

    public /* synthetic */ h(Runnable runnable, Object obj, int i2) {
        this.f28855a = i2;
        this.f28856b = runnable;
        this.f28857c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = this.f28855a;
        Object obj = this.f28857c;
        Runnable runnable = this.f28856b;
        switch (i2) {
            case 0:
                return LimitedConcurrencyExecutorService.d(runnable, obj);
            default:
                return PausableExecutorServiceImpl.a(runnable, obj);
        }
    }
}
