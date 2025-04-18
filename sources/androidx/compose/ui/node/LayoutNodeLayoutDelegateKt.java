package androidx.compose.ui.node;

/* loaded from: classes4.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final boolean a(LayoutNode layoutNode) {
        if (layoutNode.f15944f != null) {
            LayoutNode B = layoutNode.B();
            if ((B != null ? B.f15944f : null) == null || layoutNode.C.f15981b) {
                return true;
            }
        }
        return false;
    }
}
