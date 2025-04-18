package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes2.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {

    /* renamed from: a, reason: collision with root package name */
    public final AlignmentLine f3756a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3757b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3758c;

    public AlignmentLineOffsetDpElement(HorizontalAlignmentLine horizontalAlignmentLine, float f2, float f3) {
        this.f3756a = horizontalAlignmentLine;
        this.f3757b = f2;
        this.f3758c = f3;
        if ((f2 < 0.0f && !Dp.a(f2, Float.NaN)) || (f3 < 0.0f && !Dp.a(f3, Float.NaN))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.AlignmentLineOffsetDpNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f3759o = this.f3756a;
        node.f3760p = this.f3757b;
        node.f3761q = this.f3758c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        AlignmentLineOffsetDpNode alignmentLineOffsetDpNode = (AlignmentLineOffsetDpNode) node;
        alignmentLineOffsetDpNode.f3759o = this.f3756a;
        alignmentLineOffsetDpNode.f3760p = this.f3757b;
        alignmentLineOffsetDpNode.f3761q = this.f3758c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return p0.a.g(this.f3756a, alignmentLineOffsetDpElement.f3756a) && Dp.a(this.f3757b, alignmentLineOffsetDpElement.f3757b) && Dp.a(this.f3758c, alignmentLineOffsetDpElement.f3758c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3758c) + d.b(this.f3757b, this.f3756a.hashCode() * 31, 31);
    }
}
