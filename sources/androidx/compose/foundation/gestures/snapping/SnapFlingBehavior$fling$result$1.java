package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {Opcodes.D2I, Opcodes.IF_ICMPLT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SnapFlingBehavior$fling$result$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f3686a;

    /* renamed from: b, reason: collision with root package name */
    public int f3687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f3688c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f3690g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f3691a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f3692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(c0 c0Var, l lVar) {
            super(1);
            this.f3691a = c0Var;
            this.f3692b = lVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            c0 c0Var = this.f3691a;
            float f2 = c0Var.f30922a - floatValue;
            c0Var.f30922a = f2;
            this.f3692b.invoke(Float.valueOf(f2));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(float f2, ScrollScope scrollScope, SnapFlingBehavior snapFlingBehavior, g gVar, l lVar) {
        super(2, gVar);
        this.f3688c = snapFlingBehavior;
        this.d = f2;
        this.f3689f = lVar;
        this.f3690g = scrollScope;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SnapFlingBehavior snapFlingBehavior = this.f3688c;
        return new SnapFlingBehavior$fling$result$1(this.d, this.f3690g, snapFlingBehavior, gVar, this.f3689f);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapFlingBehavior$fling$result$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object c2;
        c0 c0Var;
        a aVar = a.f30806a;
        int i2 = this.f3687b;
        l lVar = this.f3689f;
        SnapFlingBehavior snapFlingBehavior = this.f3688c;
        if (i2 == 0) {
            q.m(obj);
            DecayAnimationSpec decayAnimationSpec = snapFlingBehavior.f3681b;
            float f2 = this.d;
            float b2 = snapFlingBehavior.f3680a.b(f2, DecayAnimationSpecKt.a(decayAnimationSpec, 0.0f, f2));
            if (!(!Float.isNaN(b2))) {
                throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.".toString());
            }
            ?? obj2 = new Object();
            float signum = Math.signum(f2) * Math.abs(b2);
            obj2.f30922a = signum;
            lVar.invoke(new Float(signum));
            SnapFlingBehavior snapFlingBehavior2 = this.f3688c;
            ScrollScope scrollScope = this.f3690g;
            float f3 = obj2.f30922a;
            float f4 = this.d;
            SnapFlingBehavior$fling$result$1$animationState$1 snapFlingBehavior$fling$result$1$animationState$1 = new SnapFlingBehavior$fling$result$1$animationState$1(obj2, lVar);
            this.f3686a = obj2;
            this.f3687b = 1;
            c2 = SnapFlingBehavior.c(snapFlingBehavior2, scrollScope, f3, f4, snapFlingBehavior$fling$result$1$animationState$1, this);
            c0Var = obj2;
            if (c2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                return obj;
            }
            c0 c0Var2 = this.f3686a;
            q.m(obj);
            c0Var = c0Var2;
            c2 = obj;
        }
        AnimationState animationState = (AnimationState) c2;
        float a2 = snapFlingBehavior.f3680a.a(((Number) animationState.a()).floatValue());
        if (!(!Float.isNaN(a2))) {
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.".toString());
        }
        c0Var.f30922a = a2;
        ScrollScope scrollScope2 = this.f3690g;
        AnimationState b3 = AnimationStateKt.b(animationState, 0.0f, 0.0f, 30);
        AnimationSpec animationSpec = snapFlingBehavior.f3682c;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(c0Var, lVar);
        this.f3686a = null;
        this.f3687b = 2;
        Object b4 = SnapFlingBehaviorKt.b(scrollScope2, a2, a2, b3, animationSpec, anonymousClass4, this);
        return b4 == aVar ? aVar : b4;
    }
}
