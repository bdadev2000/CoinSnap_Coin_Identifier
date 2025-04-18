package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class ScrollState$canScrollForward$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollState f2874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$canScrollForward$2(ScrollState scrollState) {
        super(0);
        this.f2874a = scrollState;
    }

    @Override // q0.a
    public final Object invoke() {
        ScrollState scrollState = this.f2874a;
        return Boolean.valueOf(scrollState.f2865a.g() < scrollState.d.g());
    }
}
