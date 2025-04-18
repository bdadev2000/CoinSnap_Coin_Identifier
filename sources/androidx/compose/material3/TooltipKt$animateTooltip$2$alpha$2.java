package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.q;

/* loaded from: classes4.dex */
final class TooltipKt$animateTooltip$2$alpha$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final TooltipKt$animateTooltip$2$alpha$2 f12555a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-281714272);
        TweenSpec d = ((Transition.Segment) obj).d(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.d(Opcodes.FCMPG, 0, EasingKt.d, 2) : AnimationSpecKt.d(75, 0, EasingKt.d, 2);
        composer.D();
        return d;
    }
}
