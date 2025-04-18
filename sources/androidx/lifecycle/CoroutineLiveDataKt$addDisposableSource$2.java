package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class CoroutineLiveDataKt$addDisposableSource$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f19952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveData f19953b;

    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData mediatorLiveData, LiveData liveData, g gVar) {
        super(2, gVar);
        this.f19952a = mediatorLiveData;
        this.f19953b = liveData;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.f19952a, this.f19953b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((CoroutineLiveDataKt$addDisposableSource$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        throw null;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        this.f19952a.getClass();
        if (this.f19953b == null) {
            throw new NullPointerException("source cannot be null");
        }
        throw null;
    }
}
