package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f28843c;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i2) {
        this.f28841a = i2;
        this.f28842b = runnable;
        this.f28843c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28841a;
        DelegatingScheduledFuture.Completer completer = this.f28843c;
        Runnable runnable = this.f28842b;
        switch (i2) {
            case 0:
                DelegatingScheduledExecutorService.i(runnable, completer);
                return;
            case 1:
                DelegatingScheduledExecutorService.b(runnable, completer);
                return;
            default:
                DelegatingScheduledExecutorService.k(runnable, completer);
                return;
        }
    }
}
