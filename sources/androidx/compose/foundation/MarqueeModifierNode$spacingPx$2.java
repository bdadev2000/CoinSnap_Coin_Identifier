package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class MarqueeModifierNode$spacingPx$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarqueeSpacing f2808a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f2809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$spacingPx$2(MarqueeModifierNode marqueeModifierNode) {
        super(0);
        this.f2809b = marqueeModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        MarqueeModifierNode marqueeModifierNode = this.f2809b;
        Density density = DelegatableNodeKt.f(marqueeModifierNode).f15959u;
        marqueeModifierNode.f2791s.g();
        return Integer.valueOf(this.f2808a.a(marqueeModifierNode.f2792t.g()));
    }
}
