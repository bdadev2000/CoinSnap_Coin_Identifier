package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LayoutNode$_foldedChildren$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f15974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.f15974a = layoutNode;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f15974a.C;
        layoutNodeLayoutDelegate.f15995r.x = true;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.f16013u = true;
        }
        return b0.f30125a;
    }
}
