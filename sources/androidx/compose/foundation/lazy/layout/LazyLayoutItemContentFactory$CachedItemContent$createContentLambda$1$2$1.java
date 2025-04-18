package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f4785a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(1);
        this.f4785a = cachedItemContent;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.f4785a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LazyLayoutItemContentFactory.CachedItemContent.this.d = null;
            }
        };
    }
}
