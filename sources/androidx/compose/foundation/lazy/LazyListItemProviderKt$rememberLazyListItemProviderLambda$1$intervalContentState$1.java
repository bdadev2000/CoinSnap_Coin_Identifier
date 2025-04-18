package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes2.dex */
final class LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f4301a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1(MutableState mutableState) {
        super(0);
        this.f4301a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        return new LazyListIntervalContent((l) this.f4301a.getValue());
    }
}
