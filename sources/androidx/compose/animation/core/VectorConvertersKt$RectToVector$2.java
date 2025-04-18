package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$RectToVector$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$RectToVector$2 f2362a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return new Rect(animationVector4D.f2045a, animationVector4D.f2046b, animationVector4D.f2047c, animationVector4D.d);
    }
}
