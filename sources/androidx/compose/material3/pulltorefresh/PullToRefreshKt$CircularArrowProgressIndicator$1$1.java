package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import w0.d;

/* loaded from: classes.dex */
final class PullToRefreshKt$CircularArrowProgressIndicator$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f13144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$1$1(a aVar) {
        super(1);
        this.f13144a = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj, new ProgressBarRangeInfo(((Number) this.f13144a.invoke()).floatValue(), new d(0.0f, 1.0f), 0));
        return b0.f30125a;
    }
}
