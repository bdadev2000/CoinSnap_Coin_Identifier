package androidx.compose.ui.draw;

import android.support.v4.media.d;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Dp;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final float f14821a = ContextMenuSpec.d;

    /* renamed from: b, reason: collision with root package name */
    public final Shape f14822b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14823c;
    public final long d;

    /* renamed from: f, reason: collision with root package name */
    public final long f14824f;

    public ShadowGraphicsLayerElement(Shape shape, boolean z2, long j2, long j3) {
        this.f14822b = shape;
        this.f14823c = z2;
        this.d = j2;
        this.f14824f = j3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BlockGraphicsLayerModifier(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) node;
        blockGraphicsLayerModifier.f14946o = new ShadowGraphicsLayerElement$createBlock$1(this);
        NodeCoordinator nodeCoordinator = DelegatableNodeKt.d(blockGraphicsLayerModifier, 2).f16103p;
        if (nodeCoordinator != null) {
            nodeCoordinator.W1(true, blockGraphicsLayerModifier.f14946o);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.a(this.f14821a, shadowGraphicsLayerElement.f14821a) && a.g(this.f14822b, shadowGraphicsLayerElement.f14822b) && this.f14823c == shadowGraphicsLayerElement.f14823c && Color.c(this.d, shadowGraphicsLayerElement.d) && Color.c(this.f14824f, shadowGraphicsLayerElement.f14824f);
    }

    public final int hashCode() {
        int g2 = d.g(this.f14823c, (this.f14822b.hashCode() + (Float.hashCode(this.f14821a) * 31)) * 31, 31);
        int i2 = Color.f14963j;
        return Long.hashCode(this.f14824f) + d.d(this.d, g2, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) Dp.b(this.f14821a));
        sb.append(", shape=");
        sb.append(this.f14822b);
        sb.append(", clip=");
        sb.append(this.f14823c);
        sb.append(", ambientColor=");
        d.z(this.d, sb, ", spotColor=");
        sb.append((Object) Color.i(this.f14824f));
        sb.append(')');
        return sb.toString();
    }
}
