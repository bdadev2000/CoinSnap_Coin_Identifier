package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.DraggableAnchors;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import q0.p;
import q0.r;

@e(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DrawerState$animateTo$3 extends i implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f9253a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f9254b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ DraggableAnchors f9255c;
    public /* synthetic */ DrawerValue d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DrawerState f9256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f9257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f9258h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.DrawerState$animateTo$3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends kotlin.jvm.internal.r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDragScope f9259a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f9260b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDragScope anchoredDragScope, c0 c0Var) {
            super(2);
            this.f9259a = anchoredDragScope;
            this.f9260b = c0Var;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            this.f9259a.a(floatValue, ((Number) obj2).floatValue());
            this.f9260b.f30922a = floatValue;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(DrawerState drawerState, float f2, AnimationSpec animationSpec, g gVar) {
        super(4, gVar);
        this.f9256f = drawerState;
        this.f9257g = f2;
        this.f9258h = animationSpec;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.f9256f, this.f9257g, this.f9258h, (g) obj4);
        drawerState$animateTo$3.f9254b = (AnchoredDragScope) obj;
        drawerState$animateTo$3.f9255c = (DraggableAnchors) obj2;
        drawerState$animateTo$3.d = (DrawerValue) obj3;
        return drawerState$animateTo$3.invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9253a;
        if (i2 == 0) {
            q.m(obj);
            AnchoredDragScope anchoredDragScope = this.f9254b;
            float e = this.f9255c.e(this.d);
            if (!Float.isNaN(e)) {
                ?? obj2 = new Object();
                DrawerState drawerState = this.f9256f;
                float c2 = Float.isNaN(drawerState.f9247a.f12827j.c()) ? 0.0f : drawerState.f9247a.f12827j.c();
                obj2.f30922a = c2;
                float f2 = this.f9257g;
                AnimationSpec animationSpec = this.f9258h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDragScope, obj2);
                this.f9254b = null;
                this.f9255c = null;
                this.f9253a = 1;
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
