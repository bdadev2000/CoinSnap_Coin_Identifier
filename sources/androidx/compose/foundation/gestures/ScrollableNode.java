package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.Density;
import d0.b0;
import h0.g;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;
import q0.p;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ScrollableNode extends DragGestureNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, KeyInputModifierNode, SemanticsModifierNode {
    public final NestedScrollDispatcher A;
    public final ScrollableContainerNode B;
    public final DefaultFlingBehavior C;
    public final ScrollingLogic D;
    public final ScrollableNestedScrollConnection E;
    public final ContentInViewNode F;
    public ScrollConfig G;
    public p H;
    public p I;

    /* renamed from: y, reason: collision with root package name */
    public OverscrollEffect f3452y;

    /* renamed from: z, reason: collision with root package name */
    public FlingBehavior f3453z;

    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ScrollableNode.this.F.f3113t = (LayoutCoordinates) obj;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode(OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3) {
        super(ScrollableKt$CanDragCalculation$1.f3436a, z2, mutableInteractionSource, orientation);
        ScrollableKt$NoOpScrollScope$1 scrollableKt$NoOpScrollScope$1 = ScrollableKt.f3433a;
        this.f3452y = overscrollEffect;
        this.f3453z = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A = nestedScrollDispatcher;
        ScrollableContainerNode scrollableContainerNode = new ScrollableContainerNode(z2);
        e2(scrollableContainerNode);
        this.B = scrollableContainerNode;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec(ScrollableKt.f3435c)));
        this.C = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.f3452y;
        FlingBehavior flingBehavior2 = this.f3453z;
        ScrollingLogic scrollingLogic = new ScrollingLogic(overscrollEffect2, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, orientation, scrollableState, nestedScrollDispatcher, z3);
        this.D = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z2);
        this.E = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = new ContentInViewNode(orientation, scrollingLogic, z3, bringIntoViewSpec);
        e2(contentInViewNode);
        this.F = contentInViewNode;
        e2(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        e2(new Modifier.Node());
        e2(new BringIntoViewResponderNode(contentInViewNode));
        e2(new FocusedBoundsObserverNode(new AnonymousClass1()));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        if (this.f3294s && (this.H == null || this.I == null)) {
            this.H = new ScrollableNode$setScrollSemanticsActions$1(this);
            this.I = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        p pVar = this.H;
        if (pVar != null) {
            n[] nVarArr = SemanticsPropertiesKt.f16865a;
            semanticsConfiguration.b(SemanticsActions.d, new AccessibilityAction(null, pVar));
        }
        p pVar2 = this.I;
        if (pVar2 != null) {
            n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
            semanticsConfiguration.b(SemanticsActions.e, pVar2);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        ObserverModifierNodeKt.a(this, new ScrollableNode$updateDefaultFlingBehavior$1(this));
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean P0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        ObserverModifierNodeKt.a(this, new ScrollableNode$updateDefaultFlingBehavior$1(this));
        this.G = AndroidConfig.f3096a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        long j3;
        List list = pointerEvent.f15569a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.f3293r.invoke((PointerInputChange) list.get(i2))).booleanValue()) {
                super.e0(pointerEvent, pointerEventPass, j2);
                break;
            }
            i2++;
        }
        if (pointerEventPass == PointerEventPass.f15573b && PointerEventType.a(pointerEvent.d, 6)) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!(!((PointerInputChange) list.get(i3)).b())) {
                    return;
                }
            }
            a.p(this.G);
            Density density = DelegatableNodeKt.f(this).f15959u;
            Offset offset = new Offset(0L);
            int size3 = list.size();
            int i4 = 0;
            while (true) {
                j3 = offset.f14913a;
                if (i4 >= size3) {
                    break;
                }
                offset = new Offset(Offset.k(j3, ((PointerInputChange) list.get(i4)).f15596j));
                i4++;
            }
            e.v(S1(), null, 0, new ScrollableNode$processMouseWheelEvent$2$1(this, Offset.l(j3, -density.y1(64)), null), 3);
            int size4 = list.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((PointerInputChange) list.get(i5)).a();
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void e1(FocusProperties focusProperties) {
        focusProperties.b(false);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean i1(KeyEvent keyEvent) {
        long a2;
        if (!this.f3294s) {
            return false;
        }
        if ((!Key.a(Key_androidKt.a(keyEvent.getKeyCode()), Key.f15510l) && !Key.a(Key_androidKt.a(keyEvent.getKeyCode()), Key.f15509k)) || !KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z2 = this.D.d == Orientation.f3394a;
        ContentInViewNode contentInViewNode = this.F;
        if (z2) {
            int i2 = (int) (contentInViewNode.w & 4294967295L);
            a2 = OffsetKt.a(0.0f, Key.a(Key_androidKt.a(keyEvent.getKeyCode()), Key.f15509k) ? i2 : -i2);
        } else {
            int i3 = (int) (contentInViewNode.w >> 32);
            a2 = OffsetKt.a(Key.a(Key_androidKt.a(keyEvent.getKeyCode()), Key.f15509k) ? i3 : -i3, 0.0f);
        }
        e.v(S1(), null, 0, new ScrollableNode$onKeyEvent$1(this, a2, null), 3);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object l2(p pVar, g gVar) {
        MutatePriority mutatePriority = MutatePriority.f2812b;
        ScrollingLogic scrollingLogic = this.D;
        Object e = scrollingLogic.e(mutatePriority, new ScrollableNode$drag$2$1(scrollingLogic, null, pVar), gVar);
        return e == i0.a.f30806a ? e : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void m2(long j2) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void n2(long j2) {
        e.v(this.A.c(), null, 0, new ScrollableNode$onDragStopped$1(this, j2, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean o2() {
        OverscrollEffect overscrollEffect;
        ScrollingLogic scrollingLogic = this.D;
        return scrollingLogic.f3482a.a() || ((overscrollEffect = scrollingLogic.f3483b) != null && overscrollEffect.b());
    }
}
