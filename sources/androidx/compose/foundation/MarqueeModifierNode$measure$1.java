package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
final class MarqueeModifierNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f2798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$measure$1(Placeable placeable, MarqueeModifierNode marqueeModifierNode) {
        super(1);
        this.f2797a = placeable;
        this.f2798b = marqueeModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable placeable = this.f2797a;
        MarqueeModifierNode marqueeModifierNode = this.f2798b;
        Placeable.PlacementScope.m(placementScope, placeable, a.t0((-((Number) marqueeModifierNode.f2795y.d()).floatValue()) * marqueeModifierNode.e2()), 0, null, 12);
        return b0.f30125a;
    }
}
