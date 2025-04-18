package androidx.compose.animation.core;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt$FloatToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final VectorConvertersKt$FloatToVector$1 f2351a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new AnimationVector1D(((Number) obj).floatValue());
    }
}
