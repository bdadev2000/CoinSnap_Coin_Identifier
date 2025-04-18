package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPinnableItem f4828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(LazyLayoutPinnableItem lazyLayoutPinnableItem) {
        super(1);
        this.f4828a = lazyLayoutPinnableItem;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final LazyLayoutPinnableItem lazyLayoutPinnableItem = this.f4828a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LazyLayoutPinnableItem lazyLayoutPinnableItem2 = LazyLayoutPinnableItem.this;
                int g2 = lazyLayoutPinnableItem2.d.g();
                for (int i2 = 0; i2 < g2; i2++) {
                    lazyLayoutPinnableItem2.release();
                }
            }
        };
    }
}
