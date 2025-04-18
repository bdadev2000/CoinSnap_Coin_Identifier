package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

@Immutable
/* loaded from: classes3.dex */
public interface FontScaling {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    default long o(float f2) {
        float[] fArr = FontScaleConverterFactory.f17503a;
        if (!(x1() >= 1.03f)) {
            return TextUnitKt.d(4294967296L, f2 / x1());
        }
        FontScaleConverter a2 = FontScaleConverterFactory.a(x1());
        return TextUnitKt.d(4294967296L, a2 != null ? a2.a(f2) : f2 / x1());
    }

    default float r(long j2) {
        if (!TextUnitType.a(TextUnit.b(j2), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = FontScaleConverterFactory.f17503a;
        if (x1() < 1.03f) {
            return x1() * TextUnit.c(j2);
        }
        FontScaleConverter a2 = FontScaleConverterFactory.a(x1());
        float c2 = TextUnit.c(j2);
        return a2 == null ? x1() * c2 : a2.b(c2);
    }

    float x1();
}
