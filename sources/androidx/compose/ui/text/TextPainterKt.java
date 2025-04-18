package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.common.api.Api;

/* loaded from: classes4.dex */
public final class TextPainterKt {
    public static void a(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j2, TextStyle textStyle) {
        TextLayoutResult a2 = TextMeasurer.a(textMeasurer, new AnnotatedString(str, null, 6), textStyle, 1, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, ConstraintsKt.a(0, Math.round((float) Math.ceil(Size.d(drawScope.b()) - Offset.g(j2))), 0, Math.round((float) Math.ceil(Size.b(drawScope.b()) - Offset.h(j2)))), drawScope.getLayoutDirection(), drawScope, null, 1568);
        CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
        long b2 = A1.b();
        A1.a().p();
        try {
            CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = A1.f15139a;
            canvasDrawScopeKt$asDrawTransform$1.g(Offset.g(j2), Offset.h(j2));
            if (a2.d() && !TextOverflow.a(a2.f17046a.f17041f, 3)) {
                long j3 = a2.f17048c;
                canvasDrawScopeKt$asDrawTransform$1.b(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            MultiParagraph.g(a2.f17047b, drawScope.A1().a(), 0L, null, null, null, 3, 30);
        } finally {
            d.A(A1, b2);
        }
    }
}
