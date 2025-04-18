package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f1680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.f1680a = animatedContentTransitionScopeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        State state = (State) this.f1680a.d.c(obj);
        return new IntSize(state != null ? ((IntSize) state.getValue()).f17493a : 0L);
    }
}
