package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPinnedItemList f4831c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(Object obj, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, p pVar, int i3) {
        super(2);
        this.f4829a = obj;
        this.f4830b = i2;
        this.f4831c = lazyLayoutPinnedItemList;
        this.d = pVar;
        this.f4832f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyLayoutPinnableItemKt.a(this.f4829a, this.f4830b, this.f4831c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f4832f | 1));
        return b0.f30125a;
    }
}
