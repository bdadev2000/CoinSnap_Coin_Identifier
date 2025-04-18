package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f28839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28840c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j2, TimeUnit timeUnit, int i2) {
        this.f28838a = i2;
        this.f28839b = delegatingScheduledExecutorService;
        this.e = obj;
        this.f28840c = j2;
        this.d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        int i2 = this.f28838a;
        Object obj = this.e;
        switch (i2) {
            case 0:
                return DelegatingScheduledExecutorService.h(this.f28839b, (Callable) obj, this.f28840c, this.d, completer);
            default:
                return DelegatingScheduledExecutorService.a(this.f28839b, (Runnable) obj, this.f28840c, this.d, completer);
        }
    }
}
