package androidx.compose.material3.internal;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f13072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1(Transition.TransitionAnimationState transitionAnimationState) {
        super(0);
        this.f13072a = transitionAnimationState;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(((Number) this.f13072a.getValue()).floatValue() > 0.0f);
    }
}
