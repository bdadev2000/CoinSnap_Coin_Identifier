package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class ScrollKt$rememberScrollState$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1$1(int i2) {
        super(0);
        this.f2849a = i2;
    }

    @Override // q0.a
    public final Object invoke() {
        return new ScrollState(this.f2849a);
    }
}
