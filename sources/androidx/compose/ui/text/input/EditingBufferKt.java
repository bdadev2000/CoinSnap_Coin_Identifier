package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m6621updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m6456getLengthimpl;
        int m6458getMinimpl = TextRange.m6458getMinimpl(j);
        int m6457getMaximpl = TextRange.m6457getMaximpl(j);
        if (TextRange.m6462intersects5zctL8(j2, j)) {
            if (TextRange.m6450contains5zctL8(j2, j)) {
                m6458getMinimpl = TextRange.m6458getMinimpl(j2);
                m6457getMaximpl = m6458getMinimpl;
            } else {
                if (TextRange.m6450contains5zctL8(j, j2)) {
                    m6456getLengthimpl = TextRange.m6456getLengthimpl(j2);
                } else if (TextRange.m6451containsimpl(j2, m6458getMinimpl)) {
                    m6458getMinimpl = TextRange.m6458getMinimpl(j2);
                    m6456getLengthimpl = TextRange.m6456getLengthimpl(j2);
                } else {
                    m6457getMaximpl = TextRange.m6458getMinimpl(j2);
                }
                m6457getMaximpl -= m6456getLengthimpl;
            }
        } else if (m6457getMaximpl > TextRange.m6458getMinimpl(j2)) {
            m6458getMinimpl -= TextRange.m6456getLengthimpl(j2);
            m6456getLengthimpl = TextRange.m6456getLengthimpl(j2);
            m6457getMaximpl -= m6456getLengthimpl;
        }
        return TextRangeKt.TextRange(m6458getMinimpl, m6457getMaximpl);
    }
}
