package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;

/* loaded from: classes4.dex */
public final class MultiWidgetSelectionDelegateKt {
    public static final Direction a(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j2, Selection.AnchorInfo anchorInfo) {
        if (anchorInfo == null) {
            return SelectionLayoutKt.c(direction, direction2);
        }
        int compare = selectionLayoutBuilder.f7191f.compare(Long.valueOf(anchorInfo.f7088c), Long.valueOf(j2));
        return compare < 0 ? Direction.f7056a : compare > 0 ? Direction.f7058c : Direction.f7057b;
    }

    public static final int b(long j2, TextLayoutResult textLayoutResult) {
        if (Offset.h(j2) <= 0.0f) {
            return 0;
        }
        float h2 = Offset.h(j2);
        MultiParagraph multiParagraph = textLayoutResult.f17047b;
        return h2 >= multiParagraph.e ? textLayoutResult.f17046a.f17038a.f16880a.length() : multiParagraph.e(j2);
    }
}
