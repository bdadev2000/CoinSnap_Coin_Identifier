package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CheckboxKt$CheckboxImpl$checkDrawFraction$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$1 f8222a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Transition.Segment segment = (Transition.Segment) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(1373301606);
        Object c2 = segment.c();
        ToggleableState toggleableState = ToggleableState.f16873b;
        Object d = c2 == toggleableState ? AnimationSpecKt.d(100, 0, null, 6) : segment.a() == toggleableState ? new SnapSpec(100) : AnimationSpecKt.c(0.0f, 0.0f, null, 7);
        composer.D();
        return d;
    }
}
