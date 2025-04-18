package androidx.lifecycle;

import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_release")
/* loaded from: classes4.dex */
public final class CoroutineLiveData$clearSource$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public CoroutineLiveData f19945a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineLiveData f19947c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$clearSource$1(CoroutineLiveData coroutineLiveData, g gVar) {
        super(gVar);
        this.f19947c = coroutineLiveData;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19946b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19947c.j(this);
    }
}
