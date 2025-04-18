package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.q;

/* loaded from: classes.dex */
final class PullToRefreshDefaults$Indicator$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f13125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshDefaults$Indicator$1$1(long j2, PullToRefreshState pullToRefreshState) {
        super(3);
        this.f13124a = j2;
        this.f13125b = pullToRefreshState;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.a(booleanValue) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else if (booleanValue) {
            composer.J(576835739);
            ProgressIndicatorKt.c(PullToRefreshKt.f13139a, 0, 390, 24, this.f13124a, 0L, composer, SizeKt.n(Modifier.Companion.f14687a, PullToRefreshKt.f13141c));
            composer.D();
        } else {
            composer.J(577079337);
            PullToRefreshState pullToRefreshState = this.f13125b;
            boolean I = composer.I(pullToRefreshState);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new PullToRefreshDefaults$Indicator$1$1$1$1(pullToRefreshState);
                composer.o(u2);
            }
            PullToRefreshKt.a((a) u2, this.f13124a, composer, 0);
            composer.D();
        }
        return b0.f30125a;
    }
}
