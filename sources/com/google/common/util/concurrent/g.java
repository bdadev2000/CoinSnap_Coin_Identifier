package com.google.common.util.concurrent;

import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28810b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f28809a = i2;
        this.f28810b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28809a;
        Object obj = this.f28810b;
        switch (i2) {
            case 0:
                JdkFutureAdapters.ListenableFutureAdapter.b((JdkFutureAdapters.ListenableFutureAdapter) obj);
                return;
            default:
                WrappingExecutorService.a((Callable) obj);
                return;
        }
    }
}
