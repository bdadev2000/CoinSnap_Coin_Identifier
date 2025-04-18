package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.CommonRippleNode;
import androidx.compose.material.ripple.RippleNode;
import androidx.compose.material.ripple.Ripple_androidKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class DelegatingThemeAwareRippleNode$updateConfiguration$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f9222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$updateConfiguration$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f9222a = delegatingThemeAwareRippleNode;
    }

    @Override // q0.a
    public final Object invoke() {
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RippleKt.f10784b;
        final DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f9222a;
        if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode, dynamicProvidableCompositionLocal)) == null) {
            RippleNode rippleNode = delegatingThemeAwareRippleNode.f9219u;
            if (rippleNode != null) {
                delegatingThemeAwareRippleNode.f2(rippleNode);
            }
        } else if (delegatingThemeAwareRippleNode.f9219u == null) {
            ColorProducer colorProducer = new ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                public final long a() {
                    DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = DelegatingThemeAwareRippleNode.this;
                    long a2 = delegatingThemeAwareRippleNode2.f9218t.a();
                    if (a2 != 16) {
                        return a2;
                    }
                    RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, RippleKt.f10784b);
                    if (rippleConfiguration != null) {
                        long j2 = rippleConfiguration.f10780a;
                        if (j2 != 16) {
                            return j2;
                        }
                    }
                    return ((Color) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, ContentColorKt.f8654a)).f14964a;
                }
            };
            DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1 delegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1 = new DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1(delegatingThemeAwareRippleNode);
            InteractionSource interactionSource = delegatingThemeAwareRippleNode.f9215q;
            boolean z2 = delegatingThemeAwareRippleNode.f9216r;
            float f2 = delegatingThemeAwareRippleNode.f9217s;
            TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.f7451a;
            RippleNode commonRippleNode = Ripple_androidKt.f7469a ? new CommonRippleNode(interactionSource, z2, f2, colorProducer, delegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1) : new RippleNode(interactionSource, z2, f2, colorProducer, delegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1);
            delegatingThemeAwareRippleNode.e2(commonRippleNode);
            delegatingThemeAwareRippleNode.f9219u = commonRippleNode;
        }
        return b0.f30125a;
    }
}
