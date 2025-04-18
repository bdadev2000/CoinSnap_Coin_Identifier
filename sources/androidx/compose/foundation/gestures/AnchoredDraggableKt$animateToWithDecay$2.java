package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import p0.a;
import q0.l;
import q0.r;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1059, 1077, 1092}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$animateToWithDecay$2 extends i implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f3019a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f3020b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ DraggableAnchors f3021c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f3023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f3024h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends kotlin.jvm.internal.r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f3025a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnchoredDragScope f3026b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f3027c;
        public final /* synthetic */ c0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(float f2, AnchoredDragScope anchoredDragScope, c0 c0Var, c0 c0Var2) {
            super(1);
            this.f3025a = f2;
            this.f3026b = anchoredDragScope;
            this.f3027c = c0Var;
            this.d = c0Var2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            float abs = Math.abs(((Number) animationScope.e.getValue()).floatValue());
            float f2 = this.f3025a;
            float abs2 = Math.abs(f2);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.e;
            c0 c0Var = this.d;
            c0 c0Var2 = this.f3027c;
            AnchoredDragScope anchoredDragScope = this.f3026b;
            if (abs >= abs2) {
                float floatValue = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
                float x = f2 == 0.0f ? 0.0f : f2 > 0.0f ? a.x(floatValue, f2) : a.v(floatValue, f2);
                anchoredDragScope.a(x, ((Number) animationScope.b()).floatValue());
                c0Var2.f30922a = Float.isNaN(((Number) animationScope.b()).floatValue()) ? 0.0f : ((Number) animationScope.b()).floatValue();
                c0Var.f30922a = x;
                animationScope.a();
            } else {
                anchoredDragScope.a(((Number) parcelableSnapshotMutableState.getValue()).floatValue(), ((Number) animationScope.b()).floatValue());
                c0Var2.f30922a = ((Number) animationScope.b()).floatValue();
                c0Var.f30922a = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState anchoredDraggableState, float f2, c0 c0Var, g gVar) {
        super(4, gVar);
        this.f3022f = anchoredDraggableState;
        this.f3023g = f2;
        this.f3024h = c0Var;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.f3022f, this.f3023g, this.f3024h, (g) obj4);
        anchoredDraggableKt$animateToWithDecay$2.f3020b = (AnchoredDragScope) obj;
        anchoredDraggableKt$animateToWithDecay$2.f3021c = (DraggableAnchors) obj2;
        anchoredDraggableKt$animateToWithDecay$2.d = obj3;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f3019a;
        c0 c0Var = this.f3024h;
        if (i2 == 0) {
            q.m(obj);
            AnchoredDragScope anchoredDragScope = this.f3020b;
            DraggableAnchors draggableAnchors = this.f3021c;
            Object obj2 = this.d;
            float e = draggableAnchors.e(obj2);
            if (!Float.isNaN(e)) {
                ?? obj3 = new Object();
                AnchoredDraggableState anchoredDraggableState = this.f3022f;
                float c2 = Float.isNaN(anchoredDraggableState.f3068j.c()) ? 0.0f : anchoredDraggableState.f3068j.c();
                obj3.f30922a = c2;
                if (c2 != e) {
                    float f2 = this.f3023g;
                    if ((e - c2) * f2 < 0.0f || f2 == 0.0f) {
                        AnchoredDraggableState anchoredDraggableState2 = this.f3022f;
                        this.f3020b = null;
                        this.f3021c = null;
                        this.f3019a = 1;
                        if (AnchoredDraggableKt.a(anchoredDraggableState2, f2, anchoredDragScope, draggableAnchors, obj2, this) == aVar) {
                            return aVar;
                        }
                        c0Var.f30922a = 0.0f;
                    } else {
                        DecayAnimationSpec decayAnimationSpec = anchoredDraggableState.d;
                        float a2 = DecayAnimationSpecKt.a(decayAnimationSpec, c2, f2);
                        float f3 = this.f3023g;
                        if (f3 <= 0.0f ? a2 > e : a2 < e) {
                            AnchoredDraggableState anchoredDraggableState3 = this.f3022f;
                            this.f3020b = null;
                            this.f3021c = null;
                            this.f3019a = 3;
                            if (AnchoredDraggableKt.a(anchoredDraggableState3, f3, anchoredDragScope, draggableAnchors, obj2, this) == aVar) {
                                return aVar;
                            }
                            c0Var.f30922a = 0.0f;
                        } else {
                            AnimationState a3 = AnimationStateKt.a(obj3.f30922a, f3, 28);
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(e, anchoredDragScope, c0Var, obj3);
                            this.f3020b = null;
                            this.f3021c = null;
                            this.f3019a = 2;
                            if (SuspendAnimationKt.e(a3, decayAnimationSpec, false, anonymousClass3, this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
            }
        } else if (i2 == 1) {
            q.m(obj);
            c0Var.f30922a = 0.0f;
        } else if (i2 == 2) {
            q.m(obj);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            c0Var.f30922a = 0.0f;
        }
        return b0.f30125a;
    }
}
