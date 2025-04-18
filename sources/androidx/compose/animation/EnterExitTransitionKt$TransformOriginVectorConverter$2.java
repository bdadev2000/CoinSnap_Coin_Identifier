package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 f1820a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return new TransformOrigin(TransformOriginKt.a(animationVector2D.f2040a, animationVector2D.f2041b));
    }
}
