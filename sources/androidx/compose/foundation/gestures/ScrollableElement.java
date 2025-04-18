package androidx.compose.foundation.gestures;

import android.support.v4.media.d;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollableState f3426a;

    /* renamed from: b, reason: collision with root package name */
    public final Orientation f3427b;

    /* renamed from: c, reason: collision with root package name */
    public final OverscrollEffect f3428c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3429f;

    /* renamed from: g, reason: collision with root package name */
    public final FlingBehavior f3430g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableInteractionSource f3431h;

    /* renamed from: i, reason: collision with root package name */
    public final BringIntoViewSpec f3432i;

    public ScrollableElement(OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3) {
        this.f3426a = scrollableState;
        this.f3427b = orientation;
        this.f3428c = overscrollEffect;
        this.d = z2;
        this.f3429f = z3;
        this.f3430g = flingBehavior;
        this.f3431h = mutableInteractionSource;
        this.f3432i = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ScrollableState scrollableState = this.f3426a;
        OverscrollEffect overscrollEffect = this.f3428c;
        FlingBehavior flingBehavior = this.f3430g;
        Orientation orientation = this.f3427b;
        boolean z2 = this.d;
        boolean z3 = this.f3429f;
        return new ScrollableNode(overscrollEffect, this.f3432i, flingBehavior, orientation, scrollableState, this.f3431h, z2, z3);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        boolean z2;
        boolean z3;
        ScrollableNode scrollableNode = (ScrollableNode) node;
        boolean z4 = this.d;
        MutableInteractionSource mutableInteractionSource = this.f3431h;
        boolean z5 = false;
        if (scrollableNode.f3294s != z4) {
            scrollableNode.E.f3448b = z4;
            scrollableNode.B.f3425o = z4;
            z2 = true;
        } else {
            z2 = false;
        }
        FlingBehavior flingBehavior = this.f3430g;
        FlingBehavior flingBehavior2 = flingBehavior == null ? scrollableNode.C : flingBehavior;
        ScrollingLogic scrollingLogic = scrollableNode.D;
        ScrollableState scrollableState = scrollingLogic.f3482a;
        ScrollableState scrollableState2 = this.f3426a;
        if (!a.g(scrollableState, scrollableState2)) {
            scrollingLogic.f3482a = scrollableState2;
            z5 = true;
        }
        OverscrollEffect overscrollEffect = this.f3428c;
        scrollingLogic.f3483b = overscrollEffect;
        Orientation orientation = scrollingLogic.d;
        Orientation orientation2 = this.f3427b;
        if (orientation != orientation2) {
            scrollingLogic.d = orientation2;
            z5 = true;
        }
        boolean z6 = scrollingLogic.e;
        boolean z7 = this.f3429f;
        if (z6 != z7) {
            scrollingLogic.e = z7;
            z3 = true;
        } else {
            z3 = z5;
        }
        scrollingLogic.f3484c = flingBehavior2;
        scrollingLogic.f3485f = scrollableNode.A;
        ContentInViewNode contentInViewNode = scrollableNode.F;
        contentInViewNode.f3108o = orientation2;
        contentInViewNode.f3110q = z7;
        contentInViewNode.f3111r = this.f3432i;
        scrollableNode.f3452y = overscrollEffect;
        scrollableNode.f3453z = flingBehavior;
        ScrollableKt$NoOpScrollScope$1 scrollableKt$NoOpScrollScope$1 = ScrollableKt.f3433a;
        ScrollableKt$CanDragCalculation$1 scrollableKt$CanDragCalculation$1 = ScrollableKt$CanDragCalculation$1.f3436a;
        Orientation orientation3 = scrollingLogic.d;
        Orientation orientation4 = Orientation.f3394a;
        if (orientation3 != orientation4) {
            orientation4 = Orientation.f3395b;
        }
        scrollableNode.p2(scrollableKt$CanDragCalculation$1, z4, mutableInteractionSource, orientation4, z3);
        if (z2) {
            scrollableNode.H = null;
            scrollableNode.I = null;
            DelegatableNodeKt.f(scrollableNode).K();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return a.g(this.f3426a, scrollableElement.f3426a) && this.f3427b == scrollableElement.f3427b && a.g(this.f3428c, scrollableElement.f3428c) && this.d == scrollableElement.d && this.f3429f == scrollableElement.f3429f && a.g(this.f3430g, scrollableElement.f3430g) && a.g(this.f3431h, scrollableElement.f3431h) && a.g(this.f3432i, scrollableElement.f3432i);
    }

    public final int hashCode() {
        int hashCode = (this.f3427b.hashCode() + (this.f3426a.hashCode() * 31)) * 31;
        OverscrollEffect overscrollEffect = this.f3428c;
        int g2 = d.g(this.f3429f, d.g(this.d, (hashCode + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31, 31), 31);
        FlingBehavior flingBehavior = this.f3430g;
        int hashCode2 = (g2 + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.f3431h;
        int hashCode3 = (hashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.f3432i;
        return hashCode3 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0);
    }
}
