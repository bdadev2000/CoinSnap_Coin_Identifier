package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyListStateKt$rememberLazyListState$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListStateKt$rememberLazyListState$1$1(int i2, int i3) {
        super(0);
        this.f4434a = i2;
        this.f4435b = i3;
    }

    @Override // q0.a
    public final Object invoke() {
        return new LazyListState(this.f4434a, this.f4435b);
    }
}
