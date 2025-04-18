package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.SubcomposeMeasureScope;

/* loaded from: classes3.dex */
public final class WindowInsetsKt {
    public static final WindowInsets a() {
        return new FixedIntInsets();
    }

    public static final PaddingValues b(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope) {
        return new InsetsPaddingValues(windowInsets, subcomposeMeasureScope);
    }

    public static final WindowInsets c(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets d(WindowInsets windowInsets, int i2) {
        return new LimitInsets(windowInsets, i2);
    }
}
