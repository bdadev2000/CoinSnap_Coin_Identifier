package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: LayoutUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1603finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return Constraints.INSTANCE.m6959fitPrioritizingWidthZbe2FdA(0, m1605finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m6949getMaxHeightimpl(j));
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1605finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int m6950getMaxWidthimpl = ((z || TextOverflow.m6906equalsimpl0(i, TextOverflow.INSTANCE.m6914getEllipsisgIe3tQ8())) && Constraints.m6946getHasBoundedWidthimpl(j)) ? Constraints.m6950getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return Constraints.m6952getMinWidthimpl(j) == m6950getMaxWidthimpl ? m6950getMaxWidthimpl : RangesKt.coerceIn(TextDelegateKt.ceilToIntPx(f), Constraints.m6952getMinWidthimpl(j), m6950getMaxWidthimpl);
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1604finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (z || !TextOverflow.m6906equalsimpl0(i, TextOverflow.INSTANCE.m6914getEllipsisgIe3tQ8())) {
            return RangesKt.coerceAtLeast(i2, 1);
        }
        return 1;
    }
}
