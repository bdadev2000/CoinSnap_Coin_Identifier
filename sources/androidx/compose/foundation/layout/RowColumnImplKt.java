package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Placeable;

/* loaded from: classes3.dex */
public final class RowColumnImplKt {
    public static final RowColumnParentData a(IntrinsicMeasurable intrinsicMeasurable) {
        Object m2 = intrinsicMeasurable.m();
        if (m2 instanceof RowColumnParentData) {
            return (RowColumnParentData) m2;
        }
        return null;
    }

    public static final RowColumnParentData b(Placeable placeable) {
        Object m2 = placeable.m();
        if (m2 instanceof RowColumnParentData) {
            return (RowColumnParentData) m2;
        }
        return null;
    }

    public static final float c(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.f4084a;
        }
        return 0.0f;
    }
}
