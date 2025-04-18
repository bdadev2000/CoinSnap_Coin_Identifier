package androidx.compose.material3;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$7$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f10719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f10720c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f10721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ State f10723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ State f10724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$7$1(int i2, float f2, InfiniteTransition.TransitionAnimationState transitionAnimationState, long j2, InfiniteTransition.TransitionAnimationState transitionAnimationState2, long j3, InfiniteTransition.TransitionAnimationState transitionAnimationState3, InfiniteTransition.TransitionAnimationState transitionAnimationState4) {
        super(1);
        this.f10718a = i2;
        this.f10719b = f2;
        this.f10720c = transitionAnimationState;
        this.d = j2;
        this.f10721f = transitionAnimationState2;
        this.f10722g = j3;
        this.f10723h = transitionAnimationState3;
        this.f10724i = transitionAnimationState4;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float b2 = Size.b(drawScope.b());
        boolean a2 = StrokeCap.a(this.f10718a, 0);
        float f2 = this.f10719b;
        if (!a2 && Size.b(drawScope.b()) <= Size.d(drawScope.b())) {
            f2 += drawScope.I(b2);
        }
        float I = f2 / drawScope.I(Size.d(drawScope.b()));
        State state = this.f10720c;
        if (((Number) state.getValue()).floatValue() < 1.0f - I) {
            ProgressIndicatorKt.g(drawScope, ((Number) state.getValue()).floatValue() > 0.0f ? ((Number) state.getValue()).floatValue() + I : 0.0f, 1.0f, this.d, b2, this.f10718a);
        }
        float floatValue = ((Number) state.getValue()).floatValue();
        State state2 = this.f10721f;
        if (floatValue - ((Number) state2.getValue()).floatValue() > 0.0f) {
            ProgressIndicatorKt.g(drawScope, ((Number) state.getValue()).floatValue(), ((Number) state2.getValue()).floatValue(), this.f10722g, b2, this.f10718a);
        }
        float floatValue2 = ((Number) state2.getValue()).floatValue();
        State state3 = this.f10723h;
        if (floatValue2 > I) {
            ProgressIndicatorKt.g(drawScope, ((Number) state3.getValue()).floatValue() > 0.0f ? ((Number) state3.getValue()).floatValue() + I : 0.0f, ((Number) state2.getValue()).floatValue() < 1.0f ? ((Number) state2.getValue()).floatValue() - I : 1.0f, this.d, b2, this.f10718a);
        }
        float floatValue3 = ((Number) state3.getValue()).floatValue();
        State state4 = this.f10724i;
        if (floatValue3 - ((Number) state4.getValue()).floatValue() > 0.0f) {
            ProgressIndicatorKt.g(drawScope, ((Number) state3.getValue()).floatValue(), ((Number) state4.getValue()).floatValue(), this.f10722g, b2, this.f10718a);
        }
        if (((Number) state4.getValue()).floatValue() > I) {
            ProgressIndicatorKt.g(drawScope, 0.0f, ((Number) state4.getValue()).floatValue() < 1.0f ? ((Number) state4.getValue()).floatValue() - I : 1.0f, this.d, b2, this.f10718a);
        }
        return b0.f30125a;
    }
}
