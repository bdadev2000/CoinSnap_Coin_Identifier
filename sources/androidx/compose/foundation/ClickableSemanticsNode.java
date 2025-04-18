package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import q0.a;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ClickableSemanticsNode extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public boolean f2647o;

    /* renamed from: p, reason: collision with root package name */
    public String f2648p;

    /* renamed from: q, reason: collision with root package name */
    public Role f2649q;

    /* renamed from: r, reason: collision with root package name */
    public a f2650r;

    /* renamed from: s, reason: collision with root package name */
    public String f2651s;

    /* renamed from: t, reason: collision with root package name */
    public a f2652t;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        Role role = this.f2649q;
        if (role != null) {
            SemanticsPropertiesKt.r(semanticsConfiguration, role.f16789a);
        }
        String str = this.f2648p;
        ClickableSemanticsNode$applySemantics$1 clickableSemanticsNode$applySemantics$1 = new ClickableSemanticsNode$applySemantics$1(this);
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        semanticsConfiguration.b(SemanticsActions.f16794b, new AccessibilityAction(str, clickableSemanticsNode$applySemantics$1));
        if (this.f2652t != null) {
            SemanticsPropertiesKt.j(semanticsConfiguration, this.f2651s, new ClickableSemanticsNode$applySemantics$2(this));
        }
        if (this.f2647o) {
            return;
        }
        SemanticsPropertiesKt.e(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean N1() {
        return true;
    }
}
