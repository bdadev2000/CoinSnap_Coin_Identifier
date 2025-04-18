package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ColorStyle implements TextForegroundStyle {

    /* renamed from: a, reason: collision with root package name */
    public final long f17450a;

    public ColorStyle(long j2) {
        this.f17450a = j2;
        if (j2 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float a() {
        return Color.d(this.f17450a);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final long b() {
        return this.f17450a;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final Brush e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.c(this.f17450a, ((ColorStyle) obj).f17450a);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f17450a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) Color.i(this.f17450a)) + ')';
    }
}
