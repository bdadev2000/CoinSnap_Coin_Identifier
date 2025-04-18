package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class PullToRefreshKt$rememberPullToRefreshState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final PullToRefreshKt$rememberPullToRefreshState$1 f13167a = new r(0);

    @Override // q0.a
    public final Object invoke() {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.f2340a, null, 12));
    }
}
