package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes4.dex */
final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f5118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f5119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f5120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(MutableState mutableState, MutableState mutableState2, a aVar) {
        super(0);
        this.f5118a = mutableState;
        this.f5119b = mutableState2;
        this.f5120c = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        return new PagerLayoutIntervalContent((q0.r) this.f5118a.getValue(), (l) this.f5119b.getValue(), ((Number) this.f5120c.invoke()).intValue());
    }
}
