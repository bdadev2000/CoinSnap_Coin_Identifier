package androidx.compose.foundation.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PagerLazyLayoutItemProvider$Item$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerLazyLayoutItemProvider f5202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5204c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLazyLayoutItemProvider$Item$2(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, Object obj, int i3) {
        super(2);
        this.f5202a = pagerLazyLayoutItemProvider;
        this.f5203b = i2;
        this.f5204c = obj;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i2 = this.f5203b;
        Object obj3 = this.f5204c;
        this.f5202a.h(i2, obj3, (Composer) obj, a2);
        return b0.f30125a;
    }
}
