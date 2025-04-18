package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class CursorAnchorInfoApi34Helper {
    @DoNotInline
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextLayoutResult textLayoutResult, @NotNull Rect rect) {
        if (!rect.j()) {
            int c2 = textLayoutResult.f17047b.c(rect.f14915b);
            float f2 = rect.d;
            MultiParagraph multiParagraph = textLayoutResult.f17047b;
            int c3 = multiParagraph.c(f2);
            if (c2 <= c3) {
                while (true) {
                    builder.addVisibleLineBounds(textLayoutResult.g(c2), multiParagraph.d(c2), textLayoutResult.h(c2), multiParagraph.b(c2));
                    if (c2 == c3) {
                        break;
                    }
                    c2++;
                }
            }
        }
        return builder;
    }
}
