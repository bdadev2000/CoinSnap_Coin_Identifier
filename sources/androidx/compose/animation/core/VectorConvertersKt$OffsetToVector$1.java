package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$OffsetToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$OffsetToVector$1 f2359a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        return new AnimationVector2D(Offset.g(j2), Offset.h(j2));
    }
}
