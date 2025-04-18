package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$alpha$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final MenuKt$DropdownMenuContent$alpha$2 f9758a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1355418157);
        TweenSpec d = ((Transition.Segment) obj).d(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.d(30, 0, null, 6) : AnimationSpecKt.d(75, 0, null, 6);
        composer.D();
        return d;
    }
}
