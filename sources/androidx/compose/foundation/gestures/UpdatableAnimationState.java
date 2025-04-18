package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class UpdatableAnimationState {

    /* renamed from: f, reason: collision with root package name */
    public static final AnimationVector1D f3657f = new AnimationVector1D(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedAnimationSpec f3658a;

    /* renamed from: b, reason: collision with root package name */
    public long f3659b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public AnimationVector1D f3660c = f3657f;
    public boolean d;
    public float e;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public UpdatableAnimationState(AnimationSpec animationSpec) {
        this.f3658a = animationSpec.a(VectorConvertersKt.f2340a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b3 -> B:24:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(q0.l r18, q0.a r19, h0.g r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.a(q0.l, q0.a, h0.g):java.lang.Object");
    }
}
