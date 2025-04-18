package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {893}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DefaultFlingBehavior$performFling$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f3145a;

    /* renamed from: b, reason: collision with root package name */
    public AnimationState f3146b;

    /* renamed from: c, reason: collision with root package name */
    public int f3147c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DefaultFlingBehavior f3148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f3149g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f3150a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f3151b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f3152c;
        public final /* synthetic */ DefaultFlingBehavior d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c0 c0Var, ScrollScope scrollScope, c0 c0Var2, DefaultFlingBehavior defaultFlingBehavior) {
            super(1);
            this.f3150a = c0Var;
            this.f3151b = scrollScope;
            this.f3152c = c0Var2;
            this.d = defaultFlingBehavior;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            float floatValue = ((Number) animationScope.e.getValue()).floatValue();
            c0 c0Var = this.f3150a;
            float f2 = floatValue - c0Var.f30922a;
            float a2 = this.f3151b.a(f2);
            c0Var.f30922a = ((Number) animationScope.e.getValue()).floatValue();
            this.f3152c.f30922a = ((Number) animationScope.b()).floatValue();
            if (Math.abs(f2 - a2) > 0.5f) {
                animationScope.a();
            }
            this.d.getClass();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f2, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, g gVar) {
        super(2, gVar);
        this.d = f2;
        this.f3148f = defaultFlingBehavior;
        this.f3149g = scrollScope;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DefaultFlingBehavior$performFling$2(this.d, this.f3148f, this.f3149g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        float f2;
        c0 obj2;
        AnimationState animationState;
        c0 c0Var;
        a aVar = a.f30806a;
        int i2 = this.f3147c;
        if (i2 == 0) {
            q.m(obj);
            f2 = this.d;
            if (Math.abs(f2) > 1.0f) {
                obj2 = new Object();
                obj2.f30922a = f2;
                ?? obj3 = new Object();
                AnimationState a2 = AnimationStateKt.a(0.0f, f2, 28);
                try {
                    DefaultFlingBehavior defaultFlingBehavior = this.f3148f;
                    DecayAnimationSpec decayAnimationSpec = defaultFlingBehavior.f3143a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj3, this.f3149g, obj2, defaultFlingBehavior);
                    this.f3145a = obj2;
                    this.f3146b = a2;
                    this.f3147c = 1;
                    c0Var = obj2;
                    if (SuspendAnimationKt.e(a2, decayAnimationSpec, false, anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused) {
                    animationState = a2;
                    obj2.f30922a = ((Number) animationState.a()).floatValue();
                    c0Var = obj2;
                    f2 = c0Var.f30922a;
                    return new Float(f2);
                }
            }
            return new Float(f2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        animationState = this.f3146b;
        obj2 = this.f3145a;
        try {
            q.m(obj);
            c0Var = obj2;
        } catch (CancellationException unused2) {
            obj2.f30922a = ((Number) animationState.a()).floatValue();
            c0Var = obj2;
            f2 = c0Var.f30922a;
            return new Float(f2);
        }
        f2 = c0Var.f30922a;
        return new Float(f2);
    }
}
