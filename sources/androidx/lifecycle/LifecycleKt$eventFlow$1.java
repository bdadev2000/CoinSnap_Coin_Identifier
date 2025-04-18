package androidx.lifecycle;

import d0.b0;
import d1.q;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.p;

@e(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {388}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LifecycleKt$eventFlow$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20009a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f20011c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LifecycleKt$eventFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f20012a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f20013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, b bVar) {
            super(0);
            this.f20012a = lifecycle;
            this.f20013b = bVar;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f20012a.d(this.f20013b);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, g gVar) {
        super(2, gVar);
        this.f20011c = lifecycle;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.f20011c, gVar);
        lifecycleKt$eventFlow$1.f20010b = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleKt$eventFlow$1) create((q) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20009a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            q qVar = (q) this.f20010b;
            b bVar = new b(qVar, 0);
            Lifecycle lifecycle = this.f20011c;
            lifecycle.a(bVar);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lifecycle, bVar);
            this.f20009a = 1;
            if (p0.a.j(qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
