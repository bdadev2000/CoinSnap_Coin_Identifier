package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle a(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f2) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        if (!z2 && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.b(ColorKt.h(textForegroundStyle.b(), textForegroundStyle2.b(), f2));
        }
        if (!z2 || !(textForegroundStyle2 instanceof BrushStyle)) {
            return (TextForegroundStyle) SpanStyleKt.b(f2, textForegroundStyle, textForegroundStyle2);
        }
        return TextForegroundStyle.Companion.a(MathHelpersKt.b(textForegroundStyle.a(), textForegroundStyle2.a(), f2), (Brush) SpanStyleKt.b(f2, ((BrushStyle) textForegroundStyle).f17448a, ((BrushStyle) textForegroundStyle2).f17448a));
    }

    public static final long b(long j2, float f2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : Color.b(j2, Color.d(j2) * f2);
    }
}
