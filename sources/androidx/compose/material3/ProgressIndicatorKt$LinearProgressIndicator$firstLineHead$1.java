package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 f10733a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        keyframesSpecConfig.f2132a = 1800;
        keyframesSpecConfig.a(0, Float.valueOf(0.0f)).f2129b = ProgressIndicatorKt.f10612f;
        keyframesSpecConfig.a(750, Float.valueOf(1.0f));
        return b0.f30125a;
    }
}
