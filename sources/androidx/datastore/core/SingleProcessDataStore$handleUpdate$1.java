package androidx.datastore.core;

import b1.r;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$handleUpdate$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f19010a;

    /* renamed from: b, reason: collision with root package name */
    public SingleProcessDataStore f19011b;

    /* renamed from: c, reason: collision with root package name */
    public r f19012c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19013f;

    /* renamed from: g, reason: collision with root package name */
    public int f19014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.f19013f = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19014g |= Integer.MIN_VALUE;
        return SingleProcessDataStore.b(this.f19013f, null, this);
    }
}
