package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;

/* loaded from: classes3.dex */
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public AlignmentLine f3759o;

    /* renamed from: p, reason: collision with root package name */
    public float f3760p;

    /* renamed from: q, reason: collision with root package name */
    public float f3761q;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        return AlignmentLineKt.a(measureScope, this.f3759o, this.f3760p, this.f3761q, measurable, j2);
    }
}
