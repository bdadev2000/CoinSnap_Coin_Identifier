package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f9221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f9221a = delegatingThemeAwareRippleNode;
    }

    @Override // q0.a
    public final Object invoke() {
        RippleAlpha rippleAlpha;
        RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(this.f9221a, RippleKt.f10784b);
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.f10781b) == null) ? RippleDefaults.f10782a : rippleAlpha;
    }
}
