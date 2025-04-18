package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;

/* loaded from: classes3.dex */
public final class ClickableTextKt {
    public static final Integer a(MutableState mutableState, long j2) {
        MultiParagraph multiParagraph;
        TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
        if (textLayoutResult == null || (multiParagraph = textLayoutResult.f17047b) == null) {
            return null;
        }
        float g2 = Offset.g(j2);
        float h2 = Offset.h(j2);
        if (g2 <= 0.0f || h2 < 0.0f || g2 > multiParagraph.d || h2 > multiParagraph.e) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.e(j2));
        }
        return null;
    }
}
