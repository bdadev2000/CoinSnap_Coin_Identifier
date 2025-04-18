package androidx.compose.material3.internal;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes2.dex */
public final class MenuPosition {

    @Stable
    /* loaded from: classes2.dex */
    public interface Horizontal {
        int a(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection);
    }

    @Stable
    /* loaded from: classes2.dex */
    public interface Vertical {
        int a(IntRect intRect, long j2, int i2);
    }
}
