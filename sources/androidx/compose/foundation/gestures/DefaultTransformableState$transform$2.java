package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultTransformableState$transform$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultTransformableState f3165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f3166c;
    public final /* synthetic */ p d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", l = {252}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f3167a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DefaultTransformableState f3168b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f3169c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultTransformableState defaultTransformableState, p pVar, g gVar) {
            super(2, gVar);
            this.f3168b = defaultTransformableState;
            this.f3169c = pVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3168b, this.f3169c, gVar);
            anonymousClass1.f3167a = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((TransformScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            throw null;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            this.f3168b.getClass();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, p pVar, g gVar) {
        super(2, gVar);
        this.f3165b = defaultTransformableState;
        this.f3166c = mutatePriority;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DefaultTransformableState$transform$2(this.f3165b, this.f3166c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DefaultTransformableState$transform$2 defaultTransformableState$transform$2 = (DefaultTransformableState$transform$2) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        defaultTransformableState$transform$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3164a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return b0.f30125a;
        }
        q.m(obj);
        DefaultTransformableState defaultTransformableState = this.f3165b;
        defaultTransformableState.getClass();
        defaultTransformableState.getClass();
        new AnonymousClass1(defaultTransformableState, this.d, null);
        this.f3164a = 1;
        throw null;
    }
}
