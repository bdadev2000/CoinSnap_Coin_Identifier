package androidx.compose.material3.pulltorefresh;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f13151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1(a aVar) {
        super(0);
        this.f13151a = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(((Number) this.f13151a.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
    }
}
