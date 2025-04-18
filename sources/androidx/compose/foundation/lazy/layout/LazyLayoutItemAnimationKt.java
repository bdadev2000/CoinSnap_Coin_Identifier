package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;

/* loaded from: classes.dex */
public final class LazyLayoutItemAnimationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SpringSpec f4752a;

    static {
        Rect rect = VisibilityThresholdsKt.f2404a;
        f4752a = AnimationSpecKt.c(0.0f, 400.0f, new IntOffset(IntOffsetKt.a(1, 1)), 1);
    }
}
