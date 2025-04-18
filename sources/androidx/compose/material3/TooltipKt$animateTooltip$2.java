package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class TooltipKt$animateTooltip$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f12554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$animateTooltip$2(Transition transition) {
        super(3);
        this.f12554a = transition;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1498516085);
        TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = TooltipKt$animateTooltip$2$scale$2.f12556a;
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
        Transition transition = this.f12554a;
        boolean booleanValue = ((Boolean) transition.f2267a.a()).booleanValue();
        composer.J(-1553362193);
        float f2 = booleanValue ? 1.0f : 0.8f;
        composer.D();
        Float valueOf = Float.valueOf(f2);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.d;
        boolean booleanValue2 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        composer.J(-1553362193);
        float f3 = booleanValue2 ? 1.0f : 0.8f;
        composer.D();
        Transition.TransitionAnimationState c2 = TransitionKt.c(transition, valueOf, Float.valueOf(f3), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$scale$2.invoke(transition.f(), composer, 0), twoWayConverter, composer, 196608);
        TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = TooltipKt$animateTooltip$2$alpha$2.f12555a;
        boolean booleanValue3 = ((Boolean) transition.f2267a.a()).booleanValue();
        composer.J(2073045083);
        float f4 = booleanValue3 ? 1.0f : 0.0f;
        composer.D();
        Float valueOf2 = Float.valueOf(f4);
        boolean booleanValue4 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        composer.J(2073045083);
        float f5 = booleanValue4 ? 1.0f : 0.0f;
        composer.D();
        Modifier b2 = GraphicsLayerModifierKt.b(modifier, ((Number) c2.f2294k.getValue()).floatValue(), ((Number) c2.f2294k.getValue()).floatValue(), ((Number) TransitionKt.c(transition, valueOf2, Float.valueOf(f5), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$alpha$2.invoke(transition.f(), composer, 0), twoWayConverter, composer, 196608).f2294k.getValue()).floatValue(), 0.0f, 0.0f, null, false, 131064);
        composer.D();
        return b2;
    }
}
