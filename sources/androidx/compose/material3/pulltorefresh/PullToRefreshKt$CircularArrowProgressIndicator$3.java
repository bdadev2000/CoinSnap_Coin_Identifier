package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PullToRefreshKt$CircularArrowProgressIndicator$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f13148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$3(a aVar, long j2, int i2) {
        super(2);
        this.f13148a = aVar;
        this.f13149b = j2;
        this.f13150c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f13150c | 1);
        PullToRefreshKt.a(this.f13148a, this.f13149b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
