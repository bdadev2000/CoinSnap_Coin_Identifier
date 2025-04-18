package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
final class ClickableKt$hasScrollableContainer$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f2642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$hasScrollableContainer$1(b0 b0Var) {
        super(1);
        this.f2642a = b0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean z2;
        TraversableNode traversableNode = (TraversableNode) obj;
        b0 b0Var = this.f2642a;
        if (!b0Var.f30919a) {
            a.q(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            if (!((ScrollableContainerNode) traversableNode).f3425o) {
                z2 = false;
                b0Var.f30919a = z2;
                return Boolean.valueOf(!z2);
            }
        }
        z2 = true;
        b0Var.f30919a = z2;
        return Boolean.valueOf(!z2);
    }
}
