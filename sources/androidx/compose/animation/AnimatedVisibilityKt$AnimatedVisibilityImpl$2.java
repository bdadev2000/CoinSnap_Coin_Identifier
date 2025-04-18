package androidx.compose.animation;

import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2 f1764a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        EnterExitState enterExitState = (EnterExitState) obj2;
        return Boolean.valueOf(((EnterExitState) obj) == enterExitState && enterExitState == EnterExitState.f1808c);
    }
}
