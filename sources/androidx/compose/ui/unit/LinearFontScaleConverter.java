package androidx.compose.ui.unit;

import android.support.v4.media.d;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LinearFontScaleConverter implements FontScaleConverter {

    /* renamed from: a, reason: collision with root package name */
    public final float f17497a;

    public LinearFontScaleConverter(float f2) {
        this.f17497a = f2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float a(float f2) {
        return f2 / this.f17497a;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float b(float f2) {
        return f2 * this.f17497a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.f17497a, ((LinearFontScaleConverter) obj).f17497a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17497a);
    }

    public final String toString() {
        return d.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f17497a, ')');
    }
}
