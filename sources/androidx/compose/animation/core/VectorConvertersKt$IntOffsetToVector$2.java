package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$IntOffsetToVector$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$IntOffsetToVector$2 f2354a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return new IntOffset(IntOffsetKt.a(Math.round(animationVector2D.f2040a), Math.round(animationVector2D.f2041b)));
    }
}
