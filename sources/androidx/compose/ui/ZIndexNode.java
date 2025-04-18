package androidx.compose.ui;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import e0.x;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ZIndexNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f14709o;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new ZIndexNode$measure$1(V, this));
    }

    public final String toString() {
        return d.n(new StringBuilder("ZIndexModifier(zIndex="), this.f14709o, ')');
    }
}
