package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
final class LazyLayoutSemanticsModifierNode$indexForKeyMapping$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f4854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$indexForKeyMapping$1(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        super(1);
        this.f4854a = lazyLayoutSemanticsModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f4854a.f4845o.invoke();
        int itemCount = lazyLayoutItemProvider.getItemCount();
        int i2 = 0;
        while (true) {
            if (i2 >= itemCount) {
                i2 = -1;
                break;
            }
            if (a.g(lazyLayoutItemProvider.c(i2), obj)) {
                break;
            }
            i2++;
        }
        return Integer.valueOf(i2);
    }
}
