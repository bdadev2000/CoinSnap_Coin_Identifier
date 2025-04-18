package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.TraversableNode;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f4902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1(f0 f0Var) {
        super(1);
        this.f4902a = f0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TraversableNode traversableNode = (TraversableNode) obj;
        a.q(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
        LazyLayoutPrefetchState lazyLayoutPrefetchState = ((TraversablePrefetchStateNode) traversableNode).f4907o;
        f0 f0Var = this.f4902a;
        List list = (List) f0Var.f30930a;
        if (list != null) {
            list.add(lazyLayoutPrefetchState);
        } else {
            list = b1.f0.w(lazyLayoutPrefetchState);
        }
        f0Var.f30930a = list;
        return TraversableNode.Companion.TraverseDescendantsAction.f16173b;
    }
}
