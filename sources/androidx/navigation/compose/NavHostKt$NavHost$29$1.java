package androidx.navigation.compose;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.navigation.NavBackStackEntry;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {619, 626}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$29$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20671a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f20673c;
    public final /* synthetic */ NavBackStackEntry d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Transition f20674f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$29$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f20675a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SeekableTransitionState f20676b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f20677c;

        @e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {634, 638}, m = "invokeSuspend")
        /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00571 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f20678a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ float f20679b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SeekableTransitionState f20680c;
            public final /* synthetic */ NavBackStackEntry d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00571(float f2, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, g gVar) {
                super(2, gVar);
                this.f20679b = f2;
                this.f20680c = seekableTransitionState;
                this.d = navBackStackEntry;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00571(this.f20679b, this.f20680c, this.d, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00571) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f20678a;
                SeekableTransitionState seekableTransitionState = this.f20680c;
                float f2 = this.f20679b;
                if (i2 == 0) {
                    q.m(obj);
                    if (f2 > 0.0f) {
                        this.f20678a = 1;
                        if (seekableTransitionState.n(f2, seekableTransitionState.f2165b.getValue(), this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.m(obj);
                        return b0.f30125a;
                    }
                    q.m(obj);
                }
                if (f2 == 0.0f) {
                    this.f20678a = 2;
                    if (seekableTransitionState.q(this.d, this) == aVar) {
                        return aVar;
                    }
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry) {
            super(2);
            this.f20675a = d0Var;
            this.f20676b = seekableTransitionState;
            this.f20677c = navBackStackEntry;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            ((Number) obj2).floatValue();
            kotlin.jvm.internal.e.v(this.f20675a, null, 0, new C00571(floatValue, this.f20676b, this.f20677c, null), 3);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition transition, g gVar) {
        super(2, gVar);
        this.f20673c = seekableTransitionState;
        this.d = navBackStackEntry;
        this.f20674f = transition;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.f20673c, this.d, this.f20674f, gVar);
        navHostKt$NavHost$29$1.f20672b = obj;
        return navHostKt$NavHost$29$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((NavHostKt$NavHost$29$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20671a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f20672b;
            SeekableTransitionState seekableTransitionState = this.f20673c;
            Object value = seekableTransitionState.f2166c.getValue();
            NavBackStackEntry navBackStackEntry = this.d;
            if (p0.a.g(value, navBackStackEntry)) {
                long longValue = ((Number) this.f20674f.f2277m.getValue()).longValue() / 1000000;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = seekableTransitionState.f2169h;
                float c2 = parcelableSnapshotMutableFloatState.c();
                TweenSpec d = AnimationSpecKt.d((int) (parcelableSnapshotMutableFloatState.c() * ((float) longValue)), 0, null, 6);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(d0Var, seekableTransitionState, navBackStackEntry);
                this.f20671a = 2;
                if (SuspendAnimationKt.c(c2, 0.0f, d, anonymousClass1, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                this.f20671a = 1;
                if (SeekableTransitionState.l(seekableTransitionState, navBackStackEntry, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
