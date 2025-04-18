package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes4.dex */
public final class PaddingKt {
    public static PaddingValuesImpl a(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        float f3 = (i2 & 2) != 0 ? 0 : 0.0f;
        return new PaddingValuesImpl(f2, f3, f2, f3);
    }

    public static PaddingValuesImpl b(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return new PaddingValuesImpl(f2, f3, f4, f5);
    }

    public static final float c(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f17494a ? paddingValues.c(layoutDirection) : paddingValues.b(layoutDirection);
    }

    public static final float d(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f17494a ? paddingValues.b(layoutDirection) : paddingValues.c(layoutDirection);
    }

    public static final Modifier e(Modifier modifier, PaddingValues paddingValues) {
        return modifier.T0(new PaddingValuesElement(paddingValues));
    }

    public static final Modifier f(Modifier modifier, float f2) {
        return modifier.T0(new PaddingElement(f2, f2, f2, f2));
    }

    public static final Modifier g(Modifier modifier, float f2, float f3) {
        return modifier.T0(new PaddingElement(f2, f3, f2, f3));
    }

    public static Modifier h(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return g(modifier, f2, f3);
    }

    public static final Modifier i(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.T0(new PaddingElement(f2, f3, f4, f5));
    }

    public static Modifier j(Modifier modifier, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return i(modifier, f2, f3, f4, f5);
    }
}
