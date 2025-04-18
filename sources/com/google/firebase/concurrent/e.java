package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f28848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f28849c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f28850f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j2, long j3, TimeUnit timeUnit, int i2) {
        this.f28847a = i2;
        this.f28848b = delegatingScheduledExecutorService;
        this.f28849c = runnable;
        this.d = j2;
        this.e = j3;
        this.f28850f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$scheduleWithFixedDelay$11;
        ScheduledFuture lambda$scheduleAtFixedRate$8;
        switch (this.f28847a) {
            case 0:
                lambda$scheduleWithFixedDelay$11 = this.f28848b.lambda$scheduleWithFixedDelay$11(this.f28849c, this.d, this.e, this.f28850f, completer);
                return lambda$scheduleWithFixedDelay$11;
            default:
                lambda$scheduleAtFixedRate$8 = this.f28848b.lambda$scheduleAtFixedRate$8(this.f28849c, this.d, this.e, this.f28850f, completer);
                return lambda$scheduleAtFixedRate$8;
        }
    }
}
