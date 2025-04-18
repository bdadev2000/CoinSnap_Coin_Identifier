package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class ScrollState$canScrollBackward$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollState f2873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$canScrollBackward$2(ScrollState scrollState) {
        super(0);
        this.f2873a = scrollState;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(this.f2873a.f2865a.g() > 0);
    }
}
