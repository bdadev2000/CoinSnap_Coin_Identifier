package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleNode;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public final InteractionSource f9215q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9216r;

    /* renamed from: s, reason: collision with root package name */
    public final float f9217s;

    /* renamed from: t, reason: collision with root package name */
    public final ColorProducer f9218t;

    /* renamed from: u, reason: collision with root package name */
    public RippleNode f9219u;

    public DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer) {
        this.f9215q = interactionSource;
        this.f9216r = z2;
        this.f9217s = f2;
        this.f9218t = colorProducer;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        ObserverModifierNodeKt.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        ObserverModifierNodeKt.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }
}
