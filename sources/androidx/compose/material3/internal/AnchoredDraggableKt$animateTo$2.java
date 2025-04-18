package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import q0.p;
import q0.r;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2 extends i implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f12795a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f12796b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ DraggableAnchors f12797c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f12799g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends kotlin.jvm.internal.r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDragScope f12800a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f12801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDragScope anchoredDragScope, c0 c0Var) {
            super(2);
            this.f12800a = anchoredDragScope;
            this.f12801b = c0Var;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            this.f12800a.a(floatValue, ((Number) obj2).floatValue());
            this.f12801b.f30922a = floatValue;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f2, g gVar) {
        super(4, gVar);
        this.f12798f = anchoredDraggableState;
        this.f12799g = f2;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.f12798f, this.f12799g, (g) obj4);
        anchoredDraggableKt$animateTo$2.f12796b = (AnchoredDragScope) obj;
        anchoredDraggableKt$animateTo$2.f12797c = (DraggableAnchors) obj2;
        anchoredDraggableKt$animateTo$2.d = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12795a;
        if (i2 == 0) {
            q.m(obj);
            AnchoredDragScope anchoredDragScope = this.f12796b;
            float e = this.f12797c.e(this.d);
            if (!Float.isNaN(e)) {
                ?? obj2 = new Object();
                AnchoredDraggableState anchoredDraggableState = this.f12798f;
                float c2 = Float.isNaN(anchoredDraggableState.f12827j.c()) ? 0.0f : anchoredDraggableState.f12827j.c();
                obj2.f30922a = c2;
                float f2 = this.f12799g;
                AnimationSpec animationSpec = anchoredDraggableState.f12822c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDragScope, obj2);
                this.f12796b = null;
                this.f12797c = null;
                this.f12795a = 1;
                if (SuspendAnimationKt.a(c2, e, f2, animationSpec, anonymousClass1, this) == aVar) {
                    return aVar;
                }
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
