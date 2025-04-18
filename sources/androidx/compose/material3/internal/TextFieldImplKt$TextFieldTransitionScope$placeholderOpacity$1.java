package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
public final class TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 f13103a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Transition.Segment segment = (Transition.Segment) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1154662212);
        InputPhase inputPhase = InputPhase.f12988a;
        InputPhase inputPhase2 = InputPhase.f12989b;
        Object d = segment.d(inputPhase, inputPhase2) ? AnimationSpecKt.d(67, 0, EasingKt.d, 2) : (segment.d(inputPhase2, inputPhase) || segment.d(InputPhase.f12990c, inputPhase2)) ? new TweenSpec(83, 67, EasingKt.d) : AnimationSpecKt.c(0.0f, 0.0f, null, 7);
        composer.D();
        return d;
    }
}
