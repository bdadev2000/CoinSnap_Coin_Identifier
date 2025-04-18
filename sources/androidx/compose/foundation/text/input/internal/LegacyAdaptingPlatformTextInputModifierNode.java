package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import b1.a2;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LegacyAdaptingPlatformTextInputModifierNode extends Modifier.Node implements PlatformTextInputModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode {

    /* renamed from: o, reason: collision with root package name */
    public LegacyPlatformTextInputServiceAdapter f6424o;

    /* renamed from: p, reason: collision with root package name */
    public LegacyTextFieldState f6425p;

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionManager f6426q;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6427r;

    public LegacyAdaptingPlatformTextInputModifierNode(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        ParcelableSnapshotMutableState f2;
        this.f6424o = legacyPlatformTextInputServiceAdapter;
        this.f6425p = legacyTextFieldState;
        this.f6426q = textFieldSelectionManager;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f6427r = f2;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        this.f6427r.setValue(nodeCoordinator);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final LegacyTextFieldState M1() {
        return this.f6425p;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final LayoutCoordinates S() {
        return (LayoutCoordinates) this.f6427r.getValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = this.f6424o;
        if (legacyPlatformTextInputServiceAdapter.f6446a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
        }
        legacyPlatformTextInputServiceAdapter.f6446a = this;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.f6424o.j(this);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final SoftwareKeyboardController getSoftwareKeyboardController() {
        return (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16442n);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16445q);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final TextFieldSelectionManager l1() {
        return this.f6426q;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final a2 p0(p pVar) {
        if (this.f14699n) {
            return kotlin.jvm.internal.e.v(S1(), null, 4, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this, pVar, null), 1);
        }
        return null;
    }
}
