package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$transformAndWrite$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SingleProcessDataStore f19047a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19048b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19049c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19050f;

    /* renamed from: g, reason: collision with root package name */
    public int f19051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.f19050f = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19051g |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
        return this.f19050f.i(this, null, null);
    }
}
