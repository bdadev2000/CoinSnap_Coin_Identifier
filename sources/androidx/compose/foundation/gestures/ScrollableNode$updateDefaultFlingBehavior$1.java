package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class ScrollableNode$updateDefaultFlingBehavior$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$updateDefaultFlingBehavior$1(ScrollableNode scrollableNode) {
        super(0);
        this.f3480a = scrollableNode;
    }

    @Override // q0.a
    public final Object invoke() {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.f16434f;
        ScrollableNode scrollableNode = this.f3480a;
        scrollableNode.C.f3143a = DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec((Density) CompositionLocalConsumerModifierNodeKt.a(scrollableNode, staticProvidableCompositionLocal)));
        return b0.f30125a;
    }
}
