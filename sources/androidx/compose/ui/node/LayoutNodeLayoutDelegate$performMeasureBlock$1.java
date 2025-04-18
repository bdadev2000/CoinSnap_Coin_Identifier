package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LayoutNodeLayoutDelegate$performMeasureBlock$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f16052a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performMeasureBlock$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        super(0);
        this.f16052a = layoutNodeLayoutDelegate;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f16052a;
        layoutNodeLayoutDelegate.a().V(layoutNodeLayoutDelegate.f15997t);
        return b0.f30125a;
    }
}
