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
@e(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RippleAnimation$fadeOut$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f7432b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f7433a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f7434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RippleAnimation rippleAnimation, g gVar) {
            super(2, gVar);
            this.f7434b = rippleAnimation;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f7434b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f7433a;
            if (i2 == 0) {
                q.m(obj);
                Animatable animatable = this.f7434b.f7414f;
                Float f2 = new Float(0.0f);
                TweenSpec d = AnimationSpecKt.d(Opcodes.FCMPG, 0, EasingKt.d, 2);
                this.f7433a = 1;
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
    public RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, g gVar) {
        super(2, gVar);
        this.f7432b = rippleAnimation;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.f7432b, gVar);
        rippleAnimation$fadeOut$2.f7431a = obj;
        return rippleAnimation$fadeOut$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleAnimation$fadeOut$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        return kotlin.jvm.internal.e.v((d0) this.f7431a, null, 0, new AnonymousClass1(this.f7432b, null), 3);
    }
}
