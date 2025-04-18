package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;

/* loaded from: classes4.dex */
final class TestTagNode extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public String f16599o;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        String str = this.f16599o;
        x0.n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16850u;
        x0.n nVar = SemanticsPropertiesKt.f16865a[13];
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, str);
    }
}
