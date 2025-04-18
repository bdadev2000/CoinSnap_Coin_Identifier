package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.IntervalTree;

@Immutable
/* loaded from: classes4.dex */
public final class PathEasing implements Easing {
    @Override // androidx.compose.animation.core.Easing
    public final float b(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        new IntervalTree();
        throw null;
    }
}
