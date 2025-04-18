package androidx.compose.ui.node;

/* loaded from: classes2.dex */
public final class BackwardsCompatNodeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 f15889a = new Object();

    public static final boolean a(BackwardsCompatNode backwardsCompatNode) {
        TailModifierNode tailModifierNode = DelegatableNodeKt.f(backwardsCompatNode).B.d;
        p0.a.q(tailModifierNode, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return tailModifierNode.f16171o;
    }
}
