package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.q;

/* loaded from: classes.dex */
final class TooltipKt$animateTooltip$2$scale$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final TooltipKt$animateTooltip$2$scale$2 f12556a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(386845748);
        TweenSpec d = ((Transition.Segment) obj).d(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.d(Opcodes.FCMPG, 0, EasingKt.f2084b, 2) : AnimationSpecKt.d(75, 0, EasingKt.f2084b, 2);
        composer.D();
        return d;
    }
}
