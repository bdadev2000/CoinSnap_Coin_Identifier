package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SingleProcessDataStore f19036a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19038c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.f19038c = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19037b = obj;
        this.d |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
        return this.f19038c.f(this);
    }
}
