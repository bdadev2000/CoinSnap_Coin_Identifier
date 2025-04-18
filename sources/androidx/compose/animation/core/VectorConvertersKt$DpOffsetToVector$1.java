package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$DpOffsetToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$DpOffsetToVector$1 f2347a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((DpOffset) obj).f17487a;
        return new AnimationVector2D(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }
}
