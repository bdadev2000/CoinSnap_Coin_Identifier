package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.style.TextDecoration;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldDelegate {

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static TransformedText a(long j2, TransformedText transformedText) {
            int i2 = TextRange.f17057c;
            OffsetMapping offsetMapping = transformedText.f17393b;
            int b2 = offsetMapping.b((int) (j2 >> 32));
            int b3 = offsetMapping.b((int) (j2 & 4294967295L));
            int min = Math.min(b2, b3);
            int max = Math.max(b2, b3);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.f17392a);
            builder.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.f17465c, null, 61439), min, max);
            return new TransformedText(builder.f(), offsetMapping);
        }

        public static void b(Canvas canvas, long j2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, AndroidPaint androidPaint) {
            int b2 = offsetMapping.b(TextRange.f(j2));
            int b3 = offsetMapping.b(TextRange.e(j2));
            if (b2 != b3) {
                canvas.s(textLayoutResult.k(b2, b3), androidPaint);
            }
        }

        public static void c(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z2, OffsetMapping offsetMapping) {
            long a2;
            Rect rect;
            if (z2) {
                int b2 = offsetMapping.b(TextRange.e(textFieldValue.f17362b));
                if (b2 < textLayoutResult.f17046a.f17038a.f16880a.length()) {
                    rect = textLayoutResult.b(b2);
                } else if (b2 != 0) {
                    rect = textLayoutResult.b(b2 - 1);
                } else {
                    a2 = TextFieldDelegateKt.a(textDelegate.f6108b, textDelegate.f6111g, textDelegate.f6112h, TextFieldDelegateKt.f6131a, 1);
                    rect = new Rect(0.0f, 0.0f, 1.0f, (int) (a2 & 4294967295L));
                }
                long e02 = layoutCoordinates.e0(OffsetKt.a(rect.f14914a, rect.f14915b));
                Rect a3 = RectKt.a(OffsetKt.a(Offset.g(e02), Offset.h(e02)), SizeKt.a(rect.h(), rect.e()));
                if (p0.a.g((TextInputSession) textInputSession.f17390a.f17367b.get(), textInputSession)) {
                    textInputSession.f17391b.h(a3);
                }
            }
        }
    }
}
