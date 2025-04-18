package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$IntOffsetToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$IntOffsetToVector$1 f2353a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((IntOffset) obj).f17489a;
        return new AnimationVector2D((int) (j2 >> 32), (int) (j2 & 4294967295L));
    }
}
