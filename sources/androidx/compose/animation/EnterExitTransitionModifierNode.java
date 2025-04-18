package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import e0.x;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    /* renamed from: o, reason: collision with root package name */
    public Transition f1851o;

    /* renamed from: p, reason: collision with root package name */
    public Transition.DeferredAnimation f1852p;

    /* renamed from: q, reason: collision with root package name */
    public Transition.DeferredAnimation f1853q;

    /* renamed from: r, reason: collision with root package name */
    public Transition.DeferredAnimation f1854r;

    /* renamed from: s, reason: collision with root package name */
    public EnterTransition f1855s;

    /* renamed from: t, reason: collision with root package name */
    public ExitTransition f1856t;

    /* renamed from: u, reason: collision with root package name */
    public q0.a f1857u;

    /* renamed from: v, reason: collision with root package name */
    public GraphicsLayerBlockForEnterExit f1858v;
    public long w = AnimationModifierKt.f1772a;
    public Alignment x;

    /* renamed from: y, reason: collision with root package name */
    public final l f1859y;

    /* renamed from: z, reason: collision with root package name */
    public final l f1860z;

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EnterExitTransitionModifierNode(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, q0.a aVar, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.f1851o = transition;
        this.f1852p = deferredAnimation;
        this.f1853q = deferredAnimation2;
        this.f1854r = deferredAnimation3;
        this.f1855s = enterTransition;
        this.f1856t = exitTransition;
        this.f1857u = aVar;
        this.f1858v = graphicsLayerBlockForEnterExit;
        ConstraintsKt.b(0, 0, 15);
        this.f1859y = new EnterExitTransitionModifierNode$sizeTransitionSpec$1(this);
        this.f1860z = new EnterExitTransitionModifierNode$slideSpec$1(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        this.w = AnimationModifierKt.f1772a;
    }

    public final Alignment e2() {
        Alignment alignment;
        if (this.f1851o.f().d(EnterExitState.f1806a, EnterExitState.f1807b)) {
            ChangeSize changeSize = this.f1855s.a().f1975c;
            if (changeSize == null || (alignment = changeSize.f1773a) == null) {
                ChangeSize changeSize2 = this.f1856t.a().f1975c;
                if (changeSize2 != null) {
                    return changeSize2.f1773a;
                }
                return null;
            }
        } else {
            ChangeSize changeSize3 = this.f1856t.a().f1975c;
            if (changeSize3 == null || (alignment = changeSize3.f1773a) == null) {
                ChangeSize changeSize4 = this.f1855s.a().f1975c;
                if (changeSize4 != null) {
                    return changeSize4.f1773a;
                }
                return null;
            }
        }
        return alignment;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        if (this.f1851o.f2267a.a() == this.f1851o.d.getValue()) {
            this.x = null;
        } else if (this.x == null) {
            Alignment e2 = e2();
            if (e2 == null) {
                e2 = Alignment.Companion.f14659a;
            }
            this.x = e2;
        }
        boolean t02 = measureScope.t0();
        x xVar = x.f30219a;
        if (t02) {
            Placeable V = measurable.V(j2);
            long a2 = IntSizeKt.a(V.f15825a, V.f15826b);
            this.w = a2;
            return measureScope.T((int) (a2 >> 32), (int) (4294967295L & a2), xVar, new EnterExitTransitionModifierNode$measure$1(V));
        }
        if (!((Boolean) this.f1857u.invoke()).booleanValue()) {
            Placeable V2 = measurable.V(j2);
            return measureScope.T(V2.f15825a, V2.f15826b, xVar, new EnterExitTransitionModifierNode$measure$3$1(V2));
        }
        l a3 = this.f1858v.a();
        Placeable V3 = measurable.V(j2);
        long a4 = IntSizeKt.a(V3.f15825a, V3.f15826b);
        long j3 = IntSize.b(this.w, AnimationModifierKt.f1772a) ^ true ? this.w : a4;
        Transition.DeferredAnimation deferredAnimation = this.f1852p;
        Transition.DeferredAnimation.DeferredAnimationData a5 = deferredAnimation != null ? deferredAnimation.a(this.f1859y, new EnterExitTransitionModifierNode$measure$animSize$1(this, j3)) : null;
        if (a5 != null) {
            a4 = ((IntSize) a5.getValue()).f17493a;
        }
        long e = ConstraintsKt.e(j2, a4);
        Transition.DeferredAnimation deferredAnimation2 = this.f1853q;
        long j4 = deferredAnimation2 != null ? ((IntOffset) deferredAnimation2.a(EnterExitTransitionModifierNode$measure$offsetDelta$1.f1868a, new EnterExitTransitionModifierNode$measure$offsetDelta$2(this, j3)).getValue()).f17489a : 0L;
        Transition.DeferredAnimation deferredAnimation3 = this.f1854r;
        long j5 = deferredAnimation3 != null ? ((IntOffset) deferredAnimation3.a(this.f1860z, new EnterExitTransitionModifierNode$measure$slideOffset$1(this, j3)).getValue()).f17489a : 0L;
        Alignment alignment = this.x;
        return measureScope.T((int) (e >> 32), (int) (4294967295L & e), xVar, new EnterExitTransitionModifierNode$measure$2(V3, IntOffset.d(alignment != null ? alignment.a(j3, e, LayoutDirection.f17494a) : 0L, j5), j4, a3));
    }
}
