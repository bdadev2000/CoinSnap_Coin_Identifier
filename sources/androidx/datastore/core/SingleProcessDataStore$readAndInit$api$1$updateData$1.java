package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f19026a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19027b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19028c;
    public f0 d;

    /* renamed from: f, reason: collision with root package name */
    public SingleProcessDataStore f19029f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f19030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 f19031h;

    /* renamed from: i, reason: collision with root package name */
    public int f19032i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, g gVar) {
        super(gVar);
        this.f19031h = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19030g = obj;
        this.f19032i |= Integer.MIN_VALUE;
        return this.f19031h.a(null, this);
    }
}
