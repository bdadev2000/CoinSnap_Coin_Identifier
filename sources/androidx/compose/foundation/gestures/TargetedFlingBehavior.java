package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import h0.g;
import q0.l;

@Stable
/* loaded from: classes3.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    default Object a(ScrollingLogic$doFlingAnimation$2$reverseScope$1 scrollingLogic$doFlingAnimation$2$reverseScope$1, float f2, g gVar) {
        return b(scrollingLogic$doFlingAnimation$2$reverseScope$1, f2, TargetedFlingBehaviorKt$NoOnReport$1.f3582a, gVar);
    }

    Object b(ScrollingLogic$doFlingAnimation$2$reverseScope$1 scrollingLogic$doFlingAnimation$2$reverseScope$1, float f2, l lVar, g gVar);
}
