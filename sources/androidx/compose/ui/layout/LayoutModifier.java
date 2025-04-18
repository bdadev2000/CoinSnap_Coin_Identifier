package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasuringIntrinsics;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes2.dex */
public interface LayoutModifier extends Modifier.Element {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return m(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics.IntrinsicMinMax.f15808a, MeasuringIntrinsics.IntrinsicWidthHeight.f15812b), ConstraintsKt.b(i2, 0, 13)).getHeight();
    }

    default int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return m(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics.IntrinsicMinMax.f15808a, MeasuringIntrinsics.IntrinsicWidthHeight.f15811a), ConstraintsKt.b(0, i2, 7)).getWidth();
    }

    default int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return m(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics.IntrinsicMinMax.f15809b, MeasuringIntrinsics.IntrinsicWidthHeight.f15811a), ConstraintsKt.b(0, i2, 7)).getWidth();
    }

    MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2);

    default int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return m(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics.IntrinsicMinMax.f15809b, MeasuringIntrinsics.IntrinsicWidthHeight.f15812b), ConstraintsKt.b(i2, 0, 13)).getHeight();
    }
}
