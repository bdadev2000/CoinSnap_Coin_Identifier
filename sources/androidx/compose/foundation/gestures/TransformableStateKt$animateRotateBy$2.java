package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransformableStateKt$animateRotateBy$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3639a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f3641c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f3642f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f3643a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TransformScope f3644b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c0 c0Var, TransformScope transformScope) {
            super(1);
            this.f3643a = c0Var;
            this.f3644b = transformScope;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            ((Number) animationScope.e.getValue()).floatValue();
            c0 c0Var = this.f3643a;
            float f2 = c0Var.f30922a;
            this.f3644b.a();
            c0Var.f30922a = ((Number) animationScope.e.getValue()).floatValue();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateRotateBy$2(float f2, AnimationSpec animationSpec, g gVar, c0 c0Var) {
        super(2, gVar);
        this.f3641c = c0Var;
        this.d = f2;
        this.f3642f = animationSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.d, this.f3642f, gVar, this.f3641c);
        transformableStateKt$animateRotateBy$2.f3640b = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformableStateKt$animateRotateBy$2) create((TransformScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3639a;
        if (i2 == 0) {
            q.m(obj);
            TransformScope transformScope = (TransformScope) this.f3640b;
            c0 c0Var = this.f3641c;
            AnimationState a2 = AnimationStateKt.a(c0Var.f30922a, 0.0f, 30);
            Float f2 = new Float(this.d);
            AnimationSpec animationSpec = this.f3642f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c0Var, transformScope);
            this.f3639a = 1;
            if (SuspendAnimationKt.g(a2, f2, animationSpec, false, anonymousClass1, this, 4) == aVar) {
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
