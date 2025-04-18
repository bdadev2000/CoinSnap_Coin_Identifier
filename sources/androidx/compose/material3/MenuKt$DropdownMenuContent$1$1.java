package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f9742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f9743c;
    public final /* synthetic */ State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f9744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(boolean z2, MutableTransitionState mutableTransitionState, MutableState mutableState, Transition.TransitionAnimationState transitionAnimationState, Transition.TransitionAnimationState transitionAnimationState2) {
        super(1);
        this.f9741a = z2;
        this.f9742b = mutableTransitionState;
        this.f9743c = mutableState;
        this.d = transitionAnimationState;
        this.f9744f = transitionAnimationState2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        float f3 = 0.8f;
        State state = this.d;
        float f4 = 1.0f;
        MutableTransitionState mutableTransitionState = this.f9742b;
        boolean z2 = this.f9741a;
        if (z2) {
            f2 = ((Boolean) mutableTransitionState.f2135c.getValue()).booleanValue() ? 1.0f : 0.8f;
        } else {
            float f5 = MenuKt.f9737a;
            f2 = ((Number) state.getValue()).floatValue();
        }
        graphicsLayerScope.e(f2);
        if (!z2) {
            float f6 = MenuKt.f9737a;
            f3 = ((Number) state.getValue()).floatValue();
        } else if (((Boolean) mutableTransitionState.f2135c.getValue()).booleanValue()) {
            f3 = 1.0f;
        }
        graphicsLayerScope.k(f3);
        if (!z2) {
            float f7 = MenuKt.f9737a;
            f4 = ((Number) this.f9744f.getValue()).floatValue();
        } else if (!((Boolean) mutableTransitionState.f2135c.getValue()).booleanValue()) {
            f4 = 0.0f;
        }
        graphicsLayerScope.c(f4);
        graphicsLayerScope.G0(((TransformOrigin) this.f9743c.getValue()).f15061a);
        return b0.f30125a;
    }
}
