package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.google.android.gms.common.api.Api;

@Immutable
/* loaded from: classes3.dex */
public interface Density extends FontScaling {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    default int C1(long j2) {
        return Math.round(J0(j2));
    }

    default int F0(float f2) {
        float y1 = y1(f2);
        return Float.isInfinite(y1) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Math.round(y1);
    }

    default float H(int i2) {
        return i2 / getDensity();
    }

    default float I(float f2) {
        return f2 / getDensity();
    }

    default float J0(long j2) {
        if (TextUnitType.a(TextUnit.b(j2), 4294967296L)) {
            return y1(r(j2));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    default long L(long j2) {
        if (j2 != 9205357640488583168L) {
            return SizeKt.a(y1(DpSize.b(j2)), y1(DpSize.a(j2)));
        }
        return 9205357640488583168L;
    }

    float getDensity();

    default long p(long j2) {
        if (j2 != 9205357640488583168L) {
            return DpKt.b(I(Size.d(j2)), I(Size.b(j2)));
        }
        return 9205357640488583168L;
    }

    default long u(float f2) {
        return o(I(f2));
    }

    default float y1(float f2) {
        return getDensity() * f2;
    }
}
