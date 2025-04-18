package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    @Override // androidx.compose.ui.unit.Density
    default float H(int i2) {
        return i2 / getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    default float I(float f2) {
        return f2 / getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    default long L(long j2) {
        if (j2 != 9205357640488583168L) {
            return SizeKt.a(y1(DpSize.b(j2)), y1(DpSize.a(j2)));
        }
        return 9205357640488583168L;
    }

    List k0(int i2, long j2);

    @Override // androidx.compose.ui.unit.FontScaling
    default long o(float f2) {
        return TextUnitKt.d(4294967296L, f2 / x1());
    }

    @Override // androidx.compose.ui.unit.Density
    default long p(long j2) {
        if (j2 != 9205357640488583168L) {
            return DpKt.b(I(Size.d(j2)), I(Size.b(j2)));
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    default float r(long j2) {
        if (!TextUnitType.a(TextUnit.b(j2), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return x1() * TextUnit.c(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    default long u(float f2) {
        return TextUnitKt.d(4294967296L, f2 / (getDensity() * x1()));
    }
}
