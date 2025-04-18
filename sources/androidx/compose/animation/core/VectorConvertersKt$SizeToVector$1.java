package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$SizeToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$SizeToVector$1 f2363a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Size) obj).f14923a;
        return new AnimationVector2D(Size.d(j2), Size.b(j2));
    }
}
