package androidx.activity.compose;

import b1.d0;
import e1.d;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.b0;
import q0.p;
import q0.q;

@e(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnBackInstance$job$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public b0 f231a;

    /* renamed from: b, reason: collision with root package name */
    public int f232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f233c;
    public final /* synthetic */ OnBackInstance d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f234a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b0 b0Var, g gVar) {
            super(3, gVar);
            this.f234a = b0Var;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f234a, (g) obj3);
            d0.b0 b0Var = d0.b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            kotlin.jvm.internal.q.m(obj);
            this.f234a.f30919a = true;
            return d0.b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(p pVar, OnBackInstance onBackInstance, g gVar) {
        super(2, gVar);
        this.f233c = pVar;
        this.d = onBackInstance;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new OnBackInstance$job$1(this.f233c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((OnBackInstance$job$1) create((d0) obj, (g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f232b;
        boolean z2 = true;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            ?? obj2 = new Object();
            e1.p pVar = new e1.p(new d(this.d.f229b, z2), new AnonymousClass1(obj2, null));
            this.f231a = obj2;
            this.f232b = 1;
            if (this.f233c.invoke(pVar, this) == aVar) {
                return aVar;
            }
            b0Var = obj2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = this.f231a;
            kotlin.jvm.internal.q.m(obj);
        }
        if (b0Var.f30919a) {
            return d0.b0.f30125a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }
}
