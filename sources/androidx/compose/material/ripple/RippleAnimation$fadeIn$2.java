package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RippleAnimation$fadeIn$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f7424b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {Opcodes.SASTORE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f7425a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f7426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RippleAnimation rippleAnimation, g gVar) {
            super(2, gVar);
            this.f7426b = rippleAnimation;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f7426b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f7425a;
            if (i2 == 0) {
                q.m(obj);
                Animatable animatable = this.f7426b.f7414f;
                Float f2 = new Float(1.0f);
                TweenSpec d = AnimationSpecKt.d(75, 0, EasingKt.d, 2);
                this.f7425a = 1;
                if (Animatable.c(animatable, f2, d, null, null, this, 12) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {Opcodes.DUP2}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f7427a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f7428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RippleAnimation rippleAnimation, g gVar) {
            super(2, gVar);
            this.f7428b = rippleAnimation;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f7428b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f7427a;
            if (i2 == 0) {
                q.m(obj);
                Animatable animatable = this.f7428b.f7415g;
                Float f2 = new Float(1.0f);
                TweenSpec d = AnimationSpecKt.d(225, 0, EasingKt.f2083a, 2);
                this.f7427a = 1;
                if (Animatable.c(animatable, f2, d, null, null, this, 12) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {Opcodes.FADD}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f7429a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f7430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RippleAnimation rippleAnimation, g gVar) {
            super(2, gVar);
            this.f7430b = rippleAnimation;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass3(this.f7430b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f7429a;
            if (i2 == 0) {
                q.m(obj);
                Animatable animatable = this.f7430b.f7416h;
                Float f2 = new Float(1.0f);
                TweenSpec d = AnimationSpecKt.d(225, 0, EasingKt.d, 2);
                this.f7429a = 1;
                if (Animatable.c(animatable, f2, d, null, null, this, 12) == aVar) {
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
    public RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, g gVar) {
        super(2, gVar);
        this.f7424b = rippleAnimation;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.f7424b, gVar);
        rippleAnimation$fadeIn$2.f7423a = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleAnimation$fadeIn$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f7423a;
        RippleAnimation rippleAnimation = this.f7424b;
        kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(rippleAnimation, null), 3);
        kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(rippleAnimation, null), 3);
        return kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass3(rippleAnimation, null), 3);
    }
}
