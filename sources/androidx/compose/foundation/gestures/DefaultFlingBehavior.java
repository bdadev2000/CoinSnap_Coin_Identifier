package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import h0.g;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DefaultFlingBehavior implements FlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public DecayAnimationSpec f3143a;

    /* renamed from: b, reason: collision with root package name */
    public final MotionDurationScale f3144b;

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec) {
        ScrollableKt$DefaultScrollMotionDurationScale$1 scrollableKt$DefaultScrollMotionDurationScale$1 = ScrollableKt.f3434b;
        this.f3143a = decayAnimationSpec;
        this.f3144b = scrollableKt$DefaultScrollMotionDurationScale$1;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public final Object a(ScrollingLogic$doFlingAnimation$2$reverseScope$1 scrollingLogic$doFlingAnimation$2$reverseScope$1, float f2, g gVar) {
        return e.G(gVar, this.f3144b, new DefaultFlingBehavior$performFling$2(f2, this, scrollingLogic$doFlingAnimation$2$reverseScope$1, null));
    }
}
