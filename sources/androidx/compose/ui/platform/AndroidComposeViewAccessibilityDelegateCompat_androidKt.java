package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    public static final boolean a(SemanticsNode semanticsNode) {
        SemanticsConfiguration i2 = semanticsNode.i();
        return !i2.f16815a.containsKey(SemanticsProperties.f16839j);
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        return semanticsNode.f16821c.f15960v == LayoutDirection.f17495b;
    }

    public static final LayoutNode c(LayoutNode layoutNode, q0.l lVar) {
        for (LayoutNode B = layoutNode.B(); B != null; B = B.B()) {
            if (((Boolean) lVar.invoke(B)).booleanValue()) {
                return B;
            }
        }
        return null;
    }
}
