package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.io.FileInputStream;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readData$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SingleProcessDataStore f19039a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f19040b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19041c;
    public final /* synthetic */ SingleProcessDataStore d;

    /* renamed from: f, reason: collision with root package name */
    public int f19042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readData$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.d = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19041c = obj;
        this.f19042f |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
        return this.d.g(this);
    }
}
