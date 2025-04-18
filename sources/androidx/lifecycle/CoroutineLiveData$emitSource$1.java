package androidx.lifecycle;

import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {228, 229}, m = "emitSource$lifecycle_livedata_release")
/* loaded from: classes4.dex */
public final class CoroutineLiveData$emitSource$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public CoroutineLiveData f19948a;

    /* renamed from: b, reason: collision with root package name */
    public LiveData f19949b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19950c;
    public final /* synthetic */ CoroutineLiveData d;

    /* renamed from: f, reason: collision with root package name */
    public int f19951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData coroutineLiveData, g gVar) {
        super(gVar);
        this.d = coroutineLiveData;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19950c = obj;
        this.f19951f |= Integer.MIN_VALUE;
        return this.d.k(null, this);
    }
}
