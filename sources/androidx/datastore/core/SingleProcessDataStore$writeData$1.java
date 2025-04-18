package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$writeData$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SingleProcessDataStore f19055a;

    /* renamed from: b, reason: collision with root package name */
    public File f19056b;

    /* renamed from: c, reason: collision with root package name */
    public FileOutputStream f19057c;
    public FileOutputStream d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f19058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19059g;

    /* renamed from: h, reason: collision with root package name */
    public int f19060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$writeData$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.f19059g = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19058f = obj;
        this.f19060h |= Integer.MIN_VALUE;
        return this.f19059g.j(null, this);
    }
}
