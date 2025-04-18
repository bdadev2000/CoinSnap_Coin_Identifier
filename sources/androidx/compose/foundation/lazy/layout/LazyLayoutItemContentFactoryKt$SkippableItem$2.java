package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyLayoutItemContentFactoryKt$SkippableItem$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemProvider f4789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4791c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactoryKt$SkippableItem$2(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2, Object obj2, int i3) {
        super(2);
        this.f4789a = lazyLayoutItemProvider;
        this.f4790b = obj;
        this.f4791c = i2;
        this.d = obj2;
        this.f4792f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyLayoutItemContentFactoryKt.a(this.f4789a, this.f4790b, this.f4791c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f4792f | 1));
        return b0.f30125a;
    }
}
