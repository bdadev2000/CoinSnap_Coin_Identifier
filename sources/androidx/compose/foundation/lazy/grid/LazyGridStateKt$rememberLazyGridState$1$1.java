package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyGridStateKt$rememberLazyGridState$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridStateKt$rememberLazyGridState$1$1(int i2, int i3) {
        super(0);
        this.f4640a = i2;
        this.f4641b = i3;
    }

    @Override // q0.a
    public final Object invoke() {
        return new LazyGridState(this.f4640a, this.f4641b);
    }
}
