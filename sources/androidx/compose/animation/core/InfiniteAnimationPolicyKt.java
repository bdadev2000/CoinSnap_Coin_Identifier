package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import j0.c;
import q0.l;

/* loaded from: classes2.dex */
public final class InfiniteAnimationPolicyKt {
    public static final Object a(l lVar, c cVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) cVar.getContext().i(InfiniteAnimationPolicy.Key.f16514a);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.a(cVar.getContext()).b0(lVar, cVar);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null);
        return infiniteAnimationPolicy.Y();
    }
}
