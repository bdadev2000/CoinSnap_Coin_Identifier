package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$TabTransition$color$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final TabKt$TabTransition$color$2 f11793a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-899623535);
        TweenSpec tweenSpec = ((Transition.Segment) obj).d(Boolean.FALSE, Boolean.TRUE) ? new TweenSpec(Opcodes.FCMPG, 100, EasingKt.d) : AnimationSpecKt.d(100, 0, EasingKt.d, 2);
        composer.D();
        return tweenSpec;
    }
}
