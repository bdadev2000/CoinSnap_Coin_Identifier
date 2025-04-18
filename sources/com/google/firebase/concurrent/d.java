package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f28845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f28846c;
    public final /* synthetic */ DelegatingScheduledFuture.Completer d;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i2) {
        this.f28844a = i2;
        this.f28845b = delegatingScheduledExecutorService;
        this.f28846c = runnable;
        this.d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28844a;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f28845b;
        DelegatingScheduledFuture.Completer completer = this.d;
        Runnable runnable = this.f28846c;
        switch (i2) {
            case 0:
                delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable, completer);
                return;
            case 1:
                delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable, completer);
                return;
            default:
                delegatingScheduledExecutorService.lambda$schedule$1(runnable, completer);
                return;
        }
    }
}
