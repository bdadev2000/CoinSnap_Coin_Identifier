package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SingleProcessDataStore f19033a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19035c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.f19035c = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19034b = obj;
        this.d |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
        return this.f19035c.e(this);
    }
}
