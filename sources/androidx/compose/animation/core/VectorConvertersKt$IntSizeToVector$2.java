package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$IntSizeToVector$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$IntSizeToVector$2 f2356a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        int round = Math.round(animationVector2D.f2040a);
        if (round < 0) {
            round = 0;
        }
        int round2 = Math.round(animationVector2D.f2041b);
        return new IntSize(IntSizeKt.a(round, round2 >= 0 ? round2 : 0));
    }
}
