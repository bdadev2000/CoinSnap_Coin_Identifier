package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
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
/* loaded from: classes3.dex */
public final class Transition$animateTo$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f2300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f2301b;

    @e(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1227}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public float f2302a;

        /* renamed from: b, reason: collision with root package name */
        public int f2303b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f2304c;
        public final /* synthetic */ Transition d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00031 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Transition f2305a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ float f2306b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00031(Transition transition, float f2) {
                super(1);
                this.f2305a = transition;
                this.f2306b = f2;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                long longValue = ((Number) obj).longValue();
                Transition transition = this.f2305a;
                if (!transition.g()) {
                    ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = transition.f2271g;
                    if (parcelableSnapshotMutableLongState.d() == Long.MIN_VALUE) {
                        parcelableSnapshotMutableLongState.o(longValue);
                        transition.f2267a.f2334a.setValue(Boolean.TRUE);
                    }
                    long d = longValue - parcelableSnapshotMutableLongState.d();
                    float f2 = this.f2306b;
                    if (f2 != 0.0f) {
                        d = p0.a.u0(d / f2);
                    }
                    transition.o(d);
                    transition.h(d, f2 == 0.0f);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Transition transition, g gVar) {
            super(2, gVar);
            this.d = transition;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, gVar);
            anonymousClass1.f2304c = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            float i2;
            d0 d0Var;
            i0.a aVar = i0.a.f30806a;
            int i3 = this.f2303b;
            if (i3 == 0) {
                q.m(obj);
                d0 d0Var2 = (d0) this.f2304c;
                i2 = SuspendAnimationKt.i(d0Var2.getCoroutineContext());
                d0Var = d0Var2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f2302a;
                d0Var = (d0) this.f2304c;
                q.m(obj);
            }
            while (p0.a.n0(d0Var)) {
                C00031 c00031 = new C00031(this.d, i2);
                this.f2304c = d0Var;
                this.f2302a = i2;
                this.f2303b = 1;
                if (MonotonicFrameClockKt.a(getContext()).b0(c00031, this) == aVar) {
                    return aVar;
                }
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(d0 d0Var, Transition transition) {
        super(1);
        this.f2300a = d0Var;
        this.f2301b = transition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        kotlin.jvm.internal.e.v(this.f2300a, null, 4, new AnonymousClass1(this.f2301b, null), 1);
        return new Object();
    }
}
