package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import p0.a;

@Immutable
/* loaded from: classes2.dex */
public final class BorderStroke {

    /* renamed from: a, reason: collision with root package name */
    public final float f2608a;

    /* renamed from: b, reason: collision with root package name */
    public final Brush f2609b;

    public BorderStroke(float f2, SolidColor solidColor) {
        this.f2608a = f2;
        this.f2609b = solidColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.a(this.f2608a, borderStroke.f2608a) && a.g(this.f2609b, borderStroke.f2609b);
    }

    public final int hashCode() {
        return this.f2609b.hashCode() + (Float.hashCode(this.f2608a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) Dp.b(this.f2608a)) + ", brush=" + this.f2609b + ')';
    }
}
