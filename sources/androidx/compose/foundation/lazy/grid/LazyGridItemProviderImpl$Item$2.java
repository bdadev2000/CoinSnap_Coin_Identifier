package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyGridItemProviderImpl$Item$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridItemProviderImpl f4492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4494c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImpl$Item$2(LazyGridItemProviderImpl lazyGridItemProviderImpl, int i2, Object obj, int i3) {
        super(2);
        this.f4492a = lazyGridItemProviderImpl;
        this.f4493b = i2;
        this.f4494c = obj;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i2 = this.f4493b;
        Object obj3 = this.f4494c;
        this.f4492a.h(i2, obj3, (Composer) obj, a2);
        return b0.f30125a;
    }
}
