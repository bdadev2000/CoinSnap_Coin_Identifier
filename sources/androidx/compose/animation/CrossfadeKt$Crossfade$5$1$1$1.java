package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class CrossfadeKt$Crossfade$5$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f1798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$1$1(Transition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.f1798a = transitionAnimationState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((GraphicsLayerScope) obj).c(((Number) this.f1798a.getValue()).floatValue());
        return b0.f30125a;
    }
}
