package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.TextAndroidCanvas;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class IndentationFixSpan implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z2, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i7)) != layout.getLineCount() - 1) {
            return;
        }
        TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f17128a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float b2 = IndentationFixSpan_androidKt.b(layout, lineForOffset, paint) + IndentationFixSpan_androidKt.a(layout, lineForOffset, paint);
            if (b2 == 0.0f) {
                return;
            }
            a.p(canvas);
            canvas.translate(b2, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z2) {
        return 0;
    }
}
