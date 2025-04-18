package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;

/* loaded from: classes4.dex */
public final class InfiniteAnimationPolicyKt {
    public static final Object a(q0.l lVar, h0.g gVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) gVar.getContext().i(InfiniteAnimationPolicy.Key.f16514a);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.a(gVar.getContext()).b0(lVar, gVar);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null);
        return infiniteAnimationPolicy.Y();
    }
}
