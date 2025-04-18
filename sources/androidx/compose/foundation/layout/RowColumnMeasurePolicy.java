package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;

/* loaded from: classes2.dex */
public interface RowColumnMeasurePolicy {
    long a(int i2, int i3, int i4, int i5, boolean z2);

    void b(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope);

    MeasureResult c(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7);

    int d(Placeable placeable);

    int e(Placeable placeable);
}
