package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final PullToRefreshStateImpl$Companion$Saver$2 f13196a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(((Number) obj).floatValue()), VectorConvertersKt.f2340a, null, 12));
    }
}
