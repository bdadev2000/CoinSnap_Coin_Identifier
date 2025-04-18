package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableCollection;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28799c;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.f28797a = i2;
        this.f28798b = obj;
        this.f28799c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28797a;
        Object obj = this.f28799c;
        Object obj2 = this.f28798b;
        switch (i2) {
            case 0:
                AggregateFuture.b((AggregateFuture) obj2, (ImmutableCollection) obj);
                return;
            default:
                Callables.b((Supplier) obj2, (Runnable) obj);
                return;
        }
    }
}
