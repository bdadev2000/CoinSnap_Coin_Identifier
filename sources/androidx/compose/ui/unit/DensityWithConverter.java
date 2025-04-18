package androidx.compose.ui.unit;

import android.support.v4.media.d;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DensityWithConverter implements Density {

    /* renamed from: a, reason: collision with root package name */
    public final float f17483a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17484b;

    /* renamed from: c, reason: collision with root package name */
    public final FontScaleConverter f17485c;

    public DensityWithConverter(float f2, float f3, FontScaleConverter fontScaleConverter) {
        this.f17483a = f2;
        this.f17484b = f3;
        this.f17485c = fontScaleConverter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.f17483a, densityWithConverter.f17483a) == 0 && Float.compare(this.f17484b, densityWithConverter.f17484b) == 0 && a.g(this.f17485c, densityWithConverter.f17485c);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f17483a;
    }

    public final int hashCode() {
        return this.f17485c.hashCode() + d.b(this.f17484b, Float.hashCode(this.f17483a) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long o(float f2) {
        return TextUnitKt.d(4294967296L, this.f17485c.a(f2));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j2) {
        if (TextUnitType.a(TextUnit.b(j2), 4294967296L)) {
            return this.f17485c.b(TextUnit.c(j2));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f17483a + ", fontScale=" + this.f17484b + ", converter=" + this.f17485c + ')';
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f17484b;
    }
}
