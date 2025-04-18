package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes3.dex */
public interface WindowInsets {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    int a(Density density);

    int b(Density density, LayoutDirection layoutDirection);

    int c(Density density);

    int d(Density density, LayoutDirection layoutDirection);
}
