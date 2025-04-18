package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final DrawStyle f17442a;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.f17442a = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            Fill fill = Fill.f15146a;
            DrawStyle drawStyle = this.f17442a;
            if (a.g(drawStyle, fill)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) drawStyle).f15147a);
                textPaint.setStrokeMiter(((Stroke) drawStyle).f15148b);
                int i2 = ((Stroke) drawStyle).d;
                textPaint.setStrokeJoin(StrokeJoin.a(i2, 0) ? Paint.Join.MITER : StrokeJoin.a(i2, 1) ? Paint.Join.ROUND : StrokeJoin.a(i2, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i3 = ((Stroke) drawStyle).f15149c;
                textPaint.setStrokeCap(StrokeCap.a(i3, 0) ? Paint.Cap.BUTT : StrokeCap.a(i3, 1) ? Paint.Cap.ROUND : StrokeCap.a(i3, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                PathEffect pathEffect = ((Stroke) drawStyle).e;
                if (pathEffect != null) {
                }
                textPaint.setPathEffect(null);
            }
        }
    }
}
