package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;

/* loaded from: classes4.dex */
public interface SemanticsModifierNode extends DelegatableNode {
    void B(SemanticsConfiguration semanticsConfiguration);

    default boolean N1() {
        return false;
    }

    default boolean f0() {
        return false;
    }
}
