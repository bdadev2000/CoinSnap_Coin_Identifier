package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 f1819a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((TransformOrigin) obj).f15061a;
        return new AnimationVector2D(TransformOrigin.b(j2), TransformOrigin.c(j2));
    }
}
