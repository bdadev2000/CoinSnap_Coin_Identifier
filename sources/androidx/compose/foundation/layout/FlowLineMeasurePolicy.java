package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import e0.x;

/* loaded from: classes.dex */
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default long a(int i2, int i3, int i4, int i5, boolean z2) {
        if (isHorizontal()) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.f4087a;
            return !z2 ? ConstraintsKt.a(i2, i4, i3, i5) : Constraints.Companion.b(i2, i4, i3, i5);
        }
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.f3829a;
        return !z2 ? ConstraintsKt.a(i3, i5, i2, i4) : Constraints.Companion.a(i3, i5, i2, i4);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void b(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (isHorizontal()) {
            j().c(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
        } else {
            l().b(measureScope, i2, iArr, iArr2);
        }
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default MeasureResult c(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (isHorizontal()) {
            i9 = i3;
            i8 = i4;
        } else {
            i8 = i3;
            i9 = i4;
        }
        return measureScope.T(i9, i8, x.f30219a, new FlowLineMeasurePolicy$placeHelper$1$1(iArr2, i5, i6, i7, placeableArr, this, i4, measureScope, i2, iArr));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int d(Placeable placeable) {
        return isHorizontal() ? placeable.h0() : placeable.g0();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int e(Placeable placeable) {
        return isHorizontal() ? placeable.g0() : placeable.h0();
    }

    CrossAxisAlignment f();

    boolean isHorizontal();

    Arrangement.Horizontal j();

    default int k(int i2, int i3, RowColumnParentData rowColumnParentData, Placeable placeable, LayoutDirection layoutDirection) {
        CrossAxisAlignment f2;
        if (rowColumnParentData == null || (f2 = rowColumnParentData.f4086c) == null) {
            f2 = f();
        }
        int e = i2 - e(placeable);
        if (isHorizontal()) {
            layoutDirection = LayoutDirection.f17494a;
        }
        return f2.a(e, layoutDirection, placeable, i3);
    }

    Arrangement.Vertical l();
}
