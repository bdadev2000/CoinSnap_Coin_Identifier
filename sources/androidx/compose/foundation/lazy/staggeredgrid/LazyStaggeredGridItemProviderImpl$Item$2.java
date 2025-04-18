package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyStaggeredGridItemProviderImpl$Item$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridItemProviderImpl f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4946c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderImpl$Item$2(LazyStaggeredGridItemProviderImpl lazyStaggeredGridItemProviderImpl, int i2, Object obj, int i3) {
        super(2);
        this.f4944a = lazyStaggeredGridItemProviderImpl;
        this.f4945b = i2;
        this.f4946c = obj;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i2 = this.f4945b;
        Object obj3 = this.f4946c;
        this.f4944a.h(i2, obj3, (Composer) obj, a2);
        return b0.f30125a;
    }
}
