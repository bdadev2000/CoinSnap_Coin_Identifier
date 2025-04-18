package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultScrollableState$scroll$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultScrollableState f3158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f3159c;
    public final /* synthetic */ p d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {204}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3160a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3161b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DefaultScrollableState f3162c;
        public final /* synthetic */ p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultScrollableState defaultScrollableState, p pVar, g gVar) {
            super(2, gVar);
            this.f3162c = defaultScrollableState;
            this.d = pVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3162c, this.d, gVar);
            anonymousClass1.f3161b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f3160a;
            DefaultScrollableState defaultScrollableState = this.f3162c;
            try {
                if (i2 == 0) {
                    q.m(obj);
                    ScrollScope scrollScope = (ScrollScope) this.f3161b;
                    defaultScrollableState.d.setValue(Boolean.TRUE);
                    p pVar = this.d;
                    this.f3160a = 1;
                    if (pVar.invoke(scrollScope, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                defaultScrollableState.d.setValue(Boolean.FALSE);
                return b0.f30125a;
            } catch (Throwable th) {
                defaultScrollableState.d.setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, p pVar, g gVar) {
        super(2, gVar);
        this.f3158b = defaultScrollableState;
        this.f3159c = mutatePriority;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DefaultScrollableState$scroll$2(this.f3158b, this.f3159c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultScrollableState$scroll$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3157a;
        if (i2 == 0) {
            q.m(obj);
            DefaultScrollableState defaultScrollableState = this.f3158b;
            MutatorMutex mutatorMutex = defaultScrollableState.f3155c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(defaultScrollableState, this.d, null);
            this.f3157a = 1;
            if (mutatorMutex.c(defaultScrollableState.f3154b, this.f3159c, anonymousClass1, this) == aVar) {
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
