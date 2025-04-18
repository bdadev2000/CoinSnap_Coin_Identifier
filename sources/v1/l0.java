package v1;

import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends LiveData {
    public final f0 a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.g f25917b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25918c;

    /* renamed from: d, reason: collision with root package name */
    public final Callable f25919d;

    /* renamed from: e, reason: collision with root package name */
    public final d f25920e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25921f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25922g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f25923h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f25924i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f25925j;

    public l0(f0 database, d3.g container, Callable computeFunction, String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.a = database;
        this.f25917b = container;
        this.f25918c = false;
        this.f25919d = computeFunction;
        this.f25920e = new d(tableNames, this, 2);
        this.f25921f = new AtomicBoolean(true);
        this.f25922g = new AtomicBoolean(false);
        this.f25923h = new AtomicBoolean(false);
        this.f25924i = new k0(this, 0);
        this.f25925j = new k0(this, 1);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Executor queryExecutor;
        super.onActive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        d3.g gVar = this.f25917b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ((Set) gVar.f16813d).add(this);
        boolean z10 = this.f25918c;
        f0 f0Var = this.a;
        if (z10) {
            queryExecutor = f0Var.getTransactionExecutor();
        } else {
            queryExecutor = f0Var.getQueryExecutor();
        }
        queryExecutor.execute(this.f25924i);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        d3.g gVar = this.f25917b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ((Set) gVar.f16813d).remove(this);
    }
}
