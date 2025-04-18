package androidx.compose.ui.text.style;

import android.support.v4.media.d;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import p0.a;

/* loaded from: classes2.dex */
final class BrushStyle implements TextForegroundStyle {

    /* renamed from: a, reason: collision with root package name */
    public final ShaderBrush f17448a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17449b;

    public BrushStyle(ShaderBrush shaderBrush, float f2) {
        this.f17448a = shaderBrush;
        this.f17449b = f2;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float a() {
        return this.f17449b;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final long b() {
        int i2 = Color.f14963j;
        return Color.f14962i;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final Brush e() {
        return this.f17448a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return a.g(this.f17448a, brushStyle.f17448a) && Float.compare(this.f17449b, brushStyle.f17449b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17449b) + (this.f17448a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f17448a);
        sb.append(", alpha=");
        return d.n(sb, this.f17449b, ')');
    }
}
