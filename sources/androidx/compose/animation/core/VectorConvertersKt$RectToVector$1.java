package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$RectToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$RectToVector$1 f2361a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        return new AnimationVector4D(rect.f14914a, rect.f14915b, rect.f14916c, rect.d);
    }
}
