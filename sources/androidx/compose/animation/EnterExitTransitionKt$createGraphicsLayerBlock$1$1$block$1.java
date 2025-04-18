package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f1825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f1826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f1827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData, Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData2, Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData3) {
        super(1);
        this.f1825a = deferredAnimationData;
        this.f1826b = deferredAnimationData2;
        this.f1827c = deferredAnimationData3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        State state = this.f1825a;
        graphicsLayerScope.c(state != null ? ((Number) state.getValue()).floatValue() : 1.0f);
        State state2 = this.f1826b;
        graphicsLayerScope.e(state2 != null ? ((Number) state2.getValue()).floatValue() : 1.0f);
        graphicsLayerScope.k(state2 != null ? ((Number) state2.getValue()).floatValue() : 1.0f);
        State state3 = this.f1827c;
        graphicsLayerScope.G0(state3 != null ? ((TransformOrigin) state3.getValue()).f15061a : TransformOrigin.f15059b);
        return b0.f30125a;
    }
}
