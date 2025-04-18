package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidTextPaint extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public AndroidPaint f17417a;

    /* renamed from: b, reason: collision with root package name */
    public TextDecoration f17418b;

    /* renamed from: c, reason: collision with root package name */
    public int f17419c;
    public Shadow d;
    public Brush e;

    /* renamed from: f, reason: collision with root package name */
    public State f17420f;

    /* renamed from: g, reason: collision with root package name */
    public Size f17421g;

    /* renamed from: h, reason: collision with root package name */
    public DrawStyle f17422h;

    public final Paint a() {
        AndroidPaint androidPaint = this.f17417a;
        if (androidPaint != null) {
            return androidPaint;
        }
        AndroidPaint androidPaint2 = new AndroidPaint(this);
        this.f17417a = androidPaint2;
        return androidPaint2;
    }

    public final void b(int i2) {
        if (BlendMode.a(i2, this.f17419c)) {
            return;
        }
        a().r(i2);
        this.f17419c = i2;
    }

    public final void c(Brush brush, long j2, float f2) {
        Size size;
        if (brush == null) {
            this.f17420f = null;
            this.e = null;
            this.f17421g = null;
            setShader(null);
            return;
        }
        if (brush instanceof SolidColor) {
            d(TextDrawStyleKt.b(((SolidColor) brush).f15055a, f2));
            return;
        }
        if (brush instanceof ShaderBrush) {
            if ((!a.g(this.e, brush) || (size = this.f17421g) == null || !Size.a(size.f14923a, j2)) && j2 != 9205357640488583168L) {
                this.e = brush;
                this.f17421g = new Size(j2);
                this.f17420f = SnapshotStateKt.e(new AndroidTextPaint$setBrush$1(brush, j2));
            }
            Paint a2 = a();
            State state = this.f17420f;
            ((AndroidPaint) a2).x(state != null ? (Shader) state.getValue() : null);
            AndroidTextPaint_androidKt.a(this, f2);
        }
    }

    public final void d(long j2) {
        if (j2 != 16) {
            setColor(ColorKt.j(j2));
            this.f17420f = null;
            this.e = null;
            this.f17421g = null;
            setShader(null);
        }
    }

    public final void e(DrawStyle drawStyle) {
        if (drawStyle == null || a.g(this.f17422h, drawStyle)) {
            return;
        }
        this.f17422h = drawStyle;
        if (a.g(drawStyle, Fill.f15146a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            a().C(1);
            Stroke stroke = (Stroke) drawStyle;
            a().D(stroke.f15147a);
            a().A(stroke.f15148b);
            a().u(stroke.d);
            a().q(stroke.f15149c);
            a().t(stroke.e);
        }
    }

    public final void f(Shadow shadow) {
        if (shadow == null || a.g(this.d, shadow)) {
            return;
        }
        this.d = shadow;
        if (a.g(shadow, Shadow.d)) {
            clearShadowLayer();
            return;
        }
        Shadow shadow2 = this.d;
        float f2 = shadow2.f15041c;
        if (f2 == 0.0f) {
            f2 = Float.MIN_VALUE;
        }
        setShadowLayer(f2, Offset.g(shadow2.f15040b), Offset.h(this.d.f15040b), ColorKt.j(this.d.f15039a));
    }

    public final void g(TextDecoration textDecoration) {
        if (textDecoration == null || a.g(this.f17418b, textDecoration)) {
            return;
        }
        this.f17418b = textDecoration;
        setUnderlineText(textDecoration.a(TextDecoration.f17465c));
        setStrikeThruText(this.f17418b.a(TextDecoration.d));
    }
}
