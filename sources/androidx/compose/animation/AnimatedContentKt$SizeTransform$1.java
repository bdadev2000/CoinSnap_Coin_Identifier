package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class AnimatedContentKt$SizeTransform$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimatedContentKt$SizeTransform$1 f1662a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((IntSize) obj).f17493a;
        long j3 = ((IntSize) obj2).f17493a;
        Rect rect = VisibilityThresholdsKt.f2404a;
        return AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1);
    }
}
