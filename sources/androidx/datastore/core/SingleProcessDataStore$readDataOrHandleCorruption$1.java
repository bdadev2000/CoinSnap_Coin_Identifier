package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f19043a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19044b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19045c;
    public final /* synthetic */ SingleProcessDataStore d;

    /* renamed from: f, reason: collision with root package name */
    public int f19046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.d = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19045c = obj;
        this.f19046f |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
        return this.d.h(this);
    }
}
