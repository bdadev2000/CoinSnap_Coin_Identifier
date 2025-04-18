package androidx.compose.animation.core;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {509}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SeekableTransitionState$seekTo$3 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f2201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2203c;
    public final /* synthetic */ SeekableTransitionState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Transition f2204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f2205g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {531}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2206a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2207b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f2208c;
        public final /* synthetic */ Object d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ SeekableTransitionState f2209f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Transition f2210g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f2211h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {527}, m = "invokeSuspend")
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00021 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f2212a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SeekableTransitionState f2213b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(SeekableTransitionState seekableTransitionState, g gVar) {
                super(2, gVar);
                this.f2213b = seekableTransitionState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00021(this.f2213b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00021) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f2212a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f2212a = 1;
                    if (SeekableTransitionState.h(this.f2213b, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f2, g gVar) {
            super(2, gVar);
            this.f2208c = obj;
            this.d = obj2;
            this.f2209f = seekableTransitionState;
            this.f2210g = transition;
            this.f2211h = f2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2208c, this.d, this.f2209f, this.f2210g, this.f2211h, gVar);
            anonymousClass1.f2207b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f2206a;
            b0 b0Var = b0.f30125a;
            SeekableTransitionState seekableTransitionState = this.f2209f;
            if (i2 == 0) {
                q.m(obj);
                d0 d0Var = (d0) this.f2207b;
                Object obj2 = this.f2208c;
                Object obj3 = this.d;
                if (p0.a.g(obj2, obj3)) {
                    seekableTransitionState.f2175n = null;
                    if (p0.a.g(seekableTransitionState.f2166c.getValue(), obj2)) {
                        return b0Var;
                    }
                } else {
                    SeekableTransitionState.f(seekableTransitionState);
                }
                boolean g2 = p0.a.g(obj2, obj3);
                float f2 = this.f2211h;
                if (!g2) {
                    Transition transition = this.f2210g;
                    transition.q(obj2);
                    transition.o(0L);
                    seekableTransitionState.f2165b.setValue(obj2);
                    transition.j(f2);
                }
                seekableTransitionState.p(f2);
                if (seekableTransitionState.f2174m.f1550b != 0) {
                    kotlin.jvm.internal.e.v(d0Var, null, 0, new C00021(seekableTransitionState, null), 3);
                } else {
                    seekableTransitionState.f2173l = Long.MIN_VALUE;
                }
                this.f2206a = 1;
                if (SeekableTransitionState.j(seekableTransitionState, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            seekableTransitionState.o();
            return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekTo$3(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f2, g gVar) {
        super(1, gVar);
        this.f2202b = obj;
        this.f2203c = obj2;
        this.d = seekableTransitionState;
        this.f2204f = transition;
        this.f2205g = f2;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new SeekableTransitionState$seekTo$3(this.f2202b, this.f2203c, this.d, this.f2204f, this.f2205g, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$seekTo$3) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f2201a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2202b, this.f2203c, this.d, this.f2204f, this.f2205g, null);
            this.f2201a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
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
