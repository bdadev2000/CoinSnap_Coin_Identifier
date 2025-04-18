package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20085a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f20087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(p pVar, g gVar) {
        super(2, gVar);
        this.f20087c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(this.f20087c, gVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.f20086b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20085a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f20086b;
            this.f20085a = 1;
            if (this.f20087c.invoke(d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
