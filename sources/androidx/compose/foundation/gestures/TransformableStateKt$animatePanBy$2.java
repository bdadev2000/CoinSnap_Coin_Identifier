package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", l = {Opcodes.INVOKEVIRTUAL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransformableStateKt$animatePanBy$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3633a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f3635c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f3636f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f3637a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TransformScope f3638b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e0 e0Var, TransformScope transformScope) {
            super(1);
            this.f3637a = e0Var;
            this.f3638b = transformScope;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            long j2 = ((Offset) animationScope.e.getValue()).f14913a;
            e0 e0Var = this.f3637a;
            Offset.j(j2, e0Var.f30927a);
            this.f3638b.a();
            e0Var.f30927a = ((Offset) animationScope.e.getValue()).f14913a;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(e0 e0Var, long j2, AnimationSpec animationSpec, g gVar) {
        super(2, gVar);
        this.f3635c = e0Var;
        this.d = j2;
        this.f3636f = animationSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.f3635c, this.d, this.f3636f, gVar);
        transformableStateKt$animatePanBy$2.f3634b = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformableStateKt$animatePanBy$2) create((TransformScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3633a;
        if (i2 == 0) {
            q.m(obj);
            TransformScope transformScope = (TransformScope) this.f3634b;
            TwoWayConverter twoWayConverter = VectorConvertersKt.f2343f;
            e0 e0Var = this.f3635c;
            AnimationState animationState = new AnimationState(twoWayConverter, new Offset(e0Var.f30927a), null, 60);
            Offset offset = new Offset(this.d);
            AnimationSpec animationSpec = this.f3636f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(e0Var, transformScope);
            this.f3633a = 1;
            if (SuspendAnimationKt.g(animationState, offset, animationSpec, false, anonymousClass1, this, 4) == aVar) {
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
