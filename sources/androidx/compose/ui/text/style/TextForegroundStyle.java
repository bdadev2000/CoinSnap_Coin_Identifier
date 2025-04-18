package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import q0.a;

/* loaded from: classes2.dex */
public interface TextForegroundStyle {

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static TextForegroundStyle a(float f2, Brush brush) {
            if (brush == null) {
                return Unspecified.f17468a;
            }
            if (brush instanceof SolidColor) {
                return b(TextDrawStyleKt.b(((SolidColor) brush).f15055a, f2));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f2);
            }
            throw new RuntimeException();
        }

        public static TextForegroundStyle b(long j2) {
            return j2 != 16 ? new ColorStyle(j2) : Unspecified.f17468a;
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Unspecified implements TextForegroundStyle {

        /* renamed from: a, reason: collision with root package name */
        public static final Unspecified f17468a = new Object();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final float a() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final long b() {
            int i2 = Color.f14963j;
            return Color.f14962i;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final Brush e() {
            return null;
        }
    }

    float a();

    long b();

    default TextForegroundStyle c(a aVar) {
        return !p0.a.g(this, Unspecified.f17468a) ? this : (TextForegroundStyle) aVar.invoke();
    }

    default TextForegroundStyle d(TextForegroundStyle textForegroundStyle) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        if (!z2 || !(this instanceof BrushStyle)) {
            return (!z2 || (this instanceof BrushStyle)) ? (z2 || !(this instanceof BrushStyle)) ? textForegroundStyle.c(new TextForegroundStyle$merge$2(this)) : this : textForegroundStyle;
        }
        BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
        float a2 = textForegroundStyle.a();
        TextForegroundStyle$merge$1 textForegroundStyle$merge$1 = new TextForegroundStyle$merge$1(this);
        if (Float.isNaN(a2)) {
            a2 = ((Number) textForegroundStyle$merge$1.invoke()).floatValue();
        }
        return new BrushStyle(brushStyle.f17448a, a2);
    }

    Brush e();
}
