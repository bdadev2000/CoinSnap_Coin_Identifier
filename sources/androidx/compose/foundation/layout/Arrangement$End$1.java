package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class Arrangement$End$1 implements Arrangement.Horizontal {
    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public final void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.f17494a) {
            Arrangement.c(i2, iArr, iArr2, false);
        } else {
            Arrangement.b(iArr, iArr2, true);
        }
    }

    public final String toString() {
        return "Arrangement#End";
    }
}
