package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class PullToRefreshKt$PullToRefreshBox$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f13152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$PullToRefreshBox$1(PullToRefreshState pullToRefreshState, boolean z2) {
        super(3);
        this.f13152a = pullToRefreshState;
        this.f13153b = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope boxScope = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(boxScope) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            PullToRefreshDefaults.f13121a.a(this.f13152a, this.f13153b, boxScope.a(Modifier.Companion.f14687a, Alignment.Companion.f14660b), 0L, 0L, 0.0f, composer, 1572864, 56);
        }
        return b0.f30125a;
    }
}
