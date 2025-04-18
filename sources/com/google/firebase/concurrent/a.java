package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28837c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f28835a = i2;
        this.f28836b = obj;
        this.f28837c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28835a;
        Object obj = this.f28837c;
        Object obj2 = this.f28836b;
        switch (i2) {
            case 0:
                ((CustomThreadFactory) obj2).lambda$newThread$0((Runnable) obj);
                return;
            case 1:
                DelegatingScheduledExecutorService.m((Callable) obj2, (DelegatingScheduledFuture.Completer) obj);
                return;
            default:
                LimitedConcurrencyExecutor.a((LimitedConcurrencyExecutor) obj2, (Runnable) obj);
                return;
        }
    }
}
