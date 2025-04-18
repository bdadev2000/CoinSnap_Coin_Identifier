package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.TextUnitKt;

/* loaded from: classes3.dex */
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public AlignmentLine f3762o;

    /* renamed from: p, reason: collision with root package name */
    public long f3763p;

    /* renamed from: q, reason: collision with root package name */
    public long f3764q;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        return AlignmentLineKt.a(measureScope, this.f3762o, !TextUnitKt.c(this.f3763p) ? measureScope.r(this.f3763p) : Float.NaN, !TextUnitKt.c(this.f3764q) ? measureScope.r(this.f3764q) : Float.NaN, measurable, j2);
    }
}
