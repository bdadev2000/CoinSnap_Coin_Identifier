package androidx.compose.ui.text.platform;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    public static final void a(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        ArrayList arrayList = multiParagraph.f16916h;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i3);
            paragraphInfo.f16928a.p(canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
            canvas.h(0.0f, paragraphInfo.f16928a.getHeight());
        }
    }
}
