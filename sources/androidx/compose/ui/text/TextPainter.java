package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextPainter {
    public static void a(Canvas canvas, TextLayoutResult textLayoutResult) {
        boolean d = textLayoutResult.d();
        TextLayoutInput textLayoutInput = textLayoutResult.f17046a;
        boolean z2 = d && !TextOverflow.a(textLayoutInput.f17041f, 3);
        if (z2) {
            long j2 = textLayoutResult.f17048c;
            Rect a2 = RectKt.a(0L, SizeKt.a((int) (j2 >> 32), (int) (j2 & 4294967295L)));
            canvas.p();
            canvas.t(1, a2);
        }
        SpanStyle spanStyle = textLayoutInput.f17039b.f17059a;
        TextDecoration textDecoration = spanStyle.f17027m;
        TextForegroundStyle textForegroundStyle = spanStyle.f17017a;
        if (textDecoration == null) {
            textDecoration = TextDecoration.f17464b;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.f17028n;
        if (shadow == null) {
            shadow = Shadow.d;
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle.f17030p;
        if (drawStyle == null) {
            drawStyle = Fill.f15146a;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush e = textForegroundStyle.e();
            TextForegroundStyle.Unspecified unspecified = TextForegroundStyle.Unspecified.f17468a;
            if (e != null) {
                MultiParagraph.h(textLayoutResult.f17047b, canvas, e, textForegroundStyle != unspecified ? textForegroundStyle.a() : 1.0f, shadow2, textDecoration2, drawStyle2);
            } else {
                MultiParagraph.g(textLayoutResult.f17047b, canvas, textForegroundStyle != unspecified ? textForegroundStyle.b() : Color.f14957b, shadow2, textDecoration2, drawStyle2, 0, 32);
            }
            if (z2) {
                canvas.i();
            }
        } catch (Throwable th) {
            if (z2) {
                canvas.i();
            }
            throw th;
        }
    }
}
