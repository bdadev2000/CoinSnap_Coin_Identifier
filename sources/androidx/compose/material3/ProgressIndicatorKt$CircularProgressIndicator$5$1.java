package androidx.compose.material3;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$5$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Stroke f10644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f10645c;
    public final /* synthetic */ State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f10646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ State f10647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10648h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10649i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$5$1(long j2, Stroke stroke, InfiniteTransition.TransitionAnimationState transitionAnimationState, InfiniteTransition.TransitionAnimationState transitionAnimationState2, InfiniteTransition.TransitionAnimationState transitionAnimationState3, InfiniteTransition.TransitionAnimationState transitionAnimationState4, float f2, long j3) {
        super(1);
        this.f10643a = j2;
        this.f10644b = stroke;
        this.f10645c = transitionAnimationState;
        this.d = transitionAnimationState2;
        this.f10646f = transitionAnimationState3;
        this.f10647g = transitionAnimationState4;
        this.f10648h = f2;
        this.f10649i = j3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2;
        DrawScope drawScope = (DrawScope) obj;
        ProgressIndicatorKt.h(drawScope, 0.0f, 360.0f, this.f10643a, this.f10644b);
        float floatValue = (((Number) this.f10645c.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.d.getValue()).floatValue();
        State state = this.f10646f;
        float abs = Math.abs(floatValue2 - ((Number) state.getValue()).floatValue());
        float floatValue3 = ((Number) state.getValue()).floatValue() + ((Number) this.f10647g.getValue()).floatValue() + (floatValue - 90.0f);
        long j2 = this.f10649i;
        Stroke stroke = this.f10644b;
        if (StrokeCap.a(stroke.f15149c, 0)) {
            f2 = 0.0f;
        } else {
            f2 = ((this.f10648h / (ProgressIndicatorKt.e / 2)) * 57.29578f) / 2.0f;
        }
        ProgressIndicatorKt.h(drawScope, f2 + floatValue3, Math.max(abs, 0.1f), j2, stroke);
        return b0.f30125a;
    }
}
